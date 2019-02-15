
package oruk;

import oru.inf.*;
import java.util.*;
import javax.swing.*;

public class DoodleFrame extends javax.swing.JFrame {

    private String motesnamnet;
    private static OrukDB db;
    
    public DoodleFrame(OrukDB db, String namnet) {
        initComponents();
        this.db = db;
        this.motesnamnet = namnet;
        System.out.println(motesnamnet);
        txtTest.setText(motesnamnet);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMinProfil = new javax.swing.JPanel();
        txtTest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelMinProfil.setBackground(new java.awt.Color(255, 255, 255));
        panelMinProfil.setPreferredSize(new java.awt.Dimension(915, 592));

        txtTest.setText("hejhopp");

        javax.swing.GroupLayout panelMinProfilLayout = new javax.swing.GroupLayout(panelMinProfil);
        panelMinProfil.setLayout(panelMinProfilLayout);
        panelMinProfilLayout.setHorizontalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(txtTest)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        panelMinProfilLayout.setVerticalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(txtTest)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMinProfil;
    private javax.swing.JLabel txtTest;
    // End of variables declaration//GEN-END:variables
}
