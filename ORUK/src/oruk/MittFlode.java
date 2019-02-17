/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfException;
import static oruk.AdminTaBortKommentar.fyllLista;

/**
 *
 * @author Laptop
 */
public class MittFlode extends javax.swing.JPanel {

    public MittFlode(OrukDB db) {
        initComponents();
        this.db = db;
        box = new Box(BoxLayout.Y_AXIS);
        jScrollPane1.setViewportView(box);
        fyllCmbxTaggar();
        ComboBoxAutoComplete.enable(cmbxTaggar);
        kollaAdmin();
    }

    public void kollaAdmin() {
        try {
            String anvandare = Huvudfonster.getAnvandarnamn();
            btnRedigera.setVisible(false);
            btnTaBort.setVisible(false);

            String data = "SELECT GRAD FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String data1 = db.fetchSingle(data);

            if (data1.equals("S") || data1.equals("A")) {
                btnRedigera.setVisible(true);
                btnTaBort.setVisible(true);

            }

        } catch (InfException ex) {

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

        panelFlode = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInformell = new javax.swing.JButton();
        btnForskning = new javax.swing.JButton();
        btnFormell = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        cmbxTaggar = new javax.swing.JComboBox<>();
        btnUppdatera = new javax.swing.JButton();
        btnRedigera = new javax.swing.JButton();
        btnTaBort = new javax.swing.JButton();

        panelFlode.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnInformell.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInformell.setText("Informell blogg");
        btnInformell.setPreferredSize(new java.awt.Dimension(230, 40));
        btnInformell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformellActionPerformed(evt);
            }
        });

        btnForskning.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnForskning.setText("Forskning & Utbildning");
        btnForskning.setPreferredSize(new java.awt.Dimension(230, 40));
        btnForskning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForskningActionPerformed(evt);
            }
        });

        btnFormell.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFormell.setText("Formell blogg");
        btnFormell.setPreferredSize(new java.awt.Dimension(230, 40));
        btnFormell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFormell, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInformell, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForskning, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInformell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnForskning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFormell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setText("Visa inlägg taggat med:");

        cmbxTaggar.setEditable(true);
        cmbxTaggar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTaggarActionPerformed(evt);
            }
        });

        btnUppdatera.setText("Uppdatera");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        btnRedigera.setText("Redigera");
        btnRedigera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedigeraActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta Bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFlodeLayout = new javax.swing.GroupLayout(panelFlode);
        panelFlode.setLayout(panelFlodeLayout);
        panelFlodeLayout.setHorizontalGroup(
            panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFlodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFlodeLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(panelFlodeLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(panelFlodeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbxTaggar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUppdatera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRedigera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaBort)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelFlodeLayout.setVerticalGroup(
            panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFlodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbxTaggar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUppdatera)
                    .addComponent(btnRedigera)
                    .addComponent(btnTaBort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFlode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFlode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnForskningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForskningActionPerformed
        btnForskning.setSelected(true);
        btnFormell.setSelected(false);
        btnInformell.setSelected(false);
        jScrollPane1.repaint();
        box.removeAll();
        JPanel importeradPanel = new ForskningUtbildningAnslag(db);
        box.add(importeradPanel);
        box.revalidate();
        //importeradPanel.setBounds(panel_Inlagg.getBounds());
        //panel_Inlagg.removeAll();
        //panel_Inlagg.revalidate();
        //panel_Inlagg.repaint();
        //panel_Inlagg.add(importeradPanel);
        //importeradPanel.setLocation(1, 1);     
    }//GEN-LAST:event_btnForskningActionPerformed

    private void btnInformellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformellActionPerformed
        try {
            btnForskning.setSelected(false);
            btnFormell.setSelected(false);
            btnInformell.setSelected(true);
            jScrollPane1.repaint();
            box.removeAll();

            if (cmbxTaggar.getSelectedItem().equals("Allt")) {
                ArrayList listan = db.fetchColumn("SELECT IID FROM INLAGG WHERE KATEGORI=4");

                for (Object inlagg : listan) {

                    JPanel importeradPanel = new BloggInlagg(db, inlagg.toString());
                    importeradPanel.setVisible(true);
                    box.add(importeradPanel);
                    box.revalidate();
                }
            } else {
                String taggnamn = cmbxTaggar.getSelectedItem().toString();
                String taggid = db.fetchSingle("SELECT TID FROM TAGG WHERE NAMN='" + taggnamn + "'");
                ArrayList listan2 = db.fetchColumn("SELECT INLAGG.IID FROM INLAGG \n"
                        + "JOIN INLAGG_TAGG ON INLAGG_TAGG.IID=INLAGG.IID \n"
                        + "WHERE INLAGG.KATEGORI='4'AND INLAGG_TAGG.TID='" + taggid + "'");

                for (Object inlagg : listan2) {

                    JPanel importeradPanel = new BloggInlagg(db, inlagg.toString());
                    importeradPanel.setVisible(true);
                    box.add(importeradPanel);
                    box.revalidate();
                }
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnInformellActionPerformed

    private void btnFormellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormellActionPerformed
        try {
            btnForskning.setSelected(false);
            btnFormell.setSelected(true);
            btnInformell.setSelected(false);
            jScrollPane1.repaint();
            box.removeAll();

            if (cmbxTaggar.getSelectedItem().equals("Allt")) {
                ArrayList listan = db.fetchColumn("SELECT IID FROM INLAGG WHERE KATEGORI=3");

                for (Object inlagg : listan) {

                    JPanel importeradPanel = new BloggInlagg(db, inlagg.toString());
                    importeradPanel.setVisible(true);
                    box.add(importeradPanel);
                    box.revalidate();
                }
            } else {
                String taggnamn = cmbxTaggar.getSelectedItem().toString();
                String taggid = db.fetchSingle("SELECT TID FROM TAGG WHERE NAMN='" + taggnamn + "'");
                ArrayList listan2 = db.fetchColumn("SELECT INLAGG.IID FROM INLAGG \n"
                        + "JOIN INLAGG_TAGG ON INLAGG_TAGG.IID=INLAGG.IID \n"
                        + "WHERE INLAGG.KATEGORI='3'AND INLAGG_TAGG.TID='" + taggid + "'");

                for (Object inlagg : listan2) {

                    JPanel importeradPanel = new BloggInlagg(db, inlagg.toString());
                    importeradPanel.setVisible(true);
                    box.add(importeradPanel);
                    box.revalidate();
                }
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnFormellActionPerformed

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        if (btnFormell.isSelected()) {
            btnFormell.doClick();
        } else if (btnInformell.isSelected()) {
            btnInformell.doClick();
        }

    }//GEN-LAST:event_btnUppdateraActionPerformed

    private void btnRedigeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedigeraActionPerformed
        String tagg = cmbxTaggar.getSelectedItem().toString();
        new AdminRedigeraTagg(db, tagg).setVisible(true);
    }//GEN-LAST:event_btnRedigeraActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        try {

            int response = JOptionPane.showConfirmDialog(null, "Vill du ta bort taggen?", "Ta bort tagg",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {

            } else if (response == JOptionPane.YES_OPTION) {

                String tagg = cmbxTaggar.getSelectedItem().toString();
                String andraData1 = "DELETE FROM INLAGG_TAGG WHERE TID=(SELECT TID FROM TAGG WHERE NAMN='" + tagg + "')";
                String andraData2 = "DELETE FROM TAGG WHERE NAMN='" + tagg + "'";
                db.delete(andraData1);
                db.delete(andraData2);
                JOptionPane.showMessageDialog(null, "Taggen har tagits bort");
                fyllCmbxTaggar();
            }}catch (InfException ex) {
            Logger.getLogger(MittFlode.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnTaBortActionPerformed

    private void cmbxTaggarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTaggarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxTaggarActionPerformed

    

    public static void fyllCmbxTaggar() {
        try {
            cmbxTaggar.removeAllItems();
            cmbxTaggar.addItem("Allt");
            ArrayList listan = new ArrayList();
            listan = db.fetchColumn("SELECT NAMN FROM TAGG");
            ArrayList<String> allaTaggar = new ArrayList<>();

            for (Object mailadress : listan) {
                String anvandare = mailadress.toString();
                allaTaggar.add(anvandare);
            }
            allaTaggar.sort(String::compareToIgnoreCase);

            for (String namn : allaTaggar) {
                cmbxTaggar.addItem(namn);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private static OrukDB db;
    private Box box;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormell;
    private javax.swing.JButton btnForskning;
    private javax.swing.JButton btnInformell;
    private javax.swing.JButton btnRedigera;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton btnUppdatera;
    private static javax.swing.JComboBox<String> cmbxTaggar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFlode;
    // End of variables declaration//GEN-END:variables
}
