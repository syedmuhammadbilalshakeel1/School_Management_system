/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import java.awt.*;
import static java.lang.System.exit;
import javax.swing.JFrame;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author Haris Khan
 */
public class StudentSection1 extends javax.swing.JFrame {

    /**
     * Creates new form StudentSection1
     */
     
    public StudentSection1() {
        initComponents();
    }
    
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    public void showLineChart(){
        //create dataset for the graph
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Attendence","Months","Present", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
        
        ResultSet rs; 
      Sacred db=new Sacred();
      rs=db.attendenceGraph(user.getText());
      try{
      while(rs.next()){
           int month = rs.getInt("Month");
           int presentCount = rs.getInt("PresentCount");
           System.out.println("months and count is "+month+presentCount);
           dataset.setValue(presentCount, "Amount", getMonthAbbreviation(month));
      }
      }catch(Exception e){
          System.out.println("Error in attendence chart main frame"+e);      
      }
    }
    
public String getMonthAbbreviation(int month) {
        // You can customize this method to return the appropriate month abbreviation
        // based on your requirements
        // For simplicity, assuming months are represented as integers (1 for Jan, 2 for Feb, etc.)
        // and returning three-letter abbreviations
        switch (month) {
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "Apr";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default: return "";
        }
    }


    
    boolean resultStatus = true;
    boolean feeStatus = true;
    public void FeeReport()
    {
      ResultSet rs; 
      Sacred db=new Sacred();
      rs=db.displayFeeChart(user.getText());
      DefaultTableModel tb=(DefaultTableModel)feeTable.getModel();
      
      try{
      while(rs.next()){
          
          String []data={
              rs.getString("ID"),
              rs.getString("Name"),
              rs.getString("F_Name"),
              rs.getString("Fee"),
              rs.getString("Class"),
              rs.getString("Fee_Date"),
              rs.getString("Gender")
          };
        tb.addRow(data);
      }
      }catch(Exception e){
          System.out.println("Error in viewTableofFee"+e);      
      }
    }
    
