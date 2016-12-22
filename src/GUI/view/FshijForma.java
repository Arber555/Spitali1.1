/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.view;

import BL.DoktoriRepository;
import BL.FarmacistiRepository;
import BL.InfermieriRepository;
import BL.RescepsionistiRepository;
import BL.SpitaliException;
import EJB.Doktori;
import EJB.Farmacisti;
import EJB.Motra;
import EJB.Rescepsionisti;
import GUI.model.DoktoriTableModel;
import GUI.model.FarmacistiTableModel;
import GUI.model.InfermieriTableModel;
import GUI.model.RecepsionistiTebleModel;
import Main.SpitaliGUI;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Arber
 */
public class FshijForma extends javax.swing.JInternalFrame {

    public static String emri, mbiemri, shteti, qyteti, fjalkalimi, numri, sektori, gjinia, dataLindjes, specjalizimi, detajetTjera, ruga;
    
    private DoktoriRepository dr = new DoktoriRepository();
    private DoktoriTableModel dtm = new DoktoriTableModel();
    private InfermieriRepository ir = new InfermieriRepository();
    private InfermieriTableModel itm = new InfermieriTableModel();
    private RescepsionistiRepository rr = new RescepsionistiRepository();
    private RecepsionistiTebleModel rtm = new RecepsionistiTebleModel();
    private FarmacistiRepository fr = new FarmacistiRepository();
    private FarmacistiTableModel ftm = new FarmacistiTableModel();
    
    
    public FshijForma() {
        initComponents();
        initTableD();
        initTableM();
        initTableR();
        initTableF();
    }

    private void initTableF()
    {
        List<Farmacisti> list = fr.findAll();
        ftm.add(list);
        farmacistijTable.setModel(ftm);
        ftm.fireTableDataChanged();
    }
    
    public void initTableD()
    {
        List<Doktori> list = dr.findAll();
        dtm.add(list);
        DoktorijTable.setModel(dtm);
        dtm.fireTableDataChanged();
    }
    
    public void initTableM()
    {
        List<Motra> list =  ir.findAll();
        itm.add(list);
        InfermierijTable.setModel(itm);
        itm.fireTableDataChanged();
    }
    
    public void initTableR()
    {
        List<Rescepsionisti> list =  rr.findAll();
        rtm.add(list);
        RecepsionistijTable.setModel(rtm);
        rtm.fireTableDataChanged();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        DoktorijTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InfermierijTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RecepsionistijTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        farmacistijTable = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        DoktorijTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(DoktorijTable);

        jButton1.setText("Detaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Fshij");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton1)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fshij Doktor", jPanel1);

        InfermierijTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(InfermierijTable);

        jButton3.setText("Fshij");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fshij Infermieri ", jPanel2);

        jButton.setText("Fshij");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        RecepsionistijTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(RecepsionistijTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fshij Recepsionisti", jPanel3);

        jButton4.setText("Fshij");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        farmacistijTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(farmacistijTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton4)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fshij Farmacistin", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int row = DoktorijTable.getSelectedRow();
        if(row > -1)
        {
            Doktori d = dtm.getDoktori(row);

            emri = d.getEmri();
            mbiemri = d.getMbiemri();
            shteti = d.getShteti();
            qyteti = d.getQyteti();
            fjalkalimi = d.getFjalkalimi();
            numri = Integer.toString(d.getNumri());
            //sektori = d.getSektoriID().getEmri();
            gjinia = d.getGjinia().toString();
            dataLindjes = d.getDataLindjes().toString();
            specjalizimi = d.getSpecializimi();
            detajetTjera = d.getDetajetTjera();
            ruga = d.getRuga();


            Detajet de = new Detajet();
            SpitaliGUI.desktopPane.add(de);
            de.show();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nuk keni selektuar asni Doktor!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try
        {
            int r = DoktorijTable.getSelectedRow();
            if(r>-1)
            {
                Doktori d = dtm.getDoktori(r);
                System.out.println(d.getId());
                int x = JOptionPane.showConfirmDialog(null, "A jeni i sigurt qe doni te fshini Doktorin?");
                if(x == 0)
                {
                    dr.remove(d);
                    System.out.println("BOni");
                    initTableD();
                }
                else if(x == 1)
                {
                    JOptionPane.showMessageDialog(null, "Doktori nuk eshte fshir");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Doktori nuk eshte fshir");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Nuk keni selektuar asni doktor!!!");
            }
        }catch(SpitaliException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            int r = InfermierijTable.getSelectedRow();
            if(r>-1)
            {
                Motra m = itm.getMotra(r);
                System.out.println(m.getId());
                int x = JOptionPane.showConfirmDialog(null, "A jeni i sigurt qe doni te fshini Infermierin?");
                if(x == 0)
                {
                    ir.remove(m);
                    System.out.println("BOni");
                    initTableM();
                }
                else if(x == 1)
                {
                    JOptionPane.showMessageDialog(null, "Infermierin nuk eshte fshir");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Infermierin nuk eshte fshir");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Nuk keni selektuar asni Infermierin!!!");
            }
        }catch(SpitaliException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        try
        {
            int y = RecepsionistijTable.getSelectedRow();
            if(y>-1)
            {
                Rescepsionisti r = rtm.getRecepsionisti(y);
                System.out.println(r.getId());
                int x = JOptionPane.showConfirmDialog(null, "A jeni i sigurt qe doni te fshini Recepsionisti?");
                if(x == 0)
                {
                    rr.remove(r);
                    System.out.println("BOni");
                    initTableR();
                }
                else if(x == 1)
                {
                    JOptionPane.showMessageDialog(null, "Recepsionisti nuk eshte fshir");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Recepsionisti nuk eshte fshir");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Nuk keni selektuar asni Recepsionisti!!!");
            }
        }catch(SpitaliException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            int y = farmacistijTable.getSelectedRow();
            if(y>-1)
            {
                Farmacisti r = ftm.getFarmacisti(y);
                System.out.println(r.getId());
                int x = JOptionPane.showConfirmDialog(null, "A jeni i sigurt qe doni te fshini farmacistin?");
                if(x == 0)
                {
                    fr.remove(r);
                    System.out.println("BOni");
                    initTableF();
                }
                else if(x == 1)
                {
                    JOptionPane.showMessageDialog(null, "farmacisti nuk eshte fshir");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "farmacisti nuk eshte fshir");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Nuk keni selektuar asni farmacistë!!!");
            }
        }catch(SpitaliException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoktorijTable;
    private javax.swing.JTable InfermierijTable;
    private javax.swing.JTable RecepsionistijTable;
    private javax.swing.JTable farmacistijTable;
    private javax.swing.JButton jButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
