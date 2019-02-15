/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author carlf
 */
public class Inbjudningar extends javax.swing.JFrame {

    /**
     * Creates new form taggaAnvandare
     */
    public Inbjudningar(OrukDB db, String iid, String ett, String tva, String tre, String d1, String d2, String d3, String id) throws InfException {
        initComponents();
        this.db = db;
        this.iid = iid;
        ComboBoxAutoComplete.enable(cmbxAnvandarnamn);
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        fyllCmbxAnvandarnamn();
        String anvandare = Huvudfonster.getAnvandarnamn();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\oruklogoliten.png"));
        String aid = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'");       
        this.etttid = ett;
        this.tvatid = tva;
        this.tretid = tre;
        this.formatdatum1 = d1;
        this.formatdatum2 = d2;
        this.formatdatum3 = d3;
        this.motesID = id;
        System.out.println(this.formatdatum1 + " " + this.etttid + ":00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnKlar = new javax.swing.JButton();
        btnLaggTill = new javax.swing.JButton();
        cmbxAnvandarnamn = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnKlar.setText("Klar");
        btnKlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlarActionPerformed(evt);
            }
        });

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        cmbxAnvandarnamn.setEditable(true);
        cmbxAnvandarnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxAnvandarnamnActionPerformed(evt);
            }
        });

        jLabel1.setText("Bjud in personer till ditt möte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLaggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKlar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbxAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbxAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTill)
                    .addComponent(btnKlar))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnKlarActionPerformed

    private void cmbxAnvandarnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxAnvandarnamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxAnvandarnamnActionPerformed

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        try {
            String anvandare = cmbxAnvandarnamn.getSelectedItem().toString();
            String[] splited = anvandare.split(" ");
            String fornamn = splited[0].toString();
            String efternamn = splited[1].toString();
           
            String FID = db.getAutoIncrement("MOTE_FORFRAGA", "FID");
            int FID2 = Integer.parseInt(FID) + 1;
            int FID3 = FID2 + 1;
           
            String AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE FORNAMN = '"+fornamn+"' AND EFTERNAMN = '"+efternamn+"'");

                   db.insert("INSERT INTO MOTE_FORFRAGA VALUES ("+ FID + ", " + AID + ", " + this.motesID + ", null, '" + this.formatdatum1 + " " + this.etttid + ":00')");
                   db.insert("INSERT INTO MOTE_FORFRAGA VALUES ("+ FID2 + ", " + AID + ", " + this.motesID + ", null, '" + this.formatdatum2 + " " + this.tvatid + ":00')");
                   db.insert("INSERT INTO MOTE_FORFRAGA VALUES ("+ FID3 + ", " + AID + ", " + this.motesID + ", null, '" + this.formatdatum3 + " " + this.tretid + ":00')");
                
            JOptionPane.showMessageDialog(null, anvandare + " är inbjuden till ditt möte");
        } catch (InfException ex) {
            Logger.getLogger(TaggaAnvandare.class.getName()).log(Level.SEVERE, null, ex);       
    }//GEN-LAST:event_btnLaggTillActionPerformed
    
    } 
 //Metod som körs i konstruktorn för att fylla JComboBoxen med användarnamn
    private void fyllCmbxAnvandarnamn() {
        try {
            ArrayList listan = new ArrayList();
            listan = db.fetchColumn("SELECT MAILADRESS FROM ANVANDARE");
            ArrayList<String> allaAnvandare = new ArrayList<>();
            
            for (Object mailadress : listan) {
                String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE MAILADRESS='" + mailadress + "'");
                String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE MAILADRESS='" + mailadress + "'");
                String anvandare = fornamn + " " + efternamn;
                allaAnvandare.add(anvandare);
            }
            allaAnvandare.sort(String::compareToIgnoreCase);
            
            for (String namn : allaAnvandare) {
                cmbxAnvandarnamn.addItem(namn);
            }
            cmbxAnvandarnamn.setSelectedIndex(-1);
            
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());           
        }
    }

    private String etttid;
    private String tvatid;
    private String tretid;
    private OrukDB db;
    private String iid;
    private String formatdatum1;
    private String formatdatum2;
    private String formatdatum3;
    private String motesID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKlar;
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JComboBox<String> cmbxAnvandarnamn;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
