
package oruk;

import oru.inf.*;
import javax.swing.*;

public class NyAnvandare extends javax.swing.JFrame {


    private static InfDB db;
    
    public NyAnvandare(InfDB db) {
        initComponents();
        this.db = db;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fnamn = new javax.swing.JLabel();
        enamn = new javax.swing.JLabel();
        telnmr = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        grad = new javax.swing.JLabel();
        btnSkapaAnvandare = new javax.swing.JButton();
        fnamn1 = new javax.swing.JTextField();
        enamn1 = new javax.swing.JTextField();
        telnmr1 = new javax.swing.JTextField();
        mail1 = new javax.swing.JTextField();
        grad1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fnamn.setText("Förnamn:");

        enamn.setText("Efternamn:");

        telnmr.setText("Telefonnummer:");

        mail.setText("Mailadress:");

        grad.setText("Grad:");

        btnSkapaAnvandare.setText("Skapa användare");
        btnSkapaAnvandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaAnvandareActionPerformed(evt);
            }
        });

        grad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "V" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fnamn)
                    .addComponent(telnmr)
                    .addComponent(enamn)
                    .addComponent(mail)
                    .addComponent(grad))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSkapaAnvandare)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fnamn1)
                        .addComponent(enamn1)
                        .addComponent(telnmr1)
                        .addComponent(mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(grad1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnamn)
                    .addComponent(fnamn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enamn)
                    .addComponent(enamn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telnmr)
                    .addComponent(telnmr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail)
                    .addComponent(mail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grad)
                    .addComponent(grad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSkapaAnvandare)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkapaAnvandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaAnvandareActionPerformed
            String engrad = (String) grad1.getSelectedItem();
        String nextID = "";
        try{
              nextID = db.getAutoIncrement("ANVANDARE", "AID");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde ej hämta nytt ID");
        }
        
        try{
            db.insert("INSERT INTO ANVANDARE (AID, FORNAMN, EFTERNAMN, TELEFONNUMMER, MAILADRESS, GRAD, LOSENORD) VALUES ("+nextID+", '"+fnamn1.getText() +"', '"+enamn1.getText() +"', '" + telnmr1.getText() + "', '"+mail1.getText() + "', '"+engrad+"', 'Login123');");
            JOptionPane.showMessageDialog(null, "Ny användare har registrerats");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte lägga till användaren");
        }
    }//GEN-LAST:event_btnSkapaAnvandareActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSkapaAnvandare;
    private javax.swing.JLabel enamn;
    private javax.swing.JTextField enamn1;
    private javax.swing.JLabel fnamn;
    private javax.swing.JTextField fnamn1;
    private javax.swing.JLabel grad;
    private javax.swing.JComboBox<String> grad1;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField mail1;
    private javax.swing.JLabel telnmr;
    private javax.swing.JTextField telnmr1;
    // End of variables declaration//GEN-END:variables
}
