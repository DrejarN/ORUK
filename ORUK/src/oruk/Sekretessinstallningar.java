package oruk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 */
public class Sekretessinstallningar extends javax.swing.JFrame {

    /**
     * Creates new form MittFlode
     */
    public Sekretessinstallningar() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProfil = new javax.swing.JButton();
        btnNotifikation = new javax.swing.JButton();
        btnSekretess = new javax.swing.JButton();
        menyBar = new javax.swing.JMenuBar();
        btnMittFlode = new javax.swing.JMenu();
        btnMinProfil = new javax.swing.JMenu();
        btnMeddelanden = new javax.swing.JMenu();
        btnDoodle = new javax.swing.JMenu();
        btnLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(203, 217, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));

        btnProfil.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnProfil.setText("Profilinställningar");

        btnNotifikation.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNotifikation.setText("Notifikationsinsällningar");

        btnSekretess.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSekretess.setText("Sekretessinställningar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnNotifikation, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnSekretess, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfil)
                    .addComponent(btnNotifikation)
                    .addComponent(btnSekretess))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );

        menyBar.setBackground(new java.awt.Color(47, 92, 168));
        menyBar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnMittFlode.setText("Mitt flöde");
        btnMittFlode.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMittFlode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMittFlodeActionPerformed(evt);
            }
        });
        menyBar.add(btnMittFlode);

        btnMinProfil.setText("Min profil");
        btnMinProfil.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMinProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinProfilActionPerformed(evt);
            }
        });
        menyBar.add(btnMinProfil);

        btnMeddelanden.setText("Meddelanden");
        btnMeddelanden.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMeddelanden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeddelandenActionPerformed(evt);
            }
        });
        menyBar.add(btnMeddelanden);

        btnDoodle.setText("Doodle");
        btnDoodle.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnDoodle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoodleActionPerformed(evt);
            }
        });
        menyBar.add(btnDoodle);

        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });
        menyBar.add(btnLoggaUt);

        setJMenuBar(menyBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMittFlodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMittFlodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMittFlodeActionPerformed

    private void btnMinProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinProfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinProfilActionPerformed

    private void btnMeddelandenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeddelandenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMeddelandenActionPerformed

    private void btnDoodleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoodleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoodleActionPerformed

    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sekretessinstallningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sekretessinstallningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sekretessinstallningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sekretessinstallningar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sekretessinstallningar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnDoodle;
    private javax.swing.JMenu btnLoggaUt;
    private javax.swing.JMenu btnMeddelanden;
    private javax.swing.JMenu btnMinProfil;
    private javax.swing.JMenu btnMittFlode;
    private javax.swing.JButton btnNotifikation;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnSekretess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menyBar;
    // End of variables declaration//GEN-END:variables
}
