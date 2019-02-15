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

    private static OrukDB db;
     
    //Här är startmetoden för hela systemet, den skapar anslutning till databasen och öppnar vårt huvudfönster.
    public static void main(String[] args) {
            
            db = new OrukDB("217.175.124.38"); // Här sker anslutning till databasen med klassen InfDB och sökvägen till vår databasfil.
     
        //new ORUK(db); // Här uppnas vårat startfönster.
        new Validering(db);// Här öppnar vi ett objekt av klassen Validering för att den klassen 
                           // ska få en anslutning till databasen och vara redo att validera våra metoder.
        //new Huvudfonster(db).setVisible(true);
        new LoggaIn(db).setVisible(true);
        //new nyAnvandare(db).setVisible(true);
        
        //new Validering(db); // Här öppnar vi ett objekt av klassen Validering för att den klassen 
        new Filhantering(db); // Öppnar objekt av klassen Filhantering
    }

}
