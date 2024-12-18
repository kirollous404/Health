package com.mycompany.project;

import java.sql.*;
public  class Admin {
    public Admin(){
    }
    
    //Declaring_Variables
    
    private static int clients = 0;
    
    private static int price = Admin.price = 50;
    
    
    
    
    
    
    //Admin_Managment
    
    public static void  setAdminPass(String password){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set password = ? where users.ID = 1 ");
                prep.setString(1, password );
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        
    }
    public static void setAdminUser(String username){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set username = ? where users.ID = 1 ");
                prep.setString(1, username );
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    
    
    
    
    
    
    
    
    
    
    //Member_Managment
    
    public static void memberAdd(String username , String password , int coachid , String firstname , String lastname , int months){
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("INSERT INTO users(username, password, coach_id , fname, lname , end_of_subscribtion , billing) VALUES(?, ?, ?, ?, ?, ?, ?)");
                prep.setString(1, username);
                prep.setString(2, password);
                prep.setInt(3, coachid);
                prep.setString(4, firstname);
                prep.setString(5, lastname);
                long month_ms = 2629746000L;
                int billing = (months * price) ;
                Date enddate = new Date( System.currentTimeMillis() + month_ms * months);
                prep.setDate(6, enddate);
                prep.setInt(7, billing);
                
                prep.executeUpdate();
                clients++;
            }
        }
        catch(ClassNotFoundException | SQLException a){
            System.out.println(a);
        }
    }
    
    public static void memberSub(int ID , int months )
    {
        Date endOfSub = new Date(System.currentTimeMillis());
        int tempBill = 0;
        int billing = months * price ;
        boolean found = false ;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) 
            {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , end_of_subscribtion , billing from users ");
                while (rs.next()) {
                    if (rs.getInt(1) == ID) {
                        Date d = rs.getDate(2);
                        long ms = d.getTime();
                        long month_ms = 2629746000L;
                        endOfSub = new Date(ms + month_ms * months);
                        tempBill = rs.getInt(3);
                        found = true ;
                        break ;
                        
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        if (found){
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set end_of_subscribtion = ? , billing = ?  where users.ID = ?");
                prep.setDate(1, endOfSub);
                int totalBill = billing + tempBill;
                prep.setInt(2, totalBill);
                prep.setInt(3, ID);
                prep.executeUpdate();
            }
        }
        catch(ClassNotFoundException | SQLException a){
            System.out.println(a);
        }
        }
        
    }
    
    public static void memberDelete(int id){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) 
            {
                PreparedStatement prep = con.prepareStatement("delete from users where users.ID = ?");
                prep.setInt(1, id );
                prep.executeUpdate();
                clients--;
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    public static void memberUpdateUser(int id , String username){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set username = ? where users.ID = ? and users.ID > 1 ");
                prep.setString(1, username );
                prep.setInt(2, id );
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    public static void memberUpdatePass(int id , String password){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set password = ? where users.ID = ? and users.ID > 1 ");
                prep.setString(1, password);
                prep.setInt(2, id);
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    public static void memberList(){
//        System.out.println("Number of clients = " + clients);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select * from users where users.ID > 1 ");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getDate(7));
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    
    public static void showMember(int ID){
//        System.out.println("Number of clients = " + clients);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select * from users where users.ID > 1 ");
                while (rs.next()) {
                    if(rs.getInt(1)== ID){
                        
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }

    public static boolean memberSearch(int id) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery(" select ID from users where ID > 1 ");
                
                while (rs.next()) {
                    if (rs.getInt(1) == id) {
                        found = true;
                        break;
//                        System.out.println(rs.getInt(1) + "  " + rs.getString(6) + "  " + "  " + rs.getString(7));
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return found;
    }
    
    public static boolean memberSearchUser(String username) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , username from users");
                
                while (rs.next()) {
                    if (rs.getString(2).equals(username)) {
                        found = true;
                        break;
//                        System.out.println(rs.getInt(1) + "  " + rs.getString(6) + "  " + "  " + rs.getString(7));
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return found;
    }
    
    
    public static void assignMember2Coach(int m_id , int coach_id) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update users set coach_id = ? where users.ID = ? ");
                prep.setInt(1, coach_id);
                prep.setInt(2, m_id);
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Coach_Managment
    
    public static void coachAdd(String username , String password , String firstname , String lastname){
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("INSERT INTO coaches(username, password, fname, lname) VALUES(?, ?, ?, ?)");
                prep.setString(1, username);
                prep.setString(2, password);
                prep.setString(3, firstname);
                prep.setString(4, lastname);
                
                prep.executeUpdate();
                clients++;
            }
        }
        catch(ClassNotFoundException | SQLException a){
            System.out.println(a);
        }
    }
    public static void coachDelete(int id){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("delete from coaches where coaches.ID = ?");
                prep.setInt(1, id );
                prep.executeUpdate();
                clients--;
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    public static void coachUpdateUser(int id , String username){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update coaches set username = ? where coaches.ID = ? ");
                prep.setString(1, username );
                prep.setInt(2, id );
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    public static void coachUpdatePass(int id , String password){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                PreparedStatement prep = con.prepareStatement("update coaches set password = ? where coaches.ID = ? ");
                prep.setString(1, password);
                prep.setInt(2, id);
                prep.executeUpdate();
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }
    public static void coachList(){
        System.out.println("Number of clients = " + clients);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select * from coaches");
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) );
                }
            }
        } 
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
    }

    public static boolean coachSearch(int id) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID from coaches");
                
                while (rs.next()) {
                    if (rs.getInt(1) == id) {
                        found = true;
//                        System.out.println(rs.getInt(1) + "  " + rs.getString(4) + "  " + "  " + rs.getString(5));
                    }
                }
//                if (!found) {
//                    System.out.println("Not found");
//                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return found;
    }
    public static boolean coachSearchUser(String username) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , username from coaches");
                
                while (rs.next()) {
                    if (rs.getString(2).equals(username)) {
                        found = true;
                        break;
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return found;
    }
    
    
    public static void setPrice(int price) {
        Admin.price = price;
    }
    
    public static double getPrice() {
        return price;
    }
}
