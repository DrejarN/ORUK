
package oruk;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Doodle extends javax.swing.JPanel {

    private static InfDB db;
    private ArrayList<String> enLista;
    private ArrayList<String> lista1;
    private String motesnamn;
    private String etttid;
    private String tvatid;
    private String tretid;
    private String formatdatum1;
    private String formatdatum2;
    private String formatdatum3;
    private String motesID;
    
    public Doodle(InfDB db) {
        initComponents();
        this.db = db;
        this.enLista = new ArrayList<>();
        this.lista1 = new ArrayList<>();
        fylllista();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMinProfil = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        motesLista = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mRubrik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        datum1 = new org.jdesktop.swingx.JXDatePicker();
        datum2 = new org.jdesktop.swingx.JXDatePicker();
        datum3 = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tid1 = new javax.swing.JTextField();
        tid2 = new javax.swing.JTextField();
        tid3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        panelMinProfil.setBackground(new java.awt.Color(255, 255, 255));
        panelMinProfil.setPreferredSize(new java.awt.Dimension(915, 592));

        motesLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        motesLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motesListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(motesLista);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Gå vidare");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Möten");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Rubrik");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Mötesbeskrivning");

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Skapa mötesförslag");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        datum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datum1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setText("Datum och tid");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setText("Datum och tid");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setText("Datum och tid");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Skapa nytt möte");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Förlsag på datum och tid");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("YYYY/MM/DD");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("HH:MM:SS");

        javax.swing.GroupLayout panelMinProfilLayout = new javax.swing.GroupLayout(panelMinProfil);
        panelMinProfil.setLayout(panelMinProfilLayout);
        panelMinProfilLayout.setHorizontalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(mRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(datum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(datum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(tid2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(tid1)
                                    .addComponent(tid3)))
                            .addComponent(jButton2)))
                    .addComponent(jLabel3))
                .addGap(99, 99, 99))
        );
        panelMinProfilLayout.setVerticalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addComponent(mRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3))
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tid1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tid2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 24, Short.MAX_VALUE))
                            .addComponent(mText)))
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void datum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datum1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String MID = "";
        String formatdatum11 = "";
        String formatdatum22 = "";
        String formatdatum33 = "";
        try{
            MID = db.getAutoIncrement("MOTE", "MID");
            String aid = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"'");
            db.insert("INSERT INTO MOTE VALUES ("+MID+", '"+mRubrik.getText()+"', '"+mText.getText()+"', "+aid+", null, null)");
            JOptionPane.showMessageDialog(null, "Mötet har skapats");
            DateFormat formatDatum = new SimpleDateFormat("yyyy-MM-dd");
            formatdatum11 = formatDatum.format(datum1.getDate());
            formatdatum22 = formatDatum.format(datum2.getDate());
            formatdatum33 = formatDatum.format(datum3.getDate());
            this.formatdatum1 = formatdatum11;
            this.formatdatum2 = formatdatum22;
            this.formatdatum3 = formatdatum33;
            this.motesID = MID;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        this.etttid = tid1.getText();
        this.tvatid = tid2.getText();
        this.tretid = tid3.getText();
        try{
            new Inbjudningar(db, MID, etttid, tvatid, tretid, this.formatdatum1, this.formatdatum2, this.formatdatum3, this.motesID).setVisible(true);
        }
        catch(InfException e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DoodleFrame(db, motesnamn).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void motesListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motesListaMouseClicked
        this.motesnamn = motesLista.getSelectedValue();
    }//GEN-LAST:event_motesListaMouseClicked

    public void fylllista(){
         DefaultListModel model = new DefaultListModel();
        ArrayList<String> MID = null;
        
        try{
            MID = db.fetchColumn("SELECT MID FROM MOTE");
            }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try {
              for(int x = 0; x < MID.size(); x++){
            enLista = db.fetchColumn("SELECT RUBRIK FROM MOTE WHERE MID = "+MID.get(x));
            String svar = "";
            for (int i = 0; i < enLista.size(); i++) {
                svar = enLista.get(i) + "\n";
                model.addElement(svar);
            }
              
            
            motesLista.setModel(model);
        }} catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker datum1;
    private org.jdesktop.swingx.JXDatePicker datum2;
    private org.jdesktop.swingx.JXDatePicker datum3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mRubrik;
    private javax.swing.JTextField mText;
    private javax.swing.JList<String> motesLista;
    private javax.swing.JPanel panelMinProfil;
    private javax.swing.JTextField tid1;
    private javax.swing.JTextField tid2;
    private javax.swing.JTextField tid3;
    // End of variables declaration//GEN-END:variables
}
