package oruk;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laptop
 */
public class BloggInlagg extends javax.swing.JPanel {

    /**
     * Creates new form MittFlodeFormell2
     */
    public BloggInlagg(OrukDB db, String inlagg) {
        initComponents();
        this.db = db;
        this.inlagg = inlagg;
        setText();
        kollaAdmin();
    }

    public void kollaAdmin() {
        try {
            String anvandare = Huvudfonster.getAnvandarnamn();
            btnAndra.setVisible(false);
            btnTaBort.setVisible(false);

            String data = "SELECT GRAD FROM ANVANDARE WHERE MAILADRESS='" + anvandare + "'";
            String data1 = db.fetchSingle(data);
            
            if(data1.equals("S") || data1.equals("A"))
            {
                btnAndra.setVisible(true);
                btnTaBort.setVisible(true);
                
            
            }
        
        } 
        catch (InfException ex) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
        btnAndra = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("iinläggstestinläggstestinläggstestinläggstestinläggstestinläggstestnläggstest");

        jLabel3.setText("Publicerat:");

        jLabel4.setText("2018-02-13 10:00:00");

        jLabel5.setText("av");

        jLabel6.setText("namn");

        jButton1.setText("Kommentera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 26)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel7.setText("Taggar:");

        jLabel8.setText("tagg1 tagg2");

        btnTaBort.setText("Ta bort inlägg");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        btnAndra.setText("Ändra inlägg");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 193, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAndra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTaBort)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jButton1)
                    .addComponent(btnTaBort)
                    .addComponent(btnAndra))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Kommentar(db, inlagg).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        new AdminAndraInlagg1(db, inlagg).setVisible(true);
    }//GEN-LAST:event_btnAndraActionPerformed

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        
        int response = JOptionPane.showConfirmDialog(null, "Vill du ta bort inlägget?", "Ta bort inlägg",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
     if (response == JOptionPane.NO_OPTION) {

    } else if (response == JOptionPane.YES_OPTION) {
            try {
                String data1 = "DELETE FROM GORA_INLAGG WHERE IID='" + inlagg + "'";
                String data2 = "DELETE FROM KOMMENTERA_INLAGG WHERE IID='" + inlagg + "'";
                String data3 = "DELETE FROM INLAGG WHERE IID='" + inlagg + "'";
                db.delete(data1);
                db.delete(data2);
                db.delete(data3);
                
                JOptionPane.showMessageDialog(null, "Inlägget har tagits bort");
                
                
            } catch (InfException ex) {
                
            }
        
      }
        

    }//GEN-LAST:event_btnTaBortActionPerformed

    private void setText() {
        try {
            String skrivetAv = " ";
            String taggar = " ";
            String rubrik = db.fetchSingle("SELECT RUBRIK FROM INLAGG WHERE IID='" + inlagg + "'");
            String text = db.fetchSingle("SELECT TEXT FROM INLAGG WHERE IID='" + inlagg + "'");
            String datum = db.fetchSingle("SELECT DATUM FROM INLAGG WHERE IID=" + inlagg);
            String tid = db.fetchSingle("SELECT TID FROM INLAGG WHERE IID=" + inlagg);
            String publicerat = datum + "  " + tid;
            jLabel1.setText(rubrik);
            jLabel2.setText(text);
            jLabel4.setText(publicerat);
            ArrayList skrivetAvLista = db.fetchColumn("SELECT AID FROM GORA_INLAGG WHERE IID='" + inlagg + "'");
            int index = 1;

            for (Object aid : skrivetAvLista) {

                if (index == 1) {
                    String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE AID=" + aid);
                    String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE AID=" + aid);
                    String heltNamn = fornamn + " " + efternamn;
                    skrivetAv = heltNamn;
                    index++;

                } else {
                    String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE AID=" + aid);
                    String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE AID=" + aid);
                    String heltNamn = fornamn + " " + efternamn;
                    skrivetAv = skrivetAv + " och " + heltNamn;
                }
            }
            jLabel6.setText(skrivetAv);

            ArrayList taggLista = db.fetchColumn("SELECT TID FROM INLAGG_TAGG WHERE IID='" + inlagg + "'");

            if (taggLista == null) {
                taggar = "saknas";
            } else {
                for (Object taggid : taggLista) {
                    String taggnamn = db.fetchSingle("SELECT NAMN FROM TAGG WHERE TID=" + taggid);
                    taggar = taggar + " #" + taggnamn;
                }
            }
            jLabel8.setText(taggar);
        } catch (InfException ex) {
            Logger.getLogger(BloggInlagg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private OrukDB db;
    private String inlagg;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnTaBort;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
