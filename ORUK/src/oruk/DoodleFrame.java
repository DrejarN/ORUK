
package oruk;

import java.awt.Toolkit;
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
        setTitle("ORUK - Doodle");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\oruklogoliten.png"));
        this.setLocationRelativeTo(null);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinProfilLayout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(txtTest)
                .addGap(319, 319, 319))
        );
        panelMinProfilLayout.setVerticalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinProfilLayout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(txtTest)
                .addGap(267, 267, 267))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMinProfil;
    private javax.swing.JLabel txtTest;
    // End of variables declaration//GEN-END:variables
}
