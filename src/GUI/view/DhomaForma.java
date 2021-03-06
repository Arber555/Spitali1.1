/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.view;

import BL.DhomaRepository;
import BL.SpitaliException;
import EJB.Dhoma;
import EJB.Sektori;
import GUI.model.DhomaTableModel;
import Main.SpitaliGUI;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Arber
 */
public class DhomaForma extends javax.swing.JInternalFrame {

    private DhomaRepository dr = new DhomaRepository();
    private DhomaTableModel dtm = new DhomaTableModel();
    public static Dhoma d = new Dhoma();
    
    public DhomaForma() {
        initComponents();
        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNrDhomes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNrShtratave = new javax.swing.JTextField();
        jComboBoxSektori = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DhomajTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jRadioButtonId = new javax.swing.JRadioButton();
        jRadioButtonNrDhomes = new javax.swing.JRadioButton();
        jTextD = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Numri i dhomes");

        txtNrDhomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNrDhomesActionPerformed(evt);
            }
        });

        jLabel2.setText("Numri i shtratve");

        jComboBoxSektori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sektori", "1.Kirurgjisë" }));

        jLabel4.setText("Sektori");

        jButton1.setText("Regjistro dhomen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNrShtratave, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addComponent(txtNrDhomes))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxSektori, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNrDhomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNrShtratave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxSektori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Regjistro dhomen", jPanel1);

        DhomajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(DhomajTable);

        jButton2.setText("Fshij");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButtonId.setText("Kërko sipas ID");
        jRadioButtonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIdActionPerformed(evt);
            }
        });

        jRadioButtonNrDhomes.setText("Kërko sipas numrit te dhomes");
        jRadioButtonNrDhomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNrDhomesActionPerformed(evt);
            }
        });

        jTextD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Edito");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextD, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jButton3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonId)
                                .addGap(63, 63, 63)
                                .addComponent(jRadioButtonNrDhomes))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonId)
                    .addComponent(jRadioButtonNrDhomes))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("Editimi/Fshirja e dhomave", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initTable()
    {
        List<Dhoma> list = dr.findAll();
        dtm.add(list);
        DhomajTable.setModel(dtm);
        dtm.fireTableDataChanged();
    }
    
    private void txtNrDhomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNrDhomesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNrDhomesActionPerformed

    public void e()
    {
        txtNrDhomes.setText("");
        txtNrShtratave.setText("");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try
        {
            List<Dhoma> z = dr.findAll();
            for(int i=0;i<z.size();i++)
            {
                if(Integer.parseInt(txtNrDhomes.getText()) == (((Dhoma)z.get(i)).getNrdhomes()))
                {
                    JOptionPane.showMessageDialog(null, "Dhoma egziston!!!");
                    return;
                }
            }
            
            d.setNrdhomes(Integer.parseInt(txtNrDhomes.getText()));
            d.setNrshtratve(Integer.parseInt(txtNrShtratave.getText()));
            d.setCountP(0);
            
            String x = jComboBoxSektori.getSelectedItem().toString();
            String [] y = x.split("\\.");
            Sektori s = new Sektori();
            s.setEmri(y[1]);
            s.setId(Integer.parseInt(y[0]));
            d.setSektoriID(s);
            
            if(dr.insert(d))
            {
                JOptionPane.showMessageDialog(null, "Eshte regjistruar Dhoma!!!");
                initTable();
                e();
            }
          
        }
        catch(SpitaliException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r = DhomajTable.getSelectedRow();
        if(r>-1)
        {
            d = dtm.getDhoma(r);
            int x = JOptionPane.showConfirmDialog(null, "A jeni i sigurt qe doni te fshini Dhomen?");
            if(x == 0)
            {
                try {
                    if(dr.remove(d))
                    {
                        JOptionPane.showMessageDialog(null, "Eshte fshir Dhoma!!!");
                    }
                    if(jTextD.getText() != "")
                    {
                        search(jTextD.getText());
                        
                    }
                } catch (SpitaliException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else if(x == 1)
            {
                JOptionPane.showMessageDialog(null, "Dhoma nuk eshte fshir");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Dhoma nuk eshte fshir");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nuk keni selektuar asni Dhome!!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButtonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIdActionPerformed
        if(jRadioButtonId.isSelected())
        {
            jRadioButtonNrDhomes.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonIdActionPerformed

    private void jRadioButtonNrDhomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNrDhomesActionPerformed
        if(jRadioButtonNrDhomes.isSelected())
        {
            jRadioButtonId.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonNrDhomesActionPerformed

    private void jTextDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDActionPerformed

    public void fillTable(List<Dhoma> list)
    {
        dtm.add(list);
        DhomajTable.setModel(dtm);
        dtm.fireTableDataChanged();
    }
    
    public void search(String x)
    {
        List<Dhoma> list = null;
        
        if(jRadioButtonId.isSelected())
        {
                list = dr.findById(Integer.parseInt(jTextD.getText()));
                fillTable(list);
        }
        else if(jRadioButtonNrDhomes.isSelected())
        {
                list = dr.findByNrDhomes(Integer.parseInt(jTextD.getText()));
                fillTable(list);
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(jTextD.getText() != "")
        {
            search(jTextD.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nuk keni selektuar asni opcjon!!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x = DhomajTable.getSelectedRow();
        
        if(x>-1)
        {
            d = dtm.getDhoma(x);
            
            
            EditDhoma ed = new EditDhoma();
            SpitaliGUI.desktopPane.add(ed);
            ed.show();
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DhomajTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBoxSektori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonId;
    private javax.swing.JRadioButton jRadioButtonNrDhomes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextD;
    private javax.swing.JTextField txtNrDhomes;
    private javax.swing.JTextField txtNrShtratave;
    // End of variables declaration//GEN-END:variables
}
