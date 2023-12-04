/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;

public class Sacred {
private Connection con;
private Statement st;
private ResultSet rs;

//============================Starting==>ConnectingToSql===========================================
    public Sacred() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3310/school","root","");
            st = con.createStatement();
            System.out.println("Database is Connected Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//=============================End==>ConnectingToSql===========================================

//============================Starting==>AdminLogging===============================================

public ResultSet getuser (String user, String pass){
    try {
        String query = "select * from login where Username = '"+user+"' and Password  ='"+pass+"'";
        rs = st.executeQuery(query);
    } catch (SQLException e) {
        System.out.println(e);
    }
    return rs;
}
//============================End==>AdminLogging======================================================

//============================Starting==>StudentLogging===============================================

public ResultSet getStudentLogin (String user, String pass){
    try {
        String query = "select * from allstudents where ID = '"+user+"' and stPassword  ='"+pass+"'";
        rs = st.executeQuery(query);
    } catch (SQLException e) {
        System.out.println(e);
    }
    return rs;
}


public ResultSet getStudentRecord (String user){
    try {
        String query = "select * from allstudents where ID = '"+user+"'";
        rs = st.executeQuery(query);
    } catch (SQLException e) {
        System.out.println(e);
    }
    return rs;
}
//============================End==>StudentLogging======================================================

//============================Starting==>InsertStudentData=======================================
public void insert(String Sname, String Sfathername, String Sid, String getClass, String SphoneNO, String Saddress, String daate, String genderr, String studentPassword){

        String sql1 = "insert into allstudents (ID, Name, F_Name, Class, Phone, Address, Date, Gender, stPassword) values ( '"+Sid+"','"+Sname+"', '"+Sfathername+"','"+getClass+"', '"+SphoneNO+"', '"+Saddress+"', '"+daate+"', '"+genderr+"', '"+studentPassword+"')";
        //System.out.println(sql1);
            try {
        st.executeUpdate(sql1);
    } catch (Exception ex) {
                System.out.println("Error in InsertStudentData function "+ex);
        System.out.println(ex);
    }
}
//============================End==>InsertStudentData============================================

//============================Starting==>DisplayingStudentRecord============================================
    public ResultSet displayStudentsRecords(){
        
        
        String sql="select * from allstudents";
        try{
        rs=st.executeQuery(sql);
        
        }catch(Exception e){
        System.out.println("Error in DisplayingStudent Record"+e);
        }
    
        return rs;
    }
//============================End==>DisplayingStudentDate====================================================
    
//============================Starting==>updateStudentData============================================
    public ResultSet getStudentById(String id){
    
        String query = "select *from allstudents where ID = '"+id+"'";
        try {
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("Error in UpdateStudentData"+e);
        }
        return null;
    }   
 //==================================== 
public void studentUpdate(String id, String sName, String Fname,String sClass, String sPhone, String sDate, String sAddress, String Gender){
        
String query = "update allstudents set ID = '"+id+"', Name = '"+sName+"', F_Name = '"+Fname+"', Class = '"+sClass+"', Phone = '"+sPhone+"', Address = '"+sAddress+"', Date = '"+sDate+"', Gender = '"+Gender+"' where ID = '"+id+"'";
    System.out.println(query);
try {
        st.execute(query);
        
    } catch (Exception e) {
        System.out.println("Error in UpdateStudentData"+e);
    }
}
//============================End==>updateStudentData=================================================

//============================Starting==>DeletStudentData=================================================
public void studentDelet(String id){
            
    try {
        
        String query = "DELETE FROM `allstudents` WHERE ID = '"+id+"'";    
        st.executeUpdate(query);
        
    } catch (Exception e) {
        System.out.println("Error in Studentdelet function"+e);
    }
}
//============================End==>DeletStudentData======================================================

//============================Start==>InsertTeachersData======================================================
public void insertTeacher(String Tname, String Tspecialization, String Temail, String phoneNumber, String Tsalary, String Taddress, String Tdate, String gender){

        String sql1 = "insert into teachers (Name, Specialization, Email, Phone, Salary, Address, Date, Gender) values ( '"+Tname+"','"+Tspecialization+"', '"+Temail+"','"+phoneNumber+"', '"+Tsalary+"', '"+Taddress+"', '"+Tdate+"', '"+gender+"')";
        //System.out.println(sql1);
            try {
        st.executeUpdate(sql1);
    } catch (Exception ex) {
                
        System.out.println("Error in InsertTeacherData"+ex);
    }
}
//============================End==>InsertTeachersData==========================================================

//============================Start==>displayTeacherRecord======================================================
 public ResultSet displayTeacherRecords(){
        
        
        String sql="select * from teachers";
        try{
        rs=st.executeQuery(sql);
        
        }catch(Exception e){
        System.out.println("Error in DisplayTeacherRecord"+e);
        }
    
        return rs;
    }       
//============================End==>displayTeacherRecord=========================================================
 
//============================Starting==>updateStudentData=======================================================
    public ResultSet getTeacherById(String id){
    
        String query = "select *from teachers where SNO = '"+id+"'";
        try {
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("Error in UpdateStudentData"+e);
        }
        return null;
    }   
 //==================================== 
public void teacherUpdate(String id, String tname, String Tspec,String Temail, String Tphone, String Tdate, String Taddress,String Tsalary, String Tgender){
        
String query = "update teachers set SNO = '"+id+"', Name = '"+tname+"', Specialization = '"+Tspec+"', Email = '"+Temail+"', Phone = '"+Tphone+"', Address = '"+Taddress+"', Date = '"+Tdate+"',Salary = '"+Tsalary+"' , Gender = '"+Tgender+"' where SNO = '"+id+"'";
    //System.out.println(query);
try {
        st.execute(query);
        
    } catch (Exception e) {
        System.out.println("Error in updateStudentData"+e);
    }
}
//============================End==>updateStudentData===========================================================

//============================Starting==>DeletTeacherData=================================================
public void teacherDelet(String id){
            
    try {
        
        String query = "DELETE FROM `teachers` WHERE SNO = '"+id+"'";
        st.executeUpdate(query);
        
    } catch (Exception e) {
        System.out.println("Error in teacherDelet Function"+e);
        
    }
}
//============================End==>DeletTeacherData======================================================

//============================Starting==>InsertResultData=================================================
public void resultInsert(String Rid, String Rname, String RFname, String ClassBox, String subject1, String subject2, String subject3, String subject4, String subject5){

        String sql1 = "insert into result (ID, Name, F_Name, Class, Subject1, Subject2, Subject3, Subject4, Subject5) values ( '"+Rid+"','"+Rname+"', '"+RFname+"','"+ClassBox+"', '"+subject1+"', '"+subject2+"', '"+subject3+"', '"+subject4+"', '"+subject5+"')";
        //System.out.println(sql1);
            try {
        st.executeUpdate(sql1);
    } catch (Exception ex) {
        System.out.println("Error in insertResultData funtion"+ex);
    }
}
//============================End==>InsertResultData========================================================

//============================Starting==>DisplayingStudentRecord============================================

    public ResultSet displayResult(){
        
        
        String sql="select * from result";
        try{
        rs=st.executeQuery(sql);
        
        }catch(Exception e){
        System.out.println("Error in displayingResult function"+e);
        }
        return rs;
    }
//============================End==>DisplayingStudentDate===================================================

//============================Starting==>updateStudentData=======================================================
    public ResultSet getResultById(String Rid){
    
        String query = "select *from result where ID = '"+Rid+"'";
        try {
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }   
 //==================================== 
public void resultUpdate(String Rid, String Rname, String RFname,String ClassBox, String Subject1, String Subject2, String Subject3,String Subject4, String Subject5){
        
String query = "update result set ID = '"+Rid+"', Name = '"+Rname+"', F_Name = '"+RFname+"', Class = '"+ClassBox+"', Subject1 = '"+Subject1+"', Subject2 = '"+Subject2+"', Subject3 = '"+Subject3+"', Subject4 = '"+Subject4+"' , Subject5 = '"+Subject5+"' where ID = '"+Rid+"'";
    //System.out.println(query);
    
try {
        st.execute(query);
        
    } catch (Exception e) {
      System.out.println("Error in upadateStudentData function"+e);
    }
}
//============================End==>updateStudentData===========================================================

//============================Starting==>DeletStudentData=================================================
public void resultDelet(String Rid){
            
    try {
        
        String query = "DELETE FROM `result` WHERE ID = '"+Rid+"'";    
        st.executeUpdate(query);
        
    } catch (Exception e) {
        System.out.println("Error in resulttdelet function"+e);
    }
}
//============================End==>DeletStudentData======================================================

//============================Starting==>InsertFee+++++++++++++++++=======================================
public void insertFee(String id, String name, String Fname, String ClassBox, String Gender, String Date, String fee){

        String sql1 = "insert into fees (ID, Name, F_Name, Class, Gender, Fee_Date, Fee) values ( '"+id+"','"+name+"', '"+Fname+"','"+ClassBox+"', '"+Gender+"', '"+Date+"','"+fee+"')";
        //System.out.println(sql1);
            try {
        st.executeUpdate(sql1);
    } catch (Exception ex) {
                System.out.println("Error in insertFee function"+ex);
        System.out.println(ex);
    }
}
//============================End==>InsertFee++++++++++++++++++============================================

//============================Starting==>DisplayingFee=====================================================

    public ResultSet displayFee(){
        
        
        String sql="select * from fees";
        try{
        rs=st.executeQuery(sql);
        
        }catch(Exception e){
        System.out.println("Error in displayingFee function"+e);
        }
        return rs;
    }
//============================End==>DisplayingFee===========================================================
    
//============================Starting==>updateFee=======================================================
    public ResultSet getFeeById(String id){
    
        String query = "select *from fees where ID = '"+id+"'";
        try {
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("Error in UpdateFee"+e);
        }
        return null;
    }   
 //==================================== 
public void feeUpdate(String id, String name, String Fname,String Class, String fee, String date, String Gender){
        
String query = "update fees set ID = '"+id+"', Name = '"+name+"', F_Name = '"+Fname+"', Class = '"+Class+"', Gender = '"+Gender+"', Fee_Date = '"+date+"', Fee = '"+fee+"' where ID = '"+id+"'";
    //System.out.println(query);
try {
        st.execute(query);
        
    } catch (Exception e) {
        System.out.println("Error in updateFee"+e);
    }
}
//============================End==>updateFee===========================================================

//============================Starting==>DeletFeesData=================================================
public void feeDelet(String id){
            
    try {
        
        String query = "DELETE FROM `fees` WHERE ID = '"+id+"'";    
        st.executeUpdate(query);        
    } catch (Exception e) {
        System.out.println("Error in feeDelet function"+e);
    }
}
//============================End==>DeletFeesData======================================================

//============================End==>Attendence============================================================
public void attendence(String ID, String Name, String Class, String Date, String Status){

        String sql1 = "insert into attendence (ID, Name, Class, Date, Status) values ( '"+ID+"','"+Name+"', '"+Class+"','"+Date+"', '"+Status+"')";
        //System.out.println(sql1);
            try {
        st.executeUpdate(sql1);
    } catch (Exception ex) {
                System.out.println("Error in attendence function"+ex);
        System.out.println(ex);
    }
}
//============================End==>Attendence============================================================

//============================End==>displayAttendence============================================================
    public ResultSet displayAttendence(){
        
        
        String sql="select * from attendence";
        try{
        rs=st.executeQuery(sql);
        
        }catch(Exception e){
        System.out.println("Error in DisplayingAttendence Record"+e);
        }
    
        return rs;
    }
//============================End==>displayAttendence============================================================

//============================Starting==>updateAttendence=======================================================
    public ResultSet getAttendenceById(String id){
    
        String query = "select *from attendence where ID = '"+id+"'";
        try {
            rs = st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println("Error in UpdateAttendence"+e);
        }
        return null;
    }   
// ==================================== 
public void AttendenceUpdate(String Id,String Name, String Class, String Date,String Status){
        
String query = "update attendence set ID = '"+Id+"',Name = '"+Name+"', Class = '"+Class+"', Date = '"+Date+"', Status = '"+Status+"' where ID = '"+Id+"'";
    //System.out.println(query);
try {
        st.execute(query);
        
    } catch (Exception e) {
        System.out.println("Error in update attendence funtion"+e);
    }
}
//============================End==>updateAttendence===========================================================

//============================Starting==>DeletAttendence===========================================================
public void attendenceDelet(String Id){
            
    try {
        
        String query = "DELETE FROM `attendence` WHERE ID = '"+Id+"'";    
        st.executeUpdate(query);
        
    } catch (Exception e) {
        System.out.println("Error in attendencetdelet function"+e);
    }
}
//============================Ending==>DeletAttendence++++===========================================================

//============================Starting==>StudentCount++++=========================================================== 
public ResultSet countStudents(){
        try {
        
        String sql = "Select count(ID)from allstudents";
        rs = st.executeQuery(sql);
        }catch(Exception e){
            System.out.println("Error in counter function"+e);
        }
        return rs;
}
//============================Ending==>StudentCount++++===========================================================

//============================Starting==>TeacherCount++++===========================================================
public ResultSet countTeachers(){
        try {
        
        String sql = "Select count(SNO)from teachers";
        rs = st.executeQuery(sql);
        }catch(Exception e){
            System.out.println("Error in teachercounter function"+e);
        }
        return rs;
}
//============================Ending==>TeacherCount++++===========================================================

public static void main(String[] args) {
        Sacred m = new Sacred();
    }

    Sacred insert(String text, String text0, String text1, String text2, String text3, String daate, String gender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void resultUpdate(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //void insertFee(String text, String text0, String text1, String aClass, String aClass0, String gender, String daate) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    void insertFee(String text, String text0, String text1, String aClass, String aClass0, String gender, String daate, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void feeUpdate(String text, String text0, String text1, String text2, String text3, String Gender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


