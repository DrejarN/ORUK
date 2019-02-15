/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Laptop
 */
public class MinProfil extends javax.swing.JPanel {

    private static OrukDB db;
    private Box box;

    /**
     * Creates new form MinProfil1
     */
    public MinProfil(OrukDB db) throws SQLException, IOException, ClassNotFoundException {
        initComponents();
        this.db = db;

        //bild.setIcon(Profilinstallningar.getBild());
        setProfil();
        box = new Box(BoxLayout.Y_AXIS);
        jScrollPane1.setViewportView(box);
        skapaArrayList();

    }

    private void setProfil() throws SQLException, IOException, ClassNotFoundException {
        try {
            String anvandare = Huvudfonster.getAnvandarnamn();
            String enStrang1 = "SELECT FORNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String query1 = db.fetchSingle(enStrang1);
            String enStrang2 = "SELECT EFTERNAMN FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String query2 = db.fetchSingle(enStrang2);
            String enStrang3 = "SELECT TELEFONNUMMER FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String query3 = db.fetchSingle(enStrang3);
            String enStrang4 = "SELECT MAILADRESS FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String query4 = db.fetchSingle(enStrang4);
            String enStrang5 = "SELECT TITEL FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String query5 = db.fetchSingle(enStrang5);

            lblFornamn.setText(query1);
            lblEfternamn.setText(query2);
            lblEPost.setText(query4);
            lblTelefon.setText(query3);
            lblTitel.setText(query5);

            try {
                byte[] imageBytes;
                Image image;
                Class.forName("org.firebirdsql.jdbc.FBDriver");
                Connection con = DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:/Users/christianrudolphi/NetBeansProjects/ORUK/ORUK/ORUK.FDB", "sysdba", "masterkey");
                PreparedStatement ps = con.prepareStatement("SELECT BILDEN FROM BILD WHERE BID=(SELECT BID FROM PROFIL_BILD WHERE AID='" + anvandare + "')");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    imageBytes = rs.getBytes(1);
                    image = getToolkit().createImage(imageBytes);
                    ImageIcon icon = new ImageIcon(image);
                    Image img = icon.getImage().getScaledInstance(187, 187, 187);
                    ImageIcon bild1 = new ImageIcon(img);
                    bild.setIcon(bild1);

                }

            } catch (Exception e) {
            }

        } catch (InfException e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMinProfil = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInstallningar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bild = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblFornamn = new javax.swing.JLabel();
        lblEfternamn = new javax.swing.JLabel();
        lblEPost = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblTitel = new javax.swing.JLabel();
        lblKommandeMoten = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        panelMinProfil.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnInstallningar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInstallningar.setText("Inställningar");
        btnInstallningar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstallningarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Förnamn:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Titel:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("E-postadress:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(bild)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(bild)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Telefon:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setText("Efternamn:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitel)
                            .addComponent(lblTelefon)
                            .addComponent(lblEPost)
                            .addComponent(lblEfternamn)
                            .addComponent(lblFornamn))
                        .addContainerGap(522, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInstallningar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblFornamn))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblEfternamn))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lblEPost))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblTelefon))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblTitel)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnInstallningar)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        lblKommandeMoten.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        lblKommandeMoten.setText("Kommande möten:");

        javax.swing.GroupLayout panelMinProfilLayout = new javax.swing.GroupLayout(panelMinProfil);
        panelMinProfil.setLayout(panelMinProfilLayout);
        panelMinProfilLayout.setHorizontalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinProfilLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addComponent(lblKommandeMoten)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelMinProfilLayout.setVerticalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblKommandeMoten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInstallningarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstallningarActionPerformed
        Installningar installningar = new Installningar(db);
        installningar.setVisible(true);
    }//GEN-LAST:event_btnInstallningarActionPerformed

    private void skapaArrayList() {
        try {
            String anvandareid = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '" + Huvudfonster.getAnvandarnamn() + "'");

            ArrayList listan = db.fetchColumn("SELECT MOTE.MID FROM MOTE\n"
                                    + "JOIN MOTE_DELTAGANDE ON MOTE.MID=MOTE_DELTAGANDE.MID\n"
                                    + "WHERE AID='" + anvandareid + "'");
            
            if (listan == null) {
                JPanel importeradPanel = new Aktivitetsinlagg("Du har inga inbokade möten");
                box.add(importeradPanel);
                box.revalidate();
               
                
            } 
            else {
                for (Object mote : listan) {
                    String rubrik = db.fetchSingle("SELECT RUBRIK FROM MOTE WHERE MID='" + mote + "'");
                    String datum = db.fetchSingle("SELECT DATUM FROM MOTE WHERE MID='" + mote + "'");
                    String tid = db.fetchSingle("SELECT TID FROM MOTE WHERE MID='" + mote + "'");
                    String text = db.fetchSingle("SELECT TEXT FROM MOTE WHERE MID='" + mote + "'");

                    JPanel importeradPanel = new Aktivitetsinlagg(rubrik, datum, tid, text);

                    box.add(importeradPanel);
                    box.revalidate();
                }
            }

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private ArrayList<JPanel> jpListan;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bild;
    private javax.swing.JButton btnInstallningar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEPost;
    private javax.swing.JLabel lblEfternamn;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblKommandeMoten;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JPanel panelMinProfil;
    // End of variables declaration//GEN-END:variables
}
