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
public class LoggaUt extends javax.swing.JFrame {

    /**
     * Creates new form MittFlode
     */
    public LoggaUt() {
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
        jLabel1 = new javax.swing.JLabel();
        btnUtloggas = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        menyBar = new javax.swing.JMenuBar();
        btnMittFlode = new javax.swing.JMenu();
        btnMinProfil = new javax.swing.JMenu();
        btnMeddelanden = new javax.swing.JMenu();
        btnDoodle = new javax.swing.JMenu();
        btnLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(203, 217, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(237, 237, 255), new java.awt.Color(162, 162, 197), new java.awt.Color(125, 125, 162), new java.awt.Color(125, 125, 162)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Vill du logga ut?");

        btnUtloggas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUtloggas.setText("Logga ut");
        btnUtloggas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtloggasActionPerformed(evt);
            }
        });

        btnAvbryt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAvbryt.setText("Avbryt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUtloggas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAvbryt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnUtloggas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAvbryt)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnUtloggasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtloggasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUtloggasActionPerformed

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
            java.util.logging.Logger.getLogger(LoggaUt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoggaUt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoggaUt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoggaUt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoggaUt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JMenu btnDoodle;
    private javax.swing.JMenu btnLoggaUt;
    private javax.swing.JMenu btnMeddelanden;
    private javax.swing.JMenu btnMinProfil;
    private javax.swing.JMenu btnMittFlode;
    private javax.swing.JButton btnUtloggas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menyBar;
    // End of variables declaration//GEN-END:variables
}
