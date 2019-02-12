package oruk;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JFileChooser;

/**
 *
 * @author Christian Rudolphi & Mats Nilsson
 */
public class Validering {

    private static ArrayList<HashMap<String, String>> lista;
    private static InfDB db;
    private static ArrayList svar;

    public Validering(InfDB db) {
        this.lista = new ArrayList<>();
        this.svar = new ArrayList();
        this.db = db;
    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * ett heltal.
     */
    public static boolean arDetHeltal(JTextField ruta) {
        boolean resultat = true;

        try {
            String enStrang = ruta.getText();
            Integer.parseInt(enStrang);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ange ett heltal i sista rutan");
            resultat = false;
        }

        return resultat;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * förnamnet på en elev i databasen.
     */
    public static boolean finnsFornamnElev(JTextField ruta) {
        boolean finnsinte = true;

        String namn = ruta.getText();
        String fraga = "SELECT EFTERNAMN FROM ELEV WHERE FORNAMN='" + namn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Förnamnet gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * efternamnet på en elev i databasen.
     */
    public static boolean finnsEfternamnElev(JTextField ruta1, JTextField ruta2) {
        boolean finnsinte = true;

        String fornamn = ruta1.getText();
        String efternamn = ruta2.getText();
        String fraga = "SELECT FORNAMN FROM ELEV WHERE FORNAMN='" + fornamn + "' AND EFTERNAMN='" + efternamn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Efternamnet gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * ett elevhem i databasen.
     */
    public static boolean finnsElevhem(JTextField ruta) {
        boolean finnsinte = true;

        String namn = ruta.getText();
        String fraga = "SELECT ELEVHEM_ID FROM ELEVHEM WHERE ELEVHEMSNAMN='" + namn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Elevhemmet gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * förnamnet på en lärare i databasen.
     */
    public static boolean finnsFornamnLarare(JTextField ruta) {
        boolean finnsinte = true;

        String namn = ruta.getText();
        String fraga = "SELECT EFTERNAMN FROM LARARE WHERE FORNAMN='" + namn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Förnamnet gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * efternamnet på en lärare i databasen.
     */
    public static boolean finnsEfternamnLarare(JTextField ruta1, JTextField ruta2) {
        boolean finnsinte = true;

        String fornamn = ruta1.getText();
        String efternamn = ruta2.getText();
        String fraga = "SELECT LARAR_ID FROM LARARE WHERE FORNAMN='" + fornamn + "' AND EFTERNAMN='" + efternamn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Efternamnet gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är en
     * kurs i databasen.
     */
    public static boolean finnsKurs(JTextField ruta) {
        boolean finnsinte = true;

        String namn = ruta.getText();
        String fraga = "SELECT KURS_ID FROM KURS WHERE KURSNAMN='" + namn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Kursen gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * ett betyg i databasen.
     */
    public static boolean finnsBetyg(JTextField ruta) {
        boolean finnsinte = true;

        String namn = ruta.getText();
        String fraga = "SELECT BETYGSBESKRIVNING FROM BETYG WHERE BETYGSBETECKNING ='" + namn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Betygbeteckningen gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * ett ämne i databasen.
     */
    public static boolean finnsAmne(JTextField ruta) {
        boolean finnsinte = true;

        String namn = ruta.getText();
        String fraga = "SELECT AMNESBESKRIVNING FROM AMNE WHERE AMNESNAMN='" + namn + "'";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Ämnet gick inte att hitta.\nVänligen kontrollera din inmatning.\nTänk på att börja med stor bokstav.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är en
     * sovsal i databasen.
     */
    public static boolean finnsSovsal(JTextField ruta) {
        boolean finnsinte = true;

        String namn = ruta.getText();
        String fraga = "SELECT ELEVHEM FROM SOVSAL WHERE SOVSAL_ID=" + namn;

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                JOptionPane.showMessageDialog(null, "Sovsalen gick inte att hitta.\nVänligen kontrollera din inmatning.");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * ett datum skrivet i rätt format.
     */
    public static boolean arDetDatum(JTextField ruta) {
        boolean resultat = true;

        String enStrang = ruta.getText();

        try {

            LocalDate date = LocalDate.parse(enStrang);

        } catch (DateTimeParseException e) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Datuminmatningen är inkorrekt.\nVar vänligen kontrollera.\nDatumformatet ska se ut enligt följande : 2018-01-01");

        }

        return resultat;

    }

    /**
     * Kontrollmetod som tar två JTextFields som parameter och kollar om den är
     * en prefekt i databasen.
     */
    public static boolean finnsPrefekt(JTextField ruta1, JTextField ruta2) {
        boolean finnsinte = true;

        String namn = ruta1.getText();
        String efternamn = ruta2.getText();
        String fraga = "SELECT PREFEKT FROM ELEVHEM join ELEV on ELEV_ID = PREFEKT WHERE FORNAMN = '" + namn + "' and EFTERNAMN = '" + efternamn + "'";
        String fraga2 = "SELECT ELEVHEMSNAMN FROM ELEVHEM join ELEV on ELEV_ID = PREFEKT WHERE FORNAMN = '" + namn + "' and EFTERNAMN = '" + efternamn + "'";
        String svar = "";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {

            } else {
                svar = db.fetchSingle(fraga2);

                JOptionPane.showMessageDialog(null, "Eleven är prefekt för " + svar + ".\nByt till en annan prefekt och försök igen");
                finnsinte = false;
            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * tom eller om det man skriver in börjar med stor bokstav.
     */
    public static boolean arDetStorBokstav(JTextField ruta) {
        boolean finnsinte = false;

        String namn = ruta.getText();

        if (namn.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Du har lämnat en tom ruta");

        } else {

            if (Character.isUpperCase(namn.charAt(0))) {
                finnsinte = true;

            } else {
                JOptionPane.showMessageDialog(null, "Börja varje inmatning med stor bokstav");

            }

        }

        return finnsinte;
    }

    /**
     * Kontrollmetod som tar en JTextField som parameter och kollar om den är
     * tom.
     */
    public static boolean arRutanTom(JTextField ruta) {
        boolean resultat = true;
        String enString = ruta.getText();

        if (enString.isEmpty()) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Du får inte lämna en ruta tom");

        }

        return resultat;
    }

    /**
     * Kontrollmetod som tar tre JTextFields som parameter och kollar om en elev
     * redan har betyg i en kurs.
     */
    public static boolean harElevenBetygetRedan(JTextField ruta1, JTextField ruta2, JTextField ruta3) {
        boolean finnsinte = false;

        String fornamn = ruta1.getText();
        String efternamn = ruta2.getText();
        String kursnamn = ruta3.getText();
        String fraga = "SELECT KURSBETYG FROM HAR_BETYG_I WHERE ELEV_ID=(SELECT ELEV_ID FROM ELEV WHERE FORNAMN='" + fornamn + "' AND EFTERNAMN='" + efternamn + "') AND KURS_ID=(SELECT KURS_ID FROM KURS WHERE KURSNAMN='" + kursnamn + "')";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {

                finnsinte = true;

            } else {
                JOptionPane.showMessageDialog(null, "Eleven har redan betyg för kursen");

            }
        } catch (InfException ex) {
        }
        return finnsinte;

    }

    /**
     * Kontrollmetod som tar två JTextFields som parameter och kollar om en elev
     * har några registrerade kurser.
     */
    public static boolean harElevenKurser(JTextField ruta1, JTextField ruta2) {

        boolean finnsinte = true;
        String fornamn = ruta1.getText();
        String efternamn = ruta2.getText();
        String fraga = "SELECT KURS_ID FROM REGISTRERAD_PA WHERE ELEV_ID=(SELECT ELEV_ID FROM ELEV WHERE FORNAMN='" + fornamn + "' AND EFTERNAMN='" + efternamn + "')";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                finnsinte = false;
                JOptionPane.showMessageDialog(null, "Eleven har inga kurser registrerade.");

            }

        } catch (InfException ex) {

        }

        return finnsinte;

    }

    /**
     * Kontrollmetod som tar två JTextFields som parameter och kollar om en elev
     * har några registrerade betyg.
     */
    public static boolean harElevenBetyg(JTextField ruta1, JTextField ruta2) {

        boolean finnsinte = true;
        String fornamn = ruta1.getText();
        String efternamn = ruta2.getText();
        String fraga = "SELECT KURSBETYG FROM HAR_BETYG_I WHERE ELEV_ID=(SELECT ELEV_ID FROM ELEV WHERE FORNAMN='" + fornamn + "' AND EFTERNAMN='" + efternamn + "')";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                finnsinte = false;
                JOptionPane.showMessageDialog(null, "Eleven har inga betyg registrerade.");

            }

        } catch (InfException ex) {

        }

        return finnsinte;

    }

    /**
     * Kontrollmetod som tar två JTextFields som parameter och kollar om en
     * lärare har några registrerade kurser.
     */
    public static boolean harLärarenKurser(JTextField ruta1, JTextField ruta2) {

        boolean finnsinte = true;
        String fornamn = ruta1.getText();
        String efternamn = ruta2.getText();
        String fraga = "SELECT KURS_ID FROM KURS WHERE KURSLARARE=(SELECT LARAR_ID FROM LARARE WHERE FORNAMN='" + fornamn + "' AND EFTERNAMN='" + efternamn + "')";

        try {
            lista = db.fetchRows(fraga);
            if (lista == null) {
                finnsinte = false;
                JOptionPane.showMessageDialog(null, "Läraren har inga kurser registrerade");

            }

        } catch (InfException ex) {

        }

        return finnsinte;

    }

    //Validerings metod som undersöker om det angivna värdet är ett heltal
    public static boolean heltal(JTextField enruta) {
        boolean searching = true;

        try {
            String enString = enruta.getText();
            Integer.parseInt(enString);
            enruta.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ange ett heltal");
            searching = false;
        }
        return searching;
    }

    //Validerings metod som undersöker om det angivna värdet är en String
    public static boolean positivtTal(JTextField enruta) {
        boolean searching = true;
        if (enruta.getText().substring(0, 1).equals("-")) {
            searching = false;
            enruta.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Endast positiva värden");
        }
        return searching;
    }

    //Validerings metod som undersöker om det angivna int talet är positivt
    public static boolean enString(JTextField enruta) {
        boolean searching = true;
        if (!enruta.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(null, "Endast bokstäver mellan A-Z tillåtna");
            searching = false;
        }
        return searching;
    }

    //Validerings metod som undersöker om metoden retunerar ett svar eller inte.
    public static boolean kollaNullAL(ArrayList<String> resultat) {
        boolean searching = true;
        if (resultat.isEmpty()) {
            searching = false;
            JOptionPane.showMessageDialog(null, "Din sökning gav inga träffar. Försök med andra värden");
        }
        return searching;
    }

    //Valderings metod som kolla om en ArrayList<HaskMap<String,String>> är tom eller inte.
    public static boolean kollaNullSS(ArrayList<HashMap<String, String>> resultat) {
        boolean searching = true;
        if (resultat.isEmpty()) {
            searching = false;
            JOptionPane.showMessageDialog(null, "Din sökning gav inga träffar. Försök med andra värden");
        }
        return searching;
    }

    //Validerings metod 
    public static boolean kollaStringVarde(String enstring) {
        boolean searching = true;
        if (enstring == null) {
            searching = false;
        }
        return searching;
    }

    public static String toUpperCase(String enstring) {
        StringBuffer s = new StringBuffer();
        char ch = ' ';
        for (int i = 0; i < enstring.length(); i++) {
            if (ch == ' ' && enstring.charAt(i) != ' ') {
                s.append(Character.toUpperCase(enstring.charAt(i)));
            } else {
                s.append(enstring.charAt(i));
            }
            ch = enstring.charAt(i);
        }
        return s.toString().trim();
    }

    public static boolean file(JFileChooser fil) {
        boolean searching = true;
        if (fil.getName().isEmpty()) {
            searching = false;
        }
        return searching;
    }

    public static boolean file2(JFileChooser fil) {
        boolean searching = true;
        if (fil.getSelectedFile() == null) {
            searching = false;
        }
        return searching;
    }

    public static boolean sakertLosenord(JTextField ruta) {
        boolean ratt = false;
        String losenord = ruta.getText();
        boolean losenordLangd = losenord.length() >= 8 && losenord.length() <= 40;
        boolean losenordNummer = losenord.matches("(.*)[0-9](.*)");

        if (losenordLangd && losenordNummer) {
            ratt = true;

        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Ditt valda lösenord måste vara mellan 8-50 tecken och innehålla minst en siffra.");
        
        }

        return ratt;

    }
    public static boolean arRutornaTomma(JTextField ruta1, JTextField ruta2, JTextField ruta3, JTextField ruta4, JTextField ruta5, JTextField ruta6) {
        boolean resultat = false;
        String enString1 = ruta1.getText();
        String enString2 = ruta2.getText();
        String enString3 = ruta3.getText();
        String enString4 = ruta4.getText();
        String enString5 = ruta5.getText();
        String enString6 = ruta6.getText();

        if (enString1.isEmpty() && enString2.isEmpty() && enString3.isEmpty() && enString4.isEmpty() && enString5.isEmpty() && enString6.isEmpty()) {
            resultat = true;
            JOptionPane.showMessageDialog(null, "Rutorna är tom");

        }

        return resultat;
    }
}
