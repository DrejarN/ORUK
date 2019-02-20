package oruk;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfException;

public class OrukDB {

    private Connection con;

    private HashMap<String, Object> param;
    private int advancedmode;
    private String ipAdress;
    private int kolla = 1;

    public OrukDB(String ipAdress) {
        this.ipAdress = ipAdress;
        kopplaUpp();

    }

    private void kopplaUpp() {
        try {

            loadDriver();
            initConnection();
        } catch (InfException ex) {
            Logger.getLogger(OrukDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.con == null) {
            try {
                
                loadDriver2();
                
                initConnection2();
                kolla = 2;
                JOptionPane.showMessageDialog(null, "Anslutning offline gjord");
            } catch (InfException ex) {
                Logger.getLogger(OrukDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }

    private void loadDriver()
            throws InfException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new InfException("Class/driver not found, add the library for Firebird in your current path (jaybird-full-XX.jar)");
        }
    }

    private void initConnection2()
            throws InfException {
        
        //Skapar en string med den relativa sökvägen till vår databas
        String relativa = "/ORUK.FDB";
        //Skapar en temporär fil som låter oss köra metoden för att hitta den absoluta sökvägen till vår databas.
        File tempFile = new File("");
        String absoluta = tempFile.getAbsolutePath();
        ipAdress = absoluta + relativa;
        
        try {                                                       
            this.con = DriverManager.getConnection("jdbc:firebirdsql://localhost:3050/" + ipAdress + "?columnLabelForName=true", "SYSDBA", "masterkey");
        } catch (SQLException e) {
            throw new InfException("Couldn't open Firebird database, check your path. Make sure to use .FDB in the end");
        }
    }

    private void loadDriver2()
            throws InfException {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver");
        } catch (ClassNotFoundException e) {
            throw new InfException("Class/driver not found, add the library for Firebird in your current path (jaybird-full-XX.jar)");
        }
    }

    private void initConnection()
            throws InfException {

        try {
            this.con = DriverManager.getConnection("jdbc:mysql://" + ipAdress + ":3306/ORUKDB?zeroDateTimeBehavior=convertToNull", "oruk", "masterkey");
        } catch (SQLException e) {
            throw new InfException("Får ingen anslutning med servern");
        }
    }
    
    public String getIP()
    {
        return ipAdress;
    
    }

    
    private void closeConnection()
            throws InfException {
        try {
            if (this.con != null) {
                this.con.close();
            }
        } catch (SQLException e) {
            throw new InfException("Couldn't close the connection to the database");
        }
    }

    private void checkConnection()
            throws InfException {
        try {
            if ((this.con == null) || (this.con.isClosed())) {
                if (kolla == 1) {
                    initConnection();
                } else {
                    initConnection2();
                }
            }
        } catch (SQLException e) {
            throw new InfException("A checkConnection to the database failed");
        }
    }

    public String fetchSingle(String query)
            throws InfException {
        String result = null;
        try {
            checkConnection();
            Statement sm = this.con.createStatement();
            boolean hasRS = sm.execute(query);
            if (hasRS) {
                ResultSet rs = sm.getResultSet();
                if (rs.next()) {
                    result = rs.getString(1);
                }
            }
        } catch (SQLException e) {
            throw new InfException("fetchSingle statement didn't work - check your query");
        } finally {
            closeConnection();
        }
        return result;
    }


    public void insertProfilImage(File file, String aid) throws InfException {
        String bid = getAutoIncrement("BILD", "BID");
        int bid2 = Integer.parseInt(bid);
        try {
            checkConnection();
            Statement st = con.createStatement();
            FileInputStream fin = new FileInputStream(file);

            PreparedStatement pre = con.prepareStatement("INSERT INTO BILD VALUES(?, ?)");

            pre.setInt(1, bid2);
            pre.setBinaryStream(2, (InputStream) fin, (int) file.length());
            pre.executeUpdate();
            System.out.println("Successfully inserted the file into the database!");
            
        } catch (FileNotFoundException | SQLException e1) {
            System.out.println(e1.getMessage());
        } finally {            
            closeConnection();
        }
        delete("DELETE FROM PROFIL_BILD WHERE AID=" + aid);
        insert("INSERT INTO PROFIL_BILD VALUES(" + aid + "," + bid2 + ")");
    }
    
    
    
    
    public void insertBlogImage(File file, String iid) throws InfException {
        String bid = getAutoIncrement("BILD", "BID");
        int bid2 = Integer.parseInt(bid);
        try {
            checkConnection();
            Statement st = con.createStatement();
            FileInputStream fin = new FileInputStream(file);

            PreparedStatement pre = con.prepareStatement("INSERT INTO BILD VALUES(?, ?)");

            pre.setInt(1, bid2);
            pre.setBinaryStream(2, (InputStream) fin, (int) file.length());
            pre.executeUpdate();
            System.out.println("Successfully inserted the file into the database!");
            
        } catch (FileNotFoundException | SQLException e1) {
            System.out.println(e1.getMessage());
        } finally {            
            closeConnection();
        }
        
        insert("INSERT INTO INLAGG_BILD VALUES(" + bid2 + "," + iid + ")");
    }
    
    

    public String retriveImage(String query){
         String svar = null;
        try {
            checkConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int i = 0;
            while (rs.next()) {
                InputStream in = rs.getBinaryStream(1);
                OutputStream f = new FileOutputStream(new File("bild" + i + ".jpg"));
                i++;
                int c = 0;
                while ((c = in.read()) > -1) {
                    f.write(c);
                }             
                f.close();
                in.close();
            }
        } catch (IOException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(svar);
        return svar;
    }

    public ArrayList<String> fetchColumn(String query)
            throws InfException {
        ArrayList<String> result = null;
        try {
            checkConnection();
            Statement sm = this.con.createStatement();
            ResultSet rs = sm.executeQuery(query);
            while (rs.next()) {
                if (result == null) {
                    result = new ArrayList();
                }
                result.add(rs.getString(1));
            }
        } catch (SQLException e) {
            throw new InfException("fetchColumn statement didn't work - check your query");
        } finally {
            closeConnection();
        }
        return result;
    }

    public HashMap<String, String> fetchRow(String query)
            throws InfException {
        HashMap<String, String> result = null;
        try {
            checkConnection();
            Statement sm = this.con.createStatement();
            ResultSet rs = sm.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int countColumns = rsmd.getColumnCount();
            int i = 1;
            if (rs.next()) {
                if (result == null) {
                    result = new HashMap();
                }
                while (i <= countColumns) {
                    result.put(rsmd.getColumnName(i), rs.getString(i));
                    i++;
                }
            }
        } catch (SQLException e) {
            throw new InfException("fetchRow statement didn't work - check your query");
        } finally {
            closeConnection();
        }
        return result;
    }

    public ArrayList<HashMap<String, String>> fetchRows(String query)
            throws InfException {
        ArrayList<HashMap<String, String>> result = null;
        try {
            checkConnection();
            Statement sm = this.con.createStatement();
            ResultSet rs = sm.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int countColumns = rsmd.getColumnCount();
            while (rs.next()) {
                if (result == null) {
                    result = new ArrayList();
                }
                int i = 1;
                HashMap<String, String> tempHM = new HashMap();
                while (i <= countColumns) {
                    tempHM.put(rsmd.getColumnName(i), rs.getString(i));
                    i++;
                }
                result.add(tempHM);
            }
        } catch (SQLException e) {
            throw new InfException("fetchRows statement didn't work - check your query");
        } finally {
            closeConnection();
        }
        return result;
    }

    public String getAutoIncrement(String table, String attribute)
            throws InfException {
        String result = null;
        String query = "SELECT " + attribute + " FROM " + table + " ORDER BY " + attribute + " DESC";
        try {
            checkConnection();
            Statement sm = this.con.createStatement();
            ResultSet rs = sm.executeQuery(query);
            if (rs.next()) {
                String inc = rs.getString(1);
                if ((inc.matches("\\D+\\d+")) || (inc.matches("\\d+\\D+"))) {
                    String[] ar = inc.split("");
                    String letters = "";
                    String numbers = "";
                    for (String anAr : ar) {
                        if (anAr.matches("\\D")) {
                            letters = letters + anAr;
                        } else if (anAr.matches("\\d")) {
                            numbers = numbers + anAr;
                        }
                    }
                    if (numbers.matches("\\d+")) {
                        int lastInt = Integer.parseInt(numbers);
                        lastInt++;
                        if (inc.matches("\\D+\\d+")) {
                            result = letters + lastInt;
                        } else {
                            result = lastInt + letters;
                        }
                    }
                } else if (inc.matches("\\d+")) {
                    int lastInt = Integer.parseInt(inc);
                    lastInt++;
                    result = "" + lastInt;
                }
            }
        } catch (SQLException e) {
            throw new InfException("getAutoIncrement statement didn't work - check your query, works with columns containing numbers, letters+numbers or numbers+letters");
        } finally {
            closeConnection();
        }
        return result;
    }

    private void mod(String query)
            throws InfException {
        try {
            checkConnection();
            Statement sm = this.con.createStatement();
            sm.executeUpdate(query);
        } catch (SQLException e) {
            throw new InfException(e);
        } finally {
            closeConnection();
        }
    }

    public void insert(String query)
            throws InfException {
        if (query.toLowerCase().startsWith("insert into")) {
            mod(query);
        } else {
            throw new InfException("Not valid INSERT query - check your query");
        }
    }

    public void delete(String query)
            throws InfException {
        if (query.toLowerCase().startsWith("delete from")) {
            mod(query);
        } else {
            throw new InfException("Not valid DELETE query - check your query");
        }
    }

    public void update(String query)
            throws InfException {
        if ((query.toLowerCase().startsWith("update")) && (query.toLowerCase().contains("set"))) {
            mod(query);
        } else {
            throw new InfException("Not valid UPDATE query - check your query");
        }
    }

}
