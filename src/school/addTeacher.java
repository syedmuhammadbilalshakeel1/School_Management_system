/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HAMAZ KHAN
 */
public class addTeacher extends javax.swing.JFrame {

  

    /**
     * Creates new form page2
     */
    public addTeacher() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        female = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tsalary = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Temail = new javax.swing.JFormattedTextField();
        Tspecialization = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tname = new javax.swing.JFormattedTextField();
        add = new javax.swing.JButton();
        Tdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Taddress = new javax.swing.JTextArea();
        phoneNumber = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1550, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 182, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setText("Add Teacher");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 369, 50));

        jLabel11.setText("_________________________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 460, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(44, 165, 182));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 50, 130, 50));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 150, 40));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setText("Gender");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 120, 32));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 150, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Date");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 120, 32));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 120, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setText("Salary");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 120, 32));

        Tsalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsalaryActionPerformed(evt);
            }
        });
        jPanel3.add(Tsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 700, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setText("Phone.No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 120, 32));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel10.setText("Email");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 120, 32));

        Temail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemailActionPerformed(evt);
            }
        });
        Temail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TemailKeyTyped(evt);
            }
        });
        jPanel3.add(Temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 700, 40));

        Tspecialization.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tspecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TspecializationActionPerformed(evt);
            }
        });
        jPanel3.add(Tspecialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 700, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Specialization");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 170, 32));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText(" Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 120, 40));

        Tname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnameActionPerformed(evt);
            }
        });
        jPanel3.add(Tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 700, 40));

        add.setBackground(java.awt.Color.black);
        add.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        add.setForeground(java.awt.Color.white);
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, 170, 50));

        Tdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(Tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 700, 40));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Taddress.setColumns(20);
        Taddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Taddress.setRows(5);
        jScrollPane1.setViewportView(Taddress);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 700, 60));

        phoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        jPanel3.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 700, 40));

        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 270, 190, -1));

        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 230, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1550, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnameActionPerformed

    private void TspecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TspecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TspecializationActionPerformed

    private void TemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemailActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void TsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TsalaryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         dashBoard db = new dashBoard();
        db.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
         SimpleDateFormat sdff = new SimpleDateFormat();   // object is created for date jar 
        String daate = sdff.format(Tdate.getDate());       // daate stores date 
        // below 10 line is for to store gender in the gender variable
        String gender = "";
        if (male.isSelected()) {
            gender = "Male";
        }
        else if(female.isSelected()){
          gender = "Female";
        }
        else {
            gender = "";
        }

        if(Tname.getText().equals("") || Tspecialization.getText().equals("") || Temail.getText().equals("") || phoneNumber.getText().equals("") || Tsalary.getText().equals("") || Taddress.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Pleas, Filled All Field");
         }else{   
            try {
                Sacred ss = new Sacred();
                ss.insertTeacher(Tname.getText(), Tspecialization.getText(), Temail.getText(), phoneNumber.getText(), Tsalary.getText(), Taddress.getText(), daate, gender);
                
                JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
                Tname.setText("");
                Tspecialization.setText("");
                Temail.setText("");
                phoneNumber.setText("");
                Tsalary.setText("");
                Taddress.setText("");
            } catch (Exception e) {
                System.out.println("error in addTeacher botton"+e);
            } 
            }
    }//GEN-LAST:event_addActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void TemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TemailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TemailKeyTyped

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
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Taddress;
    private com.toedter.calendar.JDateChooser Tdate;
    private javax.swing.JFormattedTextField Temail;
    private javax.swing.JFormattedTextField Tname;
    private javax.swing.JFormattedTextField Tsalary;
    private javax.swing.JFormattedTextField Tspecialization;
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JFormattedTextField phoneNumber;
    // End of variables declaration//GEN-END:variables
}
