/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Haris Khan
 */
public class studentSearch extends javax.swing.JFrame {

    /**
     * Creates new form teacherSearch
     */
    public studentSearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Delet = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sAddress = new javax.swing.JTextArea();
        id = new javax.swing.JTextField();
        Sname = new javax.swing.JTextField();
        Fname = new javax.swing.JTextField();
        sClass = new javax.swing.JTextField();
        sPhone = new javax.swing.JTextField();
        sDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_male = new javax.swing.JRadioButton();
        btn_female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1550, 900));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.orange);
        jLabel2.setText("Student Detail Modifiction");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 570, 43));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 130, 43));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 130, 43));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Father Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 130, 43));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Class");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 130, 43));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone NO.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 130, 43));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Joining Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 130, 43));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 130, 43));

        jLabel17.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Gender");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 130, 43));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("__________________________________________________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 700, -1));

        Update.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 160, 50));

        Delet.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Delet.setText("Delet");
        Delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletActionPerformed(evt);
            }
        });
        jPanel1.add(Delet, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 730, 160, 50));

        Back.setBackground(java.awt.Color.cyan);
        Back.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 730, 160, 50));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("__________________________________________________________________________________________________");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, 700, -1));

        sAddress.setColumns(20);
        sAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sAddress.setRows(5);
        jScrollPane1.setViewportView(sAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 320, 80));

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 290, 30));

        Sname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });
        jPanel1.add(Sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 290, 30));

        Fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        jPanel1.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 290, 30));

        sClass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sClassActionPerformed(evt);
            }
        });
        jPanel1.add(sClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 290, 30));

        sPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(sPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 290, 30));

        sDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDateActionPerformed(evt);
            }
        });
        jPanel1.add(sDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 290, 30));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 227, 130, 40));

        buttonGroup1.add(btn_male);
        btn_male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_male.setText("Male");
        jPanel1.add(btn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 140, -1));

        buttonGroup1.add(btn_female);
        btn_female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_female.setText("Female");
        btn_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_femaleActionPerformed(evt);
            }
        });
        jPanel1.add(btn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1447, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        int opt = JOptionPane.showConfirmDialog(null, "Are You Sure To Delet", "Delet", JOptionPane.YES_NO_OPTION);
        if(opt == 0){
        try {
            s.studentDelet((id.getText()));
            id.setText("");
            Sname.setText("");
            Fname.setText("");
            sClass.setText("");
            sPhone.setText("");
            sDate.setText("");
            sAddress.setText("");
            JOptionPane.showMessageDialog(this, "Data Deleted Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_DeletActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        viewStudent vs = new viewStudent();
        vs.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        String Gender = "";
        if(btn_male.isSelected()){
        Gender = "Male";
        } else if(btn_female.isSelected()){
        Gender = "Female";
        }
        try {
            s.studentUpdate(id.getText(), Sname.getText(), Fname.getText(), sClass.getText(), sPhone.getText(), sDate.getText(), sAddress.getText(), Gender);
            id.setText("");
            Sname.setText("");
            Fname.setText("");
            sClass.setText("");
            sPhone.setText("");
            sDate.setText("");
            sAddress.setText("");
            JOptionPane.showMessageDialog(this, "Data Updated Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void sClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sClassActionPerformed

    private void sPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sPhoneActionPerformed

    private void sDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDateActionPerformed
        // TDO add your handling code here:
    }//GEN-LAST:event_sDateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Sacred s = new Sacred();
        
        ResultSet rs = s.getStudentById((id.getText()));
        try {
             if(rs.next() == false){
            JOptionPane.showMessageDialog(this, "Record not found");
            id.setText("");
            }
            else{
            //rs.next();
            //SID.setText(rs.getString("ID"));
            Sname.setText(rs.getString("Name"));
            Fname.setText(rs.getString("F_Name"));
            sClass.setText(rs.getString("Class"));
            sPhone.setText(rs.getString("Phone"));
            sDate.setText(rs.getString("Date"));
            String Gender = rs.getString("Gender");
            if ("Male".equals(Gender)) {
                btn_male.setSelected(true);
            } else if("Female".equals(Gender)) {
                btn_female.setSelected(true);
            }
            sAddress.setText(rs.getString("Address"));
             }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_femaleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Delet;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Sname;
    private javax.swing.JButton Update;
    private javax.swing.JRadioButton btn_female;
    private javax.swing.JRadioButton btn_male;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea sAddress;
    private javax.swing.JTextField sClass;
    private javax.swing.JTextField sDate;
    private javax.swing.JTextField sPhone;
    // End of variables declaration//GEN-END:variables
}