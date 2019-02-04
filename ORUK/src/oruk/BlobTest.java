package oruk;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author christianrudolphi
 */
public class BlobTest {

    private static InfDB db;
    private String filename;
    private byte[] photo;

    public BlobTest(InfDB db) {
        this.db = db;

    }

    public void valjBild() throws InfException {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();

        try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);

            }
            photo = bos.toByteArray();

            String query = "INSERT INTO BILD VALUES(2," + photo + ")";
            db.insert(query);

        } catch (IOException e) {

        }

    }

    

}


