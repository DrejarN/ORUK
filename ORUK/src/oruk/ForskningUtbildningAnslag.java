package oruk;


import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class ForskningUtbildningAnslag extends javax.swing.JPanel {

    private InfDB db;
    private ArrayList<String> enLista;
    private String titel;

    

    /**
     * Creates new form ForskningUtbildning
     * @param db
     */
    public ForskningUtbildningAnslag(InfDB db) {
        initComponents();
        this.db=db;
        enLista = new ArrayList<>(); 
        fyllLista();
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
        btnSe = new javax.swing.JButton();

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

        btnSe.setText("Se projekt");
        btnSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelForskningLayout = new javax.swing.GroupLayout(panelForskning);
        panelForskning.setLayout(panelForskningLayout);
        panelForskningLayout.setHorizontalGroup(
            panelForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForskningLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSe)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelForskningLayout.setVerticalGroup(
            panelForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForskningLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSe)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForskning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForskning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeActionPerformed
        new Forsk(db, titel).setVisible(true);     
    }//GEN-LAST:event_btnSeActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        titel = jList1.getSelectedValue();
          
    }//GEN-LAST:event_jList1MouseClicked
    
    private void fyllLista() {
        DefaultListModel model = new DefaultListModel();
        try {
            enLista = db.fetchColumn("SELECT RUBRIK FROM INLAGG WHERE KATEGORI='1' OR KATEGORI='2'");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSe;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelForskning;
    // End of variables declaration//GEN-END:variables
}
