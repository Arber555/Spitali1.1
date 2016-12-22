/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.view;

import BL.RescepsionistiRepository;
import BL.SpitaliException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arber
 */
public class EditDritarjaR extends javax.swing.JInternalFrame {

    private RescepsionistiRepository  rr = new RescepsionistiRepository();
    
    public EditDritarjaR() {
        initComponents();
        initInformatat();
    }

    public void initInformatat()
    {
        txtEmriR.setText(Search.r.getEmri());
        txtMbiemriR2.setText(Search.r.getMbiemri());
        txtShtetiR.setText(Search.r.getShteti());
        txtQytetiR.setText(Search.r.getQyteti());
        txtRugaR.setText(Search.r.getRuga());
        txtNumriShpisR.setText(Search.r.getNumri().toString());
        txtFjalkalimiR.setText(Search.r.getFjalkalimi());
        txtAreaDetajetTjeraR.setText(Search.r.getDetajettjera());
        ComboBoxDitaR.setSelectedItem(Search.r.getDataLindjes().getDay());




        if(Search.r.getGjinia() == 'M')
        {
            RadioButtonMR.setSelected(true);
        }
        else
        {
            RadioButtonFR.setSelected(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lMbiemriR = new javax.swing.JLabel();
        ComboBoxVitiR = new javax.swing.JComboBox();
        txtQytetiR = new javax.swing.JTextField();
        lFjalkalimiR = new javax.swing.JLabel();
        lGjiniaR = new javax.swing.JLabel();
        txtFjalkalimiR = new javax.swing.JPasswordField();
        txtRugaR = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lShtetiR = new javax.swing.JLabel();
        RadioButtonMR = new javax.swing.JRadioButton();
        lDetajetTjeraR = new javax.swing.JLabel();
        lEmriR = new javax.swing.JLabel();
        RadioButtonFR = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaDetajetTjeraR = new javax.swing.JTextArea();
        txtShtetiR = new javax.swing.JTextField();
        lNumriShpisR = new javax.swing.JLabel();
        txtEmriR = new javax.swing.JTextField();
        txtNumriShpisR = new javax.swing.JTextField();
        ComboBoxDitaR = new javax.swing.JComboBox();
        lQytetiR = new javax.swing.JLabel();
        lRugaR = new javax.swing.JLabel();
        lDataLindjesR = new javax.swing.JLabel();
        ComboBoxMujiR = new javax.swing.JComboBox();
        txtMbiemriR2 = new javax.swing.JTextField();

        setClosable(true);

        lMbiemriR.setText("Mbiemri");

        ComboBoxVitiR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Viti" }));

        txtQytetiR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQytetiRActionPerformed(evt);
            }
        });

        lFjalkalimiR.setText("Fjalkalimi");

        lGjiniaR.setText("Gjinia");

