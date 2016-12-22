/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.view;

import BL.InfermieriRepository;
import BL.SpitaliException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arber
 */
public class EditDritarjaM extends javax.swing.JInternalFrame {

    private InfermieriRepository ir = new InfermieriRepository();
    
    public EditDritarjaM() {
        initComponents();
        initInformatat();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQytetiM = new javax.swing.JTextField();
        lGjiniaM = new javax.swing.JLabel();
        txtRugaM = new javax.swing.JTextField();
        ComboBoxDitaM = new javax.swing.JComboBox();
        RadioButtonMM = new javax.swing.JRadioButton();
        ComboBoxMujiM = new javax.swing.JComboBox();
        RadioButtonFM = new javax.swing.JRadioButton();
        ComboBoxVitiM = new javax.swing.JComboBox();
        lNumriShpisM = new javax.swing.JLabel();
        lFjalkalimiM = new javax.swing.JLabel();
        txtNumriShpisM = new javax.swing.JTextField();
        txtFjalkalimiM = new javax.swing.JPasswordField();
        lDataLindjesM = new javax.swing.JLabel();
        lDetajetTjeraM = new javax.swing.JLabel();
        lShtetiM = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDetajetTjeraM = new javax.swing.JTextArea();
        lEmriM = new javax.swing.JLabel();
        txtShtetiM = new javax.swing.JTextField();
        lSpecializimiM = new javax.swing.JLabel();
        txtEmriM = new javax.swing.JTextField();
        ComboBoxSektoriM = new javax.swing.JComboBox();
        lQytetiM = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lMbiemriM = new javax.swing.JLabel();
        lRugaM = new javax.swing.JLabel();
        txtMbiemriM = new javax.swing.JTextField();

        setClosable(true);

        txtQytetiM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQytetiMActionPerformed(evt);
            }
        });

        lGjiniaM.setText("Gjinia");

        txtRugaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRugaMActionPerformed(evt);
            }
        });

        ComboBoxDitaM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dita" }));

        RadioButtonMM.setText("M");
        RadioButtonMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMMActionPerformed(evt);
            }
        });

        ComboBoxMujiM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muaji" }));

        RadioButtonFM.setText("F");
        RadioButtonFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonFMActionPerformed(evt);
            }
        });

        ComboBoxVitiM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Viti" }));

        lNumriShpisM.setText("Nr");

        lFjalkalimiM.setText("Fjalkalimi");

        txtNumriShpisM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumriShpisMActionPerformed(evt);
            }
        });

        txtFjalkalimiM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFjalkalimiMActionPerformed(evt);
            }
        });

        lDataLindjesM.setText("Data lindjes");

        lDetajetTjeraM.setText("Detajet tjera");

        lShtetiM.setText("Shteti");

        txtAreaDetajetTjeraM.setColumns(20);
        txtAreaDetajetTjeraM.setRows(5);
        jScrollPane3.setViewportView(txtAreaDetajetTjeraM);

        lEmriM.setText("Emri");

        txtShtetiM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShtetiMActionPerformed(evt);
            }
        });

        lSpecializimiM.setText("Sektori");

        txtEmriM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmriMActionPerformed(evt);
            }
        });

        ComboBoxSektoriM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sektori", "1.Kirurgjisë" }));
        ComboBoxSektoriM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSektoriMActionPerformed(evt);
            }
        });

        lQytetiM.setText("Qyteti");

        jButton3.setText("Edito");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lMbiemriM.setText("Mbiemri");

        lRugaM.setText("Ruga");

        txtMbiemriM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMbiemriMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lEmriM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lMbiemriM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lGjiniaM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lDataLindjesM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lShtetiM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lQytetiM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lRugaM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lNumriShpisM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RadioButtonMM)
                                    .addGap(18, 18, 18)
                                    .addComponent(RadioButtonFM))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ComboBoxDitaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBoxMujiM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboBoxVitiM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRugaM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQytetiM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtShtetiM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMbiemriM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmriM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumriShpisM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lFjalkalimiM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFjalkalimiM, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDetajetTjeraM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lSpecializimiM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxSektoriM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))))
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lEmriM)
                        .addComponent(txtEmriM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lMbiemriM)
                        .addComponent(txtMbiemriM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lGjiniaM)
                        .addComponent(RadioButtonMM)
                        .addComponent(RadioButtonFM))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lDataLindjesM)
                        .addComponent(ComboBoxDitaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxMujiM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxVitiM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lShtetiM)
                        .addComponent(txtShtetiM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lQytetiM)
                        .addComponent(txtQytetiM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRugaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lRugaM))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNumriShpisM)
                        .addComponent(txtNumriShpisM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFjalkalimiM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lFjalkalimiM))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxSektoriM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lSpecializimiM))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lDetajetTjeraM))
                    .addGap(28, 28, 28)
                    .addComponent(jButton3)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQytetiMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQytetiMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQytetiMActionPerformed

    private void txtRugaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRugaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRugaMActionPerformed

    private void RadioButtonMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMMActionPerformed
        if(RadioButtonMM.isSelected())
        {
            RadioButtonFM.setSelected(false);
        }
    }//GEN-LAST:event_RadioButtonMMActionPerformed

    private void RadioButtonFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonFMActionPerformed
        if(RadioButtonFM.isSelected())
        {
            RadioButtonMM.setSelected(false);
        }
    }//GEN-LAST:event_RadioButtonFMActionPerformed

    private void txtNumriShpisMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumriShpisMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumriShpisMActionPerformed

    private void txtFjalkalimiMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFjalkalimiMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFjalkalimiMActionPerformed

    private void txtShtetiMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShtetiMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShtetiMActionPerformed

    private void txtEmriMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmriMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmriMActionPerformed

    private void ComboBoxSektoriMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSektoriMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSektoriMActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(txtEmriM.getText()!=null||txtEmriM.getText().trim()!="" && txtMbiemriM.getText()!=null||txtMbiemriM.getText().trim()!="" &&
            txtShtetiM.getText()!=null||txtShtetiM.getText().trim()!="" && txtQytetiM.getText()!=null||txtQytetiM.getText().trim()!="" &&
            txtRugaM.getText()!=null||txtRugaM.getText().trim()!="" && txtNumriShpisM.getText()!=null||txtNumriShpisM.getText().trim()!="" &&
            txtFjalkalimiM.getText()!=null||txtFjalkalimiM.getText().trim()!="" && txtAreaDetajetTjeraM.getText()!=null||txtAreaDetajetTjeraM.getText().trim()!="")
        {
            Search.m.setEmri(txtEmriM.getText());
            Search.m.setMbiemri(txtMbiemriM.getText());
            Search.m.setShteti(txtShtetiM.getText());
            Search.m.setQyteti(txtQytetiM.getText());
            Search.m.setRuga(txtRugaM.getText());
            Search.m.setNumri(Integer.parseInt(txtNumriShpisM.getText()));
            Search.m.setFjalkalimi(txtFjalkalimiM.getText());
            Search.m.setDetajettjera(txtAreaDetajetTjeraM.getText());
            //m.setSektoriID();
            if(RadioButtonMM.isSelected())
            {
                Search.m.setGjinia('M');
            }
            else
            {
                Search.m.setGjinia('F');
            }

            try
            {
                if(ir.update(Search.m))
                {
                    JOptionPane.showMessageDialog(null, "Eshte edituar infermieri!!!");
                }
            }catch(SpitaliException e){
                JOptionPane.showMessageDialog(null, e);
            }

           /* initTableM();
            emptyFieldM();*/
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nuk jan te plotesuar tegjith informatat");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMbiemriMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMbiemriMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMbiemriMActionPerformed

    public void initInformatat()
    {
        txtEmriM.setText(Search.m.getEmri());
        txtMbiemriM.setText(Search.m.getMbiemri());
        txtShtetiM.setText(Search.m.getShteti());
        txtQytetiM.setText(Search.m.getQyteti());
        txtRugaM.setText(Search.m.getRuga());
        txtNumriShpisM.setText(Search.m.getNumri().toString());
        txtFjalkalimiM.setText(Search.m.getFjalkalimi());
        txtAreaDetajetTjeraM.setText(Search.m.getDetajettjera());
        ComboBoxDitaM.setSelectedItem(Search.m.getDataLindjes().getDay());




        if(Search.m.getGjinia() == 'M')
        {
            RadioButtonMM.setSelected(true);
        }
        else
        {
            RadioButtonFM.setSelected(true);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxDitaM;
    private javax.swing.JComboBox ComboBoxMujiM;
    private javax.swing.JComboBox ComboBoxSektoriM;
    private javax.swing.JComboBox ComboBoxVitiM;
    private javax.swing.JRadioButton RadioButtonFM;
    private javax.swing.JRadioButton RadioButtonMM;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lDataLindjesM;
    private javax.swing.JLabel lDetajetTjeraM;
    private javax.swing.JLabel lEmriM;
    private javax.swing.JLabel lFjalkalimiM;
    private javax.swing.JLabel lGjiniaM;
    private javax.swing.JLabel lMbiemriM;
    private javax.swing.JLabel lNumriShpisM;
    private javax.swing.JLabel lQytetiM;
    private javax.swing.JLabel lRugaM;
    private javax.swing.JLabel lShtetiM;
    private javax.swing.JLabel lSpecializimiM;
    private javax.swing.JTextArea txtAreaDetajetTjeraM;
    private javax.swing.JTextField txtEmriM;
    private javax.swing.JPasswordField txtFjalkalimiM;
    private javax.swing.JTextField txtMbiemriM;
    private javax.swing.JTextField txtNumriShpisM;
    private javax.swing.JTextField txtQytetiM;
    private javax.swing.JTextField txtRugaM;
    private javax.swing.JTextField txtShtetiM;
    // End of variables declaration//GEN-END:variables
}
