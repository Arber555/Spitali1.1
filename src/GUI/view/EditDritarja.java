/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.view;

import BL.DoktoriRepository;
import BL.SpitaliException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arber
 */
public class EditDritarja extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditDritarja
     */
    
    private DoktoriRepository dr = new DoktoriRepository();
    
    public EditDritarja() {
        initComponents();
        initInformatat();
    }

    
    public void initInformatat()
    {
        txtEmri.setText(Search.d.getEmri());
        txtMbiemri.setText(Search.d.getMbiemri());
        txtShteti.setText(Search.d.getShteti());
        txtQyteti.setText(Search.d.getQyteti());
        txtRuga.setText(Search.d.getRuga());
        txtNumriShpis.setText(Search.d.getNumri().toString());
        txtFjalkalimi.setText(Search.d.getFjalkalimi());
        txtSpecializimi.setText(Search.d.getSpecializimi());
        txtAreaDetajetTjera.setText(Search.d.getDetajetTjera());
        ComboBoxSektori.setSelectedItem(Search.d.getSektoriID().getEmri());
        ComboBoxDita.setSelectedItem(Search.d.getDataLindjes().getDay());




        if(Search.d.getGjinia() == 'M')
        {
            RadioButtonM.setSelected(true);
        }
        else
        {
            RadioButtonF.setSelected(true);
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

        lMbiemri = new javax.swing.JLabel();
        lRuga = new javax.swing.JLabel();
        txtMbiemri = new javax.swing.JTextField();
        txtQyteti = new javax.swing.JTextField();
        lGjinia = new javax.swing.JLabel();
        txtRuga = new javax.swing.JTextField();
        RadioButtonM = new javax.swing.JRadioButton();
        lFjalkalimi = new javax.swing.JLabel();
        lNumriShpis = new javax.swing.JLabel();
        txtFjalkalimi = new javax.swing.JPasswordField();
        RadioButtonF = new javax.swing.JRadioButton();
        lSpecializimi = new javax.swing.JLabel();
        txtNumriShpis = new javax.swing.JTextField();
        txtSpecializimi = new javax.swing.JTextField();
        lDataLindjes = new javax.swing.JLabel();
        lDetajetTjera = new javax.swing.JLabel();
        ComboBoxDita = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDetajetTjera = new javax.swing.JTextArea();
        ComboBoxMuji = new javax.swing.JComboBox();
        ComboBoxViti = new javax.swing.JComboBox();
        BtnRegjistro = new javax.swing.JButton();
        lSpecializimi1 = new javax.swing.JLabel();
        ComboBoxSektori = new javax.swing.JComboBox();
        lEmri = new javax.swing.JLabel();
        lShteti = new javax.swing.JLabel();
        txtShteti = new javax.swing.JTextField();
        txtEmri = new javax.swing.JTextField();
        lQyteti = new javax.swing.JLabel();

        setClosable(true);

        lMbiemri.setText("Mbiemri");

        lRuga.setText("Ruga");

        txtMbiemri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMbiemriActionPerformed(evt);
            }
        });

        txtQyteti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQytetiActionPerformed(evt);
            }
        });

        lGjinia.setText("Gjinia");

        txtRuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRugaActionPerformed(evt);
            }
        });

        RadioButtonM.setText("M");
        RadioButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonMActionPerformed(evt);
            }
        });

        lFjalkalimi.setText("Fjalkalimi");

        lNumriShpis.setText("Nr");

        txtFjalkalimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFjalkalimiActionPerformed(evt);
            }
        });

        RadioButtonF.setText("F");
        RadioButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonFActionPerformed(evt);
            }
        });

        lSpecializimi.setText("Specializimi");

        txtNumriShpis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumriShpisActionPerformed(evt);
            }
        });

        txtSpecializimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializimiActionPerformed(evt);
            }
        });

        lDataLindjes.setText("Data lindjes");

        lDetajetTjera.setText("Detajet tjera");

        ComboBoxDita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dita" }));

        txtAreaDetajetTjera.setColumns(20);
        txtAreaDetajetTjera.setRows(5);
        jScrollPane2.setViewportView(txtAreaDetajetTjera);

        ComboBoxMuji.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muaji" }));

        ComboBoxViti.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Viti" }));

        BtnRegjistro.setText("Edito");
        BtnRegjistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegjistroActionPerformed(evt);
            }
        });

        lSpecializimi1.setText("Sektori");

        ComboBoxSektori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sektori", "Kirurgjisë" }));

        lEmri.setText("Emri");

        lShteti.setText("Shteti");

        txtShteti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShtetiActionPerformed(evt);
            }
        });

        txtEmri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmriActionPerformed(evt);
            }
        });

        lQyteti.setText("Qyteti");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lEmri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lMbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lGjinia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lDataLindjes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lShteti, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lQyteti, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lRuga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lNumriShpis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RadioButtonM)
                                    .addGap(18, 18, 18)
                                    .addComponent(RadioButtonF))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(ComboBoxDita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxMuji, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxViti, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtRuga, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQyteti, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtShteti, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMbiemri, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmri, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumriShpis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lFjalkalimi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFjalkalimi, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDetajetTjera, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lSpecializimi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lSpecializimi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxSektori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnRegjistro)
                                    .addComponent(txtSpecializimi)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(93, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lEmri)
                        .addComponent(txtEmri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lMbiemri)
                        .addComponent(txtMbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lGjinia)
                        .addComponent(RadioButtonM)
                        .addComponent(RadioButtonF))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lDataLindjes)
                        .addComponent(ComboBoxDita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxMuji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBoxViti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lShteti)
                        .addComponent(txtShteti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lQyteti)
                        .addComponent(txtQyteti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lRuga))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lNumriShpis)
                        .addComponent(txtNumriShpis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFjalkalimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lFjalkalimi))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSpecializimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lSpecializimi))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxSektori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lSpecializimi1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lDetajetTjera))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(BtnRegjistro)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMbiemriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMbiemriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMbiemriActionPerformed

    private void txtQytetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQytetiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQytetiActionPerformed

    private void txtRugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRugaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRugaActionPerformed

    private void RadioButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonMActionPerformed
        // TODO add your handling code here:
        if(RadioButtonM.isSelected()){
            RadioButtonF.setSelected(false);
        }
    }//GEN-LAST:event_RadioButtonMActionPerformed

    private void txtFjalkalimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFjalkalimiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFjalkalimiActionPerformed

    private void RadioButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonFActionPerformed
        if(RadioButtonF.isSelected()){
            RadioButtonM.setSelected(false);
        }
    }//GEN-LAST:event_RadioButtonFActionPerformed

    private void txtNumriShpisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumriShpisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumriShpisActionPerformed

    private void txtSpecializimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializimiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializimiActionPerformed

    private void BtnRegjistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegjistroActionPerformed

        if(txtEmri.getText()!=null||txtEmri.getText().trim()!="" && txtMbiemri.getText()!=null||txtMbiemri.getText().trim()!="" &&
            txtShteti.getText()!=null||txtShteti.getText().trim()!="" && txtQyteti.getText()!=null||txtQyteti.getText().trim()!="" &&
            txtRuga.getText()!=null||txtRuga.getText().trim()!="" && txtNumriShpis.getText()!=null||txtNumriShpis.getText().trim()!="" &&
            txtFjalkalimi.getText()!=null||txtFjalkalimi.getText().trim()!="" && txtSpecializimi.getText()!=null||txtSpecializimi.getText().trim()!="" &&
            txtAreaDetajetTjera.getText()!=null||txtAreaDetajetTjera.getText().trim()!="")
        {
            Search.d.setEmri(txtEmri.getText());
            Search.d.setMbiemri(txtMbiemri.getText());
            Search.d.setShteti(txtShteti.getText());
            Search.d.setQyteti(txtQyteti.getText());
            Search.d.setRuga(txtRuga.getText());
            Search.d.setNumri(Integer.parseInt(txtNumriShpis.getText()));
            Search.d.setFjalkalimi(txtFjalkalimi.getText());
            Search.d.setSpecializimi(txtSpecializimi.getText());
            Search.d.setDetajetTjera(txtAreaDetajetTjera.getText());
            //d.setSektoriID();

            if(RadioButtonM.isSelected())
            {
                Search.d.setGjinia('M');
            }
            else
            {
                Search.d.setGjinia('F');
            }

            try
            {
                if(dr.update(Search.d))
                {
                    JOptionPane.showMessageDialog(null, "Eshte edituar doktori!!!");
                    this.dispose();
                }
            }catch(SpitaliException e){
                JOptionPane.showMessageDialog(null, e);
            }

            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_BtnRegjistroActionPerformed

    private void txtShtetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShtetiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShtetiActionPerformed

    private void txtEmriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmriActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegjistro;
    private javax.swing.JComboBox ComboBoxDita;
    private javax.swing.JComboBox ComboBoxMuji;
    private javax.swing.JComboBox ComboBoxSektori;
    private javax.swing.JComboBox ComboBoxViti;
    private javax.swing.JRadioButton RadioButtonF;
    private javax.swing.JRadioButton RadioButtonM;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lDataLindjes;
    private javax.swing.JLabel lDetajetTjera;
    private javax.swing.JLabel lEmri;
    private javax.swing.JLabel lFjalkalimi;
    private javax.swing.JLabel lGjinia;
    private javax.swing.JLabel lMbiemri;
    private javax.swing.JLabel lNumriShpis;
    private javax.swing.JLabel lQyteti;
    private javax.swing.JLabel lRuga;
    private javax.swing.JLabel lShteti;
    private javax.swing.JLabel lSpecializimi;
    private javax.swing.JLabel lSpecializimi1;
    private javax.swing.JTextArea txtAreaDetajetTjera;
    private javax.swing.JTextField txtEmri;
    private javax.swing.JPasswordField txtFjalkalimi;
    private javax.swing.JTextField txtMbiemri;
    private javax.swing.JTextField txtNumriShpis;
    private javax.swing.JTextField txtQyteti;
    private javax.swing.JTextField txtRuga;
    private javax.swing.JTextField txtShteti;
    private javax.swing.JTextField txtSpecializimi;
    // End of variables declaration//GEN-END:variables
}