        txtFjalkalimiR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFjalkalimiRActionPerformed(evt);
            }
        });

        txtRugaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRugaRActionPerformed(evt);
            }
        });

        jButton4.setText("Edito");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lShtetiR.setText("Shteti");

        RadioButtonMR.setText("M");
        RadioButtonMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMRActionPerformed(evt);
            }
        });

        lDetajetTjeraR.setText("Detajet tjera");

        lEmriR.setText("Emri");

        RadioButtonFR.setText("F");
        RadioButtonFR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonFRActionPerformed(evt);
            }
        });

        txtAreaDetajetTjeraR.setColumns(20);
        txtAreaDetajetTjeraR.setRows(5);
        jScrollPane5.setViewportView(txtAreaDetajetTjeraR);

        txtShtetiR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShtetiRActionPerformed(evt);
            }
        });

        lNumriShpisR.setText("Nr");

        txtEmriR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmriRActionPerformed(evt);
            }
        });

        txtNumriShpisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumriShpisRActionPerformed(evt);
            }
        });

        ComboBoxDitaR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dita" }));

        lQytetiR.setText("Qyteti");

        lRugaR.setText("Ruga");

        lDataLindjesR.setText("Data lindjes");

        ComboBoxMujiR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muaji" }));

        txtMbiemriR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMbiemriR2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lFjalkalimiR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtFjalkalimiR, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lEmriR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lMbiemriR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lGjiniaR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lDataLindjesR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lShtetiR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lQytetiR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lRugaR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lNumriShpisR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RadioButtonMR)
                                    .addGap(18, 18, 18)
                                    .addComponent(RadioButtonFR))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ComboBoxDitaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBoxMujiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboBoxVitiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtRugaR, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQytetiR, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtShtetiR, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMbiemriR2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmriR, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumriShpisR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lDetajetTjeraR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton4)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(115, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lEmriR)
                        .addComponent(txtEmriR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lMbiemriR)
                        .addComponent(txtMbiemriR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lGjiniaR)
                        .addComponent(RadioButtonMR)
                        .addComponent(RadioButtonFR))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lDataLindjesR)
                        .addComponent(ComboBoxDitaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxMujiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxVitiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lShtetiR)
                        .addComponent(txtShtetiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lQytetiR)
                        .addComponent(txtQytetiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRugaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lRugaR))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNumriShpisR)
                        .addComponent(txtNumriShpisR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFjalkalimiR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lFjalkalimiR))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lDetajetTjeraR))
                    .addGap(40, 40, 40)
                    .addComponent(jButton4)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQytetiRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQytetiRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQytetiRActionPerformed

    private void txtFjalkalimiRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFjalkalimiRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFjalkalimiRActionPerformed

    private void txtRugaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRugaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRugaRActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(txtEmriR.getText()!=null||txtEmriR.getText().trim()!="" && txtMbiemriR2.getText()!=null||txtMbiemriR2.getText().trim()!="" &&
            txtShtetiR.getText()!=null||txtShtetiR.getText().trim()!="" && txtQytetiR.getText()!=null||txtQytetiR.getText().trim()!="" &&
            txtRugaR.getText()!=null||txtRugaR.getText().trim()!="" && txtNumriShpisR.getText()!=null||txtNumriShpisR.getText().trim()!="" &&
            txtFjalkalimiR.getText()!=null||txtFjalkalimiR.getText().trim()!="" && txtAreaDetajetTjeraR.getText()!=null||txtAreaDetajetTjeraR.getText().trim()!="")
        {
            Search.r.setEmri(txtEmriR.getText());
            Search.r.setMbiemri(txtMbiemriR2.getText());
            Search.r.setShteti(txtShtetiR.getText());
            Search.r.setQyteti(txtQytetiR.getText());
            Search.r.setRuga(txtRugaR.getText());
            Search.r.setNumri(Integer.parseInt(txtNumriShpisR.getText()));
            Search.r.setFjalkalimi(txtFjalkalimiR.getText());
            Search.r.setDetajettjera(txtAreaDetajetTjeraR.getText());
            //m.setSektoriID();
            if(RadioButtonMR.isSelected())
            {
                Search.r.setGjinia('M');
            }
            else
            {
                Search.r.setGjinia('F');
            }

            try
            {
                if(rr.update(Search.r))
                {
                    JOptionPane.showMessageDialog(null, "Eshte edituar recepsionisti!!!");
                    this.dispose();
                }
            }catch(SpitaliException e){
                JOptionPane.showMessageDialog(null, e);
            }

           // initTableR();
           // emptyFieldR();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nuk jan te plotesuar tegjith informatat");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void RadioButtonMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMRActionPerformed
        if(RadioButtonMR.isSelected())
        {
            RadioButtonFR.setSelected(false);
        }
    }//GEN-LAST:event_RadioButtonMRActionPerformed

    private void RadioButtonFRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonFRActionPerformed
        if(RadioButtonFR.isSelected())
        {
            RadioButtonMR.setSelected(false);
        }
    }//GEN-LAST:event_RadioButtonFRActionPerformed

    private void txtShtetiRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShtetiRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShtetiRActionPerformed

    private void txtEmriRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmriRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmriRActionPerformed

    private void txtNumriShpisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumriShpisRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumriShpisRActionPerformed

    private void txtMbiemriR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMbiemriR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMbiemriR2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxDitaR;
    private javax.swing.JComboBox ComboBoxMujiR;
    private javax.swing.JComboBox ComboBoxVitiR;
    private javax.swing.JRadioButton RadioButtonFR;
    private javax.swing.JRadioButton RadioButtonMR;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lDataLindjesR;
    private javax.swing.JLabel lDetajetTjeraR;
    private javax.swing.JLabel lEmriR;
    private javax.swing.JLabel lFjalkalimiR;
    private javax.swing.JLabel lGjiniaR;
    private javax.swing.JLabel lMbiemriR;
    private javax.swing.JLabel lNumriShpisR;
    private javax.swing.JLabel lQytetiR;
    private javax.swing.JLabel lRugaR;
    private javax.swing.JLabel lShtetiR;
    private javax.swing.JTextArea txtAreaDetajetTjeraR;
    private javax.swing.JTextField txtEmriR;
    private javax.swing.JPasswordField txtFjalkalimiR;
    private javax.swing.JTextField txtMbiemriR2;
    private javax.swing.JTextField txtNumriShpisR;
    private javax.swing.JTextField txtQytetiR;
    private javax.swing.JTextField txtRugaR;
    private javax.swing.JTextField txtShtetiR;
    // End of variables declaration//GEN-END:variables
}
