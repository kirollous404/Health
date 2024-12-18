
package com.mycompany.project;

import java.sql.*;

/**
 *
 * @author ALY
 */
public class SQLConnection {

    public static void main(String[] args) {
//        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
//            
//            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
//                Statement stnt = con.createStatement();
//                ResultSet rs = stnt.executeQuery("select * from users");
//                while( rs.next()){
//                    System.out.println(rs.getInt(1)+" " + rs.getString(5)+" " + rs.getString(6)+" ");
//                    
//                    
//                }
//            }
//            
//        }
//        catch(ClassNotFoundException | SQLException a){
//            System.out.println(a);
//        }

            
            

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select * from users ");
                
                while( rs.next()){
                    System.out.println(  "member : " + rs.getInt(1)+ "\t username : " + rs.getString(2)+ "\t coach : " + rs.getString(4)+" \t full name : " + rs.getString(5) + " " + rs.getString(6) + "\t End date : " + rs.getDate(7) + "\t Payment : " + rs.getInt(8));
                    
                }
            }

             
            
        }
        catch(ClassNotFoundException | SQLException a){
            System.out.println(a);
        }
//            Admin.memberAdd("sika", "123", 1 , "Ahmed", "Mohammed", 2, 50);
            
        
}
}
