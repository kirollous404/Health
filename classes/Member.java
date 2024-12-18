package com.mycompany.project;


import java.sql.*;

public class Member {

    public Member() {

    }

    static Date showMemEnddate(int ID) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select users.ID , end_of_subscribtion from users where users.ID > 1 ");
                while (rs.next()) {
                    if (rs.getInt(1) == ID) {
                        Date d = rs.getDate(2);
                        return d;

                    }
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        Date s = new Date(0);
        return s;
    }

    static String showMemName(int ID) {
        String s = new String();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select users.ID , users.fname , users.lname from users where users.ID > 1 ");
                while (rs.next()) {
                    if (rs.getInt(1) == ID) {
                        return rs.getString(2) + " " + rs.getString(3);

                    }
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }

        return s;
    }

    public static String showPlanType(int ID) {
        String s = new String();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select users.ID , plan_type from users where users.ID > 1 ");
                while (rs.next()) {
                    if (rs.getInt(1) == ID) {
                        return rs.getString(2);

                    }
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }

        return s;
    }

    public static String showMemDaysPlan(int ID) {
        String s = new String();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select users.ID ,days_plan from users where users.ID > 1 ");
                while (rs.next()) {
                    if (rs.getInt(1) == ID) {
                        return rs.getString(2);

                    }
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }

        return s;
    }
    
    public static String coachName(int ID){
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
    
    public static int showMemID(String username){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try ( Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery(" select ID , username from users where ID > 1 ");
                while (rs.next()) {
                    if(rs.getString(2).equals(username)){
                        return rs.getInt(1);
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return 0;
    }

}
