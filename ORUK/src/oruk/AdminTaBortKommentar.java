/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author christianrudolphi
 */
public class AdminTaBortKommentar extends javax.swing.JFrame {

    private static String inlagg;
    private static OrukDB db;
    private static ArrayList<String> enLista;

    /**
     * Creates new form AdminTaBortKommentar
     */
    public AdminTaBortKommentar(OrukDB db, String inlagg) {
        initComponents();
        this.db = db;
        this.inlagg = inlagg;
        enLista = new ArrayList<>();
        fyllLista();
    }

    public static void fyllLista() {
        DefaultListModel model = new DefaultListModel();
        try {
            enLista = db.fetchColumn("SELECT KOMMENTAR FROM KOMMENTERA_INLAGG WHERE IID='" + inlagg + "'");
            String svar = "";
            for (int i = 0; i < enLista.size(); i++) {
                svar = enLista.get(i);
                model.addElement(svar);
            }
            
            jList1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelForskning = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnTaBort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelForskning.setBackground(new java.awt.Color(255, 255, 255));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        btnTaBort.setText("Ta bort kommentar");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelForskningLayout = new javax.swing.GroupLayout(panelForskning);
        panelForskning.setLayout(panelForskningLayout);
        panelForskningLayout.setHorizontalGroup(
            panelForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForskningLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTaBort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelForskningLayout.setVerticalGroup(
            panelForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForskningLayout.createSequentialGroup()
                .addGroup(panelForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelForskningLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnTaBort))
                    .addGroup(panelForskningLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForskning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForskning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jList1MouseClicked

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        String kommentar = jList1.getSelectedValue();

        int response = JOptionPane.showConfirmDialog(null, "Vill du ta bort kommentaren?", "Ta bort kommentar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.YES_OPTION) {
            try {
                String data1 = "DELETE FROM KOMMENTERA_INLAGG WHERE KOMMENTAR='" + kommentar + "'";

                db.delete(data1);

                JOptionPane.showMessageDialog(null, "Kommentaren har tagits bort");
                fyllLista();

            } catch (InfException ex) {

            }

        }
    }//GEN-LAST:event_btnTaBortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private static javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelForskning;
    // End of variables declaration//GEN-END:variables
}