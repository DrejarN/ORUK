/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import javax.swing.JPanel;

/**
 *
 * @author Laptop
 */
public class MittFlode extends javax.swing.JPanel {

    /**
     * Creates new form MittFlode1
     */
    public MittFlode() {
        initComponents();
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
        btnFormell = new javax.swing.JButton();
        btnInformell = new javax.swing.JButton();
        btnForskning = new javax.swing.JButton();
        panel_Inlagg = new javax.swing.JPanel();
        btnKommentera = new javax.swing.JButton();
        textArea2 = new java.awt.TextArea();
        btnSkapaInlagg = new javax.swing.JButton();

        panelFlode.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(176, 203, 247));

        btnFormell.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFormell.setText("Formell blogg");
        btnFormell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormellActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFormell, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInformell, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForskning, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFormell)
                    .addComponent(btnInformell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnForskning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Inlagg.setBackground(new java.awt.Color(176, 203, 247));

        btnKommentera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnKommentera.setText("Kommentera inlägg");
        btnKommentera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKommenteraActionPerformed(evt);
            }
        });

        btnSkapaInlagg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSkapaInlagg.setText("Skapa inlägg");
        btnSkapaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaInlaggActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_InlaggLayout = new javax.swing.GroupLayout(panel_Inlagg);
        panel_Inlagg.setLayout(panel_InlaggLayout);
        panel_InlaggLayout.setHorizontalGroup(
            panel_InlaggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_InlaggLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_InlaggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_InlaggLayout.createSequentialGroup()
                        .addComponent(btnSkapaInlagg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKommentera)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_InlaggLayout.setVerticalGroup(
            panel_InlaggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_InlaggLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_InlaggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKommentera)
                    .addComponent(btnSkapaInlagg))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFlodeLayout = new javax.swing.GroupLayout(panelFlode);
        panelFlode.setLayout(panelFlodeLayout);
        panelFlodeLayout.setHorizontalGroup(
            panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFlodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Inlagg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        panelFlodeLayout.setVerticalGroup(
            panelFlodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFlodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(panel_Inlagg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
     
    }//GEN-LAST:event_btnForskningActionPerformed

    private void btnFormellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormellActionPerformed
        
    }//GEN-LAST:event_btnFormellActionPerformed

    private void btnInformellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformellActionPerformed

    private void btnSkapaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaInlaggActionPerformed
        SkapaInlagg skapaInlagg = new SkapaInlagg();
        skapaInlagg.setVisible(true);
    }//GEN-LAST:event_btnSkapaInlaggActionPerformed

    private void btnKommenteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKommenteraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKommenteraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormell;
    private javax.swing.JButton btnForskning;
    private javax.swing.JButton btnInformell;
    private javax.swing.JButton btnKommentera;
    private javax.swing.JButton btnSkapaInlagg;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelFlode;
    private javax.swing.JPanel panel_Inlagg;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
