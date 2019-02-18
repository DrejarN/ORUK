
package oruk;

import java.awt.Toolkit;
import oru.inf.*;
import java.util.*;
import javax.swing.*;

public class DoodleFrame extends javax.swing.JFrame {

    private String motesnamnet;
    private static OrukDB db;
    private ArrayList<String> lista1;
    
    public DoodleFrame(OrukDB db, String namnet) {
        initComponents();
        this.db = db;
        this.motesnamnet = namnet;
        setTitle("ORUK - Doodle");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("icons\\oruklogoliten.png"));
        this.setLocationRelativeTo(null);
        this.lista1 = new ArrayList<>();
        fyllDatumTid();
        orgKnapp.setVisible(false);
        visaKnappOmOrg();
        antalSomKan();
    }

    private void fyllDatumTid(){
        try{
           String MID = db.fetchSingle("SELECT MID FROM MOTE WHERE RUBRIK = '"+motesnamnet+"'");
            System.out.println(MID);
           lista1 = db.fetchColumn("SELECT DATUM FROM MOTE_FORFRAGA WHERE MID = "+MID);
           for(int i = 0; i < lista1.size(); i++){
              String datum = lista1.get(i).substring(0,10);
              String tid = lista1.get(i).substring(11,16);
              d1.setText(lista1.get(0).substring(0,10));
              d2.setText(lista1.get(1).substring(0,10));
              d3.setText(lista1.get(2).substring(0,10));
              t1.setText(lista1.get(0).substring(11,16));
              t2.setText(lista1.get(1).substring(11,16));
              t3.setText(lista1.get(2).substring(11,16));
           }
        }
        catch(InfException e){
           JOptionPane.showMessageDialog(null, "go AGANE");
        }
    }
    
    private void visaKnappOmOrg(){
        String MID = "";
        String AID = "";
        String ORG = "";
        String namn = "";
        try{
            MID = db.fetchSingle("SELECT MID FROM MOTE WHERE RUBRIK = '"+motesnamnet+"'");
            System.out.println(MID);
            ORG = db.fetchSingle("SELECT ORGANISATOR FROM MOTE WHERE MID = "+MID);
            System.out.println(ORG);
            AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '" + Huvudfonster.getAnvandarnamn()+"'");
            System.out.println(AID);
            namn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE AID = "+AID);
        }
        catch(InfException e){
            
        }
        this.namnet.setText(namn);
        if(ORG.equalsIgnoreCase(AID)){
            orgKnapp.setVisible(true);
        }
    }
    
    private void antalSomKan(){
        String MID = "";
        String AID = "";
        String ORG = "";
        String namn = "";
        int ett = 0;
        int tva = 0; 
        int tre = 0;
        try{
            MID = db.fetchSingle("SELECT MID FROM MOTE WHERE RUBRIK = '"+motesnamnet+"'");
            ORG = db.fetchSingle("SELECT ORGANISATOR FROM MOTE WHERE MID = "+MID);
            AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '" + Huvudfonster.getAnvandarnamn()+"'");
            namn = db.fetchSingle("SELECT FORNAMN FROM ANVANDARE WHERE AID = "+AID);
        }
        catch(InfException e){
            
        }
        try{
            ArrayList<String> kolumn1 = db.fetchColumn("SELECT KAN FROM MOTE_FORFRAGA WHERE MID = "+MID+" AND DATUM LIKE '"+d1.getText() + " " + t1.getText()+"%'");
                for(int i = 0; i < kolumn1.size(); i++){
                if(kolumn1.get(i).equalsIgnoreCase("J")){
                    ett++;
                }
            }
        
        }
        catch(Exception e){
        }
                try{
            ArrayList<String> kolumn2 = db.fetchColumn("SELECT KAN FROM MOTE_FORFRAGA WHERE MID = "+MID+" AND DATUM LIKE '"+d2.getText() + " " + t2.getText()+"%'");
                for(int x = 0; x < kolumn2.size(); x++){
                if(kolumn2.get(x).equalsIgnoreCase("J")){
                    tva++;
                }
            }
        }
        catch(Exception e){
        }
                try{
            ArrayList<String> kolumn3 = db.fetchColumn("SELECT KAN FROM MOTE_FORFRAGA WHERE MID = "+MID+" AND DATUM LIKE '"+d3.getText() + " " + t3.getText()+"%'");
                for(int z = 0; z < kolumn3.size(); z++){
                if(kolumn3.get(z).equalsIgnoreCase("J")){
                    tre++;
                }
            }
        }
        catch(Exception e){
        }
        String tre1 = Integer.toString(tre);
        String tva1 = Integer.toString(tva);
        String ett1 = Integer.toString(ett);
        k1.setText(ett1);
        k2.setText(tva1);
        k3.setText(tre1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMinProfil = new javax.swing.JPanel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        namnet = new javax.swing.JLabel();
        kan1 = new javax.swing.JCheckBox();
        kan2 = new javax.swing.JCheckBox();
        kan3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        orgKnapp = new javax.swing.JButton();
        v1 = new javax.swing.JCheckBox();
        v3 = new javax.swing.JCheckBox();
        v2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        k1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        k2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        k3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelMinProfil.setBackground(new java.awt.Color(255, 255, 255));
        panelMinProfil.setPreferredSize(new java.awt.Dimension(915, 592));

        d1.setText("datum1");

        d2.setText("datum2");

        d3.setText("datum3");

        t3.setText("tid3");

        t2.setText("tid2");

        t1.setText("tid1");

        namnet.setText("dittnamn");

        jLabel1.setText("Kryssa i de tider du kan");

        jButton1.setText("Klar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        orgKnapp.setText("Välj tid ");
        orgKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgKnappActionPerformed(evt);
            }
        });

        jLabel2.setText("Antal som kan ");

        k1.setText("jLabel3");

        jLabel3.setText("Antal som kan");

        k2.setText("jLabel4");

        jLabel4.setText("Antal som kan");

        k3.setText("jLabel5");

        javax.swing.GroupLayout panelMinProfilLayout = new javax.swing.GroupLayout(panelMinProfil);
        panelMinProfil.setLayout(panelMinProfilLayout);
        panelMinProfilLayout.setHorizontalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(namnet)
                .addGap(63, 63, 63)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d1)
                    .addComponent(t1)
                    .addComponent(kan1))
                .addGap(62, 62, 62)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d2)
                    .addComponent(t2)
                    .addComponent(kan2))
                .addGap(56, 56, 56)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t3)
                            .addComponent(d3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinProfilLayout.createSequentialGroup()
                        .addComponent(kan3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(k1)
                            .addComponent(v1))
                        .addGap(18, 18, 18)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(k2)
                            .addComponent(v2))
                        .addGap(18, 18, 18)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(k3)
                            .addComponent(v3)))
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(orgKnapp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMinProfilLayout.setVerticalGroup(
            panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinProfilLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1)
                    .addComponent(d2)
                    .addComponent(d3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3)
                    .addComponent(t2)
                    .addComponent(t1))
                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namnet)
                            .addComponent(kan1)
                            .addComponent(kan2)
                            .addComponent(kan3))
                        .addGap(62, 62, 62)
                        .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMinProfilLayout.createSequentialGroup()
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelMinProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(k1)
                                    .addComponent(k2)
                                    .addComponent(k3))
                                .addGap(18, 18, 18)
                                .addComponent(orgKnapp))
                            .addComponent(v1)
                            .addComponent(v2)
                            .addComponent(v3)))
                    .addGroup(panelMinProfilLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMinProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMinProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean ett = kan1.isSelected();
        boolean tva = kan2.isSelected();
        boolean tre = kan3.isSelected();
        String MID = "";
        String AID = "";
        try{
             MID = db.fetchSingle("SELECT MID FROM MOTE WHERE RUBRIK = '"+motesnamnet+"'");
             AID = db.fetchSingle("SELECT AID FROM ANVANDARE WHERE MAILADRESS = '"+Huvudfonster.getAnvandarnamn()+"'");
        }
        catch(InfException e){
            
        }        
        if(ett == true){
            try{
                db.update("UPDATE MOTE_FORFRAGA SET KAN = 'J' WHERE DATUM LIKE '"+d1.getText() + " " + t1.getText()+"%' AND MID = "+MID+" AND AID = "+AID);
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "1");
            }
        }
        else{
            try{
                db.update("UPDATE MOTE_FORFRAGA SET KAN = 'N' WHERE DATUM LIKE '"+d1.getText() + " " + t1.getText()+"%' AND MID = "+MID+" AND AID = "+AID);
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "2");
            }
        }
        
        if(tva == true){
            try{
                db.update("UPDATE MOTE_FORFRAGA SET KAN = 'J' WHERE DATUM LIKE '"+d2.getText() + " " + t2.getText()+"%' AND MID = "+MID+" AND AID = "+AID);
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "1");
            }
        }
        else{
            try{
                db.update("UPDATE MOTE_FORFRAGA SET KAN = 'N' WHERE DATUM LIKE '"+d2.getText() + " " + t2.getText()+"%' AND MID = "+MID+" AND AID = "+AID);
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "2");
            }
        }
        
        if(tre == true){
            try{
                db.update("UPDATE MOTE_FORFRAGA SET KAN = 'J' WHERE DATUM LIKE '"+d3.getText() + " " + t3.getText()+"%' AND MID = "+MID+" AND AID = "+AID);
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "1");
            }
        }
        else{
            try{
                db.update("UPDATE MOTE_FORFRAGA SET KAN = 'N' WHERE DATUM LIKE '"+d3.getText() + " " + t3.getText()+"%' AND MID = "+MID+" AND AID = "+AID);
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "2");
            }
        }
        JOptionPane.showMessageDialog(null, "Dina svar har registrerats.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orgKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgKnappActionPerformed
        String MID = "";
        String yes = "";
        String yas = "";
        String yyy = "";
        ArrayList<String> aid = null;
        try{
            MID = db.fetchSingle("SELECT MID FROM MOTE WHERE RUBRIK = '"+motesnamnet+"'");
        }
        catch(InfException e){
            
        }
        
        if(v1.isSelected()){
              try{
                  db.update("UPDATE MOTE SET DATUM = '"+d1.getText()+"', TID = '"+t1.getText()+":00' WHERE MID = "+MID);
                  JOptionPane.showMessageDialog(null, "Datumet har valts");
                  yes = "h";
              }
              catch(InfException e){
                  
              }
          } 
          if(v2.isSelected()){
              try{
                  db.update("UPDATE MOTE SET DATUM = '"+d2.getText()+"', TID = '"+t2.getText()+":00' WHERE MID = "+MID);
                  JOptionPane.showMessageDialog(null, "Datumet har valts");
                  yas = "h";
              }
              catch(InfException e){
                  
              }
          }
            if(v3.isSelected()){
              try{
                  db.update("UPDATE MOTE SET DATUM = '"+d3.getText()+"', TID = '"+t3.getText()+":00' WHERE MID = "+MID);
                  JOptionPane.showMessageDialog(null, "Datumet har valts");
                  yyy = "h";
              }
              catch(InfException e){
                  
              }
            }
           
           try{
              if(yes == "h"){
              aid = db.fetchColumn("SELECT AID FROM MOTE_FORFRAGA WHERE KAN = 'J' AND MID = "+MID+" AND DATUM LIKE '"+d1.getText() + " " + t1.getText()+"%'");
              }
              if(yas == "h"){
              aid = db.fetchColumn("SELECT AID FROM MOTE_FORFRAGA WHERE KAN = 'J' AND MID = "+MID+" AND DATUM LIKE '"+d2.getText() + " " + t2.getText()+"%'");
              }
              if(yyy == "h"){
              aid = db.fetchColumn("SELECT AID FROM MOTE_FORFRAGA WHERE KAN = 'J' AND MID = "+MID+" AND DATUM LIKE '"+d3.getText() + " " + t3.getText()+"%'");
              }
              for(int i = 0; i < aid.size(); i++){
              db.insert("INSERT INTO MOTE_DELTAGANDE VALUES ("+aid.get(i)+", "+ MID+")");
              }
          }
           catch(InfException e){
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
           
           try{
               db.delete("DELETE FROM MOTE_FORFRAGA WHERE MID = "+MID);
           }
           catch(InfException e){
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
    }//GEN-LAST:event_orgKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel k1;
    private javax.swing.JLabel k2;
    private javax.swing.JLabel k3;
    private javax.swing.JCheckBox kan1;
    private javax.swing.JCheckBox kan2;
    private javax.swing.JCheckBox kan3;
    private javax.swing.JLabel namnet;
    private javax.swing.JButton orgKnapp;
    private javax.swing.JPanel panelMinProfil;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JCheckBox v1;
    private javax.swing.JCheckBox v2;
    private javax.swing.JCheckBox v3;
    // End of variables declaration//GEN-END:variables
}