    int status = 1;
    public void loginAuth()
    {                      
        if (user.getText().equals("") || pass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter Username and Password");            
        } else {
        try{
            Sacred s = new Sacred();
            ResultSet rs = s.getStudentLogin(user.getText(),pass.getText());
            dataset.clear(); // to clear line chart data
            dataset1.clear(); // to claear bar chart data
            if (rs.next()) {
                getData();
                showLineChart();
                getExamRecord();
                FeeReport();
            }
            else{
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }
            catch(Exception e){
                    System.out.println(e);
                    }                               
    }
 }
    
    public void getData()
    {                                       
        DefaultTableModel tb=(DefaultTableModel)sPersonalRecordTable.getModel();
        sPersonalRecordTable.setRowHeight(32);   
        Sacred s = new Sacred();
        ResultSet rs1 = s.getStudentRecord(user.getText(),pass.getText());
        
        try{
            if(rs1.next() == false)
            {
                status = 0;
            }
            else{
              String []data={
              rs1.getString("ID"),
              rs1.getString("Name"),
              rs1.getString("F_Name"),
              rs1.getString("Class"),
              rs1.getString("Phone"),
              rs1.getString("Address"),
              rs1.getString("Date"),
              rs1.getString("Gender")
          };
        tb.addRow(data);
            }
            
        }
            catch(Exception e){
                    System.out.println(e);
                    }                               
    }
    
    DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
    public void getExamRecord()
    {
        double sub1 = 0;
        double sub2 = 0;
        double sub3 = 0;
        double sub4 = 0;
        double sub5 = 0;
        DefaultTableModel tb = (DefaultTableModel)sExamRecordTable.getModel();
        sExamRecordTable.setRowHeight(32);
        try{
            Sacred s = new Sacred();
            ResultSet rs = s.getExamRecord(user.getText());
            if (rs.next()) {
                
                String subject1 = rs.getString("Subject1").toString();
                String subject2 = rs.getString("Subject2").toString();
                String subject3 = rs.getString("Subject3").toString();
                String subject4 = rs.getString("Subject4").toString();
                String subject5 = rs.getString("Subject5").toString();
                
                sub1 = Double.parseDouble(subject1);
                sub2 = Double.parseDouble(subject2);
                sub3 = Double.parseDouble(subject3);
                sub4 = Double.parseDouble(subject4);
                sub5 = Double.parseDouble(subject5);
          
                double Total1 = sub1 + sub2 + sub3 + sub4 + sub5;
//                String Total = Float.toString(Total1);
                String Total = String.valueOf(Total1);

                String Grade = "";
                  if (Total1 >= 400) {
                      Grade = "A+";
                  }
                  else if(Total1 >= 350){
                       Grade = "A";
                  }     
                  else if(Total1 >= 300){
                       Grade = "B";
                  }     
                  else if(Total1 >= 250){
                       Grade = "C";
                  }
                  else if(Total1 >= 200){
                       Grade = "D";
                  }
                  else if(Total1 >= 199){
                       Grade = "E";

                  } else {
                      Grade = "F";
                  }

                
                
                
            String []data={
                rs.getString("ID"),
                rs.getString("Name"),
                rs.getString("F_Name"),
                rs.getString("Class"),
                rs.getString("Subject1"),
                rs.getString("Subject2"),
                rs.getString("Subject3"),
                rs.getString("Subject4"),
                rs.getString("subject5"),
                Total,
                Grade
            };
        tb.addRow(data);
            }
            else{
                resultStatus = false;
            }
        }
            catch(Exception e){
                    System.out.println(e);
            }
        
        dataset1.setValue(sub1, "Amount", "Subject1");
        dataset1.setValue(sub2, "Amount", "Subject2");
        dataset1.setValue(sub3, "Amount", "Subject3");
        dataset1.setValue(sub4, "Amount", "Subject4");
        dataset1.setValue(sub5, "Amount", "Subject5");
        
        JFreeChart chart = ChartFactory.createBarChart("Result","Subjects","Marks", 
                dataset1, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        jPanel2.removeAll();
        jPanel2.add(barpChartPanel, BorderLayout.CENTER);
        jPanel2.validate();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whiteBackground = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        addStudent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        personalDetails = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        userS = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        passS = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        login1 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sPersonalRecordTable = new javax.swing.JTable();
        examDetails1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sExamRecordTable = new javax.swing.JTable();
        panelLineChart = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        examDetails2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        feeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1550, 900));
        setMinimumSize(new java.awt.Dimension(1550, 900));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        whiteBackground.setBackground(new java.awt.Color(255, 255, 255));
        whiteBackground.setMaximumSize(new java.awt.Dimension(1550, 900));
        whiteBackground.setMinimumSize(new java.awt.Dimension(1550, 900));
        whiteBackground.setPreferredSize(new java.awt.Dimension(1550, 900));
        whiteBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(45, 164, 211));
        jPanel6.setPreferredSize(new java.awt.Dimension(1070, 100));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addStudent.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        addStudent.setText("  Students Record");
        jPanel6.add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 510, 40));

        jLabel2.setText("___________________________________________________________________");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 640, -1));

        whiteBackground.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1770, 120));

        personalDetails.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        personalDetails.setText("Personal Details");
        whiteBackground.add(personalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 30));

        userS.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        userS.setText("USER ID");

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        passS.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        passS.setText("PASSWORD");

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        login1.setBackground(new java.awt.Color(53, 53, 239));
        login1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        login1.setForeground(new java.awt.Color(255, 255, 255));
        login1.setText("LOGIN");
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });

        backBtn.setBackground(java.awt.Color.gray);
        backBtn.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(userS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(passS, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        whiteBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1650, 100));

        sPersonalRecordTable.setBackground(new java.awt.Color(102, 204, 255));
        sPersonalRecordTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sPersonalRecordTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sPersonalRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Father Name", "Class", "Phone NO.", "Address", "Date", "Gender"
            }
        ));
        sPersonalRecordTable.setFocusable(false);
        sPersonalRecordTable.setGridColor(new java.awt.Color(255, 0, 51));
        sPersonalRecordTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(sPersonalRecordTable);

        whiteBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 1430, 60));

        examDetails1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        examDetails1.setText("Fee Record");
        whiteBackground.add(examDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 220, 50));

        sExamRecordTable.setAutoCreateRowSorter(true);
        sExamRecordTable.setBackground(new java.awt.Color(127, 218, 255));
        sExamRecordTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sExamRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "F/Name", "Class", "Subject 1", "Subjec 2", "Subject 3", "Subject 4", "Subject 5", "Total", "Grade"
            }
        ));
        sExamRecordTable.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(sExamRecordTable);

        whiteBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 1430, 60));

        panelLineChart.setLayout(new java.awt.BorderLayout());
        whiteBackground.add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 550, 270));

        jPanel2.setLayout(new java.awt.BorderLayout());
        whiteBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 550, 270));

        examDetails2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        examDetails2.setText("Exam Record");
        whiteBackground.add(examDetails2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 220, 50));

        feeTable.setBackground(new java.awt.Color(127, 218, 255));
        feeTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        feeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "I.D", "Name", "Father Name", "Fee", "Class", "Date", "Gender"
            }
        ));
        feeTable.setRowHeight(30);
        jScrollPane3.setViewportView(feeTable);

        whiteBackground.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 1430, 60));

        getContentPane().add(whiteBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1550, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        // TODO add your handling code here:
//        System.out.println("status is the "+ feeStatus);
        sPersonalRecordTable.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Father Name","Class","Phnoe No.","Address","Date","Gender"}));
        sExamRecordTable.setModel(new DefaultTableModel(null,new String[]{"ID","Name","F/Name","Class","Subject 1","Subject 2","Subject 3","Subject 4","Subject 5","Address","Date","Gender"}));
        feeTable.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Father Name","Fee","Class","Date","Gender"}));
        
        loginAuth();
        
    }//GEN-LAST:event_login1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        LandingPage landingPage = new LandingPage();
        landingPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSection1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addStudent;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel examDetails1;
    private javax.swing.JLabel examDetails2;
    private javax.swing.JTable feeTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton login1;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passS;
    private javax.swing.JLabel personalDetails;
    private javax.swing.JTable sExamRecordTable;
    private javax.swing.JTable sPersonalRecordTable;
    private javax.swing.JTextField user;
    private javax.swing.JLabel userS;
    private javax.swing.JPanel whiteBackground;
    // End of variables declaration//GEN-END:variables
}
