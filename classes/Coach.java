package com.mycompany.project;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Coach {
    
    public Coach(){
        
    }
    
    public static void putPlan(String plan, int ID){
        plan = plan.toLowerCase();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set plan_type = ? where users.ID = ? ");
                prep.setString(1, plan );
                prep.setInt(2, ID);
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    
    public static int getCoachID(String username) {
        int coachID = 0;
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID,username from coaches");
                while (rs.next()) {
                    if(rs.getString(2).equals(username)){
                         coachID = rs.getInt(1);
                         found = true;
                         break;
                    }   
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        if(found)
        return coachID;
        else
            return -1;
    }                                    
    
    public static int getMemberID(String username) {
        int MemberID = -1;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , username from users where ID > 1 ");
                while (rs.next()) {
                    if(rs.getString(2).equals(username)){
                        MemberID = rs.getInt(1);
                        break;
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return MemberID;
    }                 
    
    public static String SgetMemberID() {
        String MemberID = new String();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID from users ");
                while (rs.next()) {
                        MemberID = rs.getString(1);
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return MemberID;
    }
    
    
    public static int getMemCoachID(int memid){
        int memCoachID=-1;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , coach_id from users where ID > 1 ");
                while (rs.next()) 
                    if(rs.getInt(1) == memid)
                        memCoachID = rs.getInt(2);
                }
            }
         catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return memCoachID;
    
    }
    
    
     public static String getCoachName(int ID){
           String s = new String() ;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select users.ID, users.coach_id  , coaches.ID, coaches.fname , coaches.lname from users join coaches on users.coach_ID = coaches.ID where users.ID > 1 ");
                while (rs.next()) {
                    if(rs.getInt(1) == ID ){
                         return rs.getString(4) + " " + rs.getString(5);
                }
            }
            }} 
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
            return s;

   }
    
    

    
    


    }
    
    
