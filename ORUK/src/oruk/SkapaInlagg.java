package oruk;

import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import oru.inf.*;
import javax.swing.*;
import java.util.*;

public class SkapaInlagg extends javax.swing.JFrame {
 
    private static InfDB db;
    private String mailadress;
    private static String filename;
    private byte[] photo;
    private String query1;
    private String query3;

    public SkapaInlagg(InfDB db) {
        initComponents();
        this.db = db;
        fylllista();
        setThisTitle();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\oruklogoliten.png"));
        this.mailadress = Huvudfonster.getAnvandarnamn();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtTitel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInlagg = new javax.swing.JTextArea();
        btnPublicera = new javax.swing.JButton();
        kategori = new javax.swing.JComboBox<>();
        lblKategori = new javax.swing.JLabel();
        btnBifogaFil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Titel");

        txtTitel.setBackground(new java.awt.Color(235, 243, 255));
        txtTitel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtInlagg.setBackground(new java.awt.Color(235, 243, 255));
        txtInlagg.setColumns(20);
        txtInlagg.setRows(5);
        jScrollPane1.setViewportView(txtInlagg);

        btnPublicera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPublicera.setText("Publicera inlägg");
        btnPublicera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPubliceraActionPerformed(evt);
            }
        });

        lblKategori.setText("Kategori");

        btnBifogaFil.setText("Bifoga fil");
        btnBifogaFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBifogaFilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBifogaFil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblKategori))))
                .addGap(37, 72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPublicera, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(lblKategori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBifogaFil))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPublicera)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void fylllista(){
        try{
            ArrayList<String> lista = db.fetchColumn("SELECT NAMN FROM KATEGORI");
            for(int i = 0; i < lista.size(); i++){
                kategori.addItem(lista.get(i));
            }
        }    
        catch(InfException e){            
        }
    }
    
    private void btnPubliceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPubliceraActionPerformed
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
         LocalDateTime now = LocalDateTime.now();  
         System.out.println(dtf.format(now));  
         String date = now.toString().substring(0,10);
         String time = now.toString().substring(11,19);
         
         String valdkategori = (String) kategori.getSelectedItem();
         String katid = "";
         String ettid = "";
         String ettaid = "";
         try{
             katid = db.fetchSingle("SELECT KID FROM KATEGORI WHERE NAMN = '"+valdkategori+"'");
             ettid = db.getAutoIncrement("INLAGG", "IID");
             ettaid = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"'");
         }
         catch(InfException e){
             JOptionPane.showConfirmDialog(null, "Hoppla");
         }         
         try{
             db.insert("INSERT INTO INLAGG VALUES ("+ettid+", '"+txtTitel.getText()+"', '"+txtInlagg.getText()+"', "+katid+", '"+date+"', '"+time+"')");
             //db.insert(query1);
             //db.insert(query3);
             db.insert("INSERT INTO GORA_INLAGG VALUES ("+ettaid+", "+ettid+")");
             this.setVisible(false);
             TaggaAnvandare taggaAnvandare = new TaggaAnvandare(db, ettid);
             taggaAnvandare.setVisible(true);
         }
         catch(InfException e){
             JOptionPane.showMessageDialog(null, "Kunde ej publicera inlägget");
         }
    }//GEN-LAST:event_btnPubliceraActionPerformed

    private void btnBifogaFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBifogaFilActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        String anvandare = Huvudfonster.getAnvandarnamn();
        String ettid = "";
        
        try{
             ettid = db.getAutoIncrement("INLAGG", "IID");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "fel");
        }
        
        try {
            String id1 = db.getAutoIncrement("BILD", "BID");

            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);

            }
            photo = bos.toByteArray();

            query1 = "INSERT INTO BILD VALUES(" + id1 + ", '" + photo + "')";
            query3 = "INSERT INTO INLAGG_BILD VALUES(" + id1 + ", "+ettid+")";

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_btnBifogaFilActionPerformed

    private void setThisTitle() {
        try {
            String anvandarnamn = Huvudfonster.getAnvandarnamn();
            String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandarnamn + "'");
            String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandarnamn + "'");
            setTitle("ORUK - Skapa ett nytt inlägg som " + fornamn + " " + efternamn);

        } catch (InfException ex) {
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBifogaFil;
    private javax.swing.JButton btnPublicera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtInlagg;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables
}
