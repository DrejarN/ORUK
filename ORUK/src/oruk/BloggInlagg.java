package oruk;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
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
    public BloggInlagg(InfDB db, String inlagg) {
        initComponents();
        this.db = db;
        this.inlagg=inlagg;        
        setText();
    }
    
    public void kollaOmAdmin()
    {
        
        if()
    
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jButton2.setText("Redigera inlägg");

        jButton3.setText("Ta bort inlägg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Kommentar(db, inlagg).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setText(){
        try {
            String skrivetAv = "";
            String rubrik = db.fetchSingle("SELECT RUBRIK FROM INLAGG WHERE IID=" + inlagg);
            String text = db.fetchSingle("SELECT TEXT FROM INLAGG WHERE IID=" + inlagg);
            String datum = db.fetchSingle("SELECT DATUM FROM INLAGG WHERE IID=" + inlagg);
            String tid = db.fetchSingle("SELECT TID FROM INLAGG WHERE IID=" + inlagg);
            String publicerat = datum + "  " + tid;           
            jLabel2.setText(text);
            jLabel4.setText(publicerat);
            
            ArrayList skrivetAvLista = db.fetchColumn("SELECT AID FROM GORA_INLAGG WHERE IID='" + inlagg + "'" );
            int index = 1;
            for(Object aid : skrivetAvLista){
                if(index == 1){
                String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE AID=" + aid);
                String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE AID=" + aid);
                String heltNamn = fornamn + " " + efternamn;
                skrivetAv = heltNamn;
                index++;}
                else{
                String fornamn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE AID=" + aid);
                String efternamn = db.fetchSingle("SELECT EFTERNAMN FROM ANVANDARE WHERE AID=" + aid);
                String heltNamn = fornamn + " " + efternamn;
                skrivetAv = skrivetAv + " och " + heltNamn;
                }
            }
            jLabel6.setText(skrivetAv);
            
            
        } catch (InfException ex) {
            Logger.getLogger(BloggInlagg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private InfDB db;
    private String inlagg;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
