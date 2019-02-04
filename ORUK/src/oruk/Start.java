package oruk;


import java.io.File;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Christian Rudolphi & Mats Nilsson
 */
public class Start {

    private static InfDB db;
     
    //Här är startmetoden för hela systemet, den skapar anslutning till databasen och öppnar vårt huvudfönster.
    public static void main(String[] args) {
        
        //Skapar en string med den relativa sökvägen till vår databas
        String relativa = "/ORUK.FDB";
        //Skapar en temporär fil som låter oss köra metoden för att hitta den absoluta sökvägen till vår databas.
        File tempFile = new File("");
        String absoluta = tempFile.getAbsolutePath();

        String databasen = absoluta + relativa;

        try {
            db = new InfDB(databasen); // Här sker anslutning till databasen med klassen InfDB och sökvägen till vår databasfil.

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel"); //Här fångas eventuella fel med anslutning till databasen upp.

        }
        
        new ORUK(db); // Här uppnas vårat startfönster.
        new Validering(db);// Här öppnar vi ett objekt av klassen Validering för att den klassen 
                           // ska få en anslutning till databasen och vara redo att validera våra metoder.
        new Huvudfonster().setVisible(true);
        
        new Validering(db); // Här öppnar vi ett objekt av klassen Validering för att den klassen 
        new Filhantering(db); // Öppnar objekt av klassen Filhantering
    }

}
