/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Laptop
 */
public class MittFlode extends javax.swing.JPanel {

    
    public MittFlode(InfDB db) {
        initComponents();
        this.db = db;
        box = new Box(BoxLayout.Y_AXIS);
        jScrollPane1.setViewportView(box);
        fyllCmbxTaggar();
        ComboBoxAutoComplete.enable(cmbxTaggar);
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

        panelFlode.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(176, 203, 247));

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

        btnUppdatera.setText("Uppdatera");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
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
                    .addComponent(btnUppdatera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            ArrayList listan = new ArrayList();
            listan = db.fetchColumn("SELECT IID FROM INLAGG WHERE KATEGORI=4");

            for (Object inlagg : listan) {
                JPanel importeradPanel = new BloggInlagg(db, inlagg.toString());
                importeradPanel.setVisible(true);
                box.add(importeradPanel);
                box.revalidate();
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
            ArrayList listan = new ArrayList();
            listan = db.fetchColumn("SELECT IID FROM INLAGG WHERE KATEGORI=3");

            for (Object inlagg : listan) {

                JPanel importeradPanel = new BloggInlagg(db, inlagg.toString());
                importeradPanel.setVisible(true);
                box.add(importeradPanel);
                box.revalidate();
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnFormellActionPerformed

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        if(btnFormell.isSelected()){
            btnFormell.doClick();
        }
        else if(btnFormell.isSelected()){
            btnInformell.doClick();
        }
        
    }//GEN-LAST:event_btnUppdateraActionPerformed

    private void fyllCmbxTaggar() {
        try {
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
    
    private static InfDB db;
    private Box box;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormell;
    private javax.swing.JButton btnForskning;
    private javax.swing.JButton btnInformell;
    private javax.swing.JButton btnUppdatera;
    private javax.swing.JComboBox<String> cmbxTaggar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFlode;
    // End of variables declaration//GEN-END:variables
}
