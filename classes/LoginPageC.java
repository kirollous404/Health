/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ALY
 */
public class LoginPageC {
    
    public LoginPageC(){
    }
    
    
    public static boolean usernameMemberLogin(String username) {
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
    
    
    public static boolean passwordMemberLogin(String username , String password) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , username , password from users");
                
                while (rs.next()) {
                    if (rs.getString(2).equals(username)) {
                        
                        if(rs.getString(3).equals(password))
                        {
                            found=true;
                            break;
                        }
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return found;
    }
    
    
    public static boolean usernameCoachesLogin(String username) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , username from coaches ");
                
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
    
    
    public static boolean passwordCoachLogin(String username , String password) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , username , password from coaches");
                
                while (rs.next()) {
                    if (rs.getString(2).equals(username)) {
                        
                        if(rs.getString(3).equals(password))
                        {
                            found=true;
                            break;
                        }
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return found;
    }
    
    
    public static boolean adminCheckID(String username , String password) {
        boolean found = false;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=GYM;integratedSecurity=false;encrypt=false;trustServerCertificate=false;user=Admin;password=admin")) {
                Statement stnt = con.createStatement();
                ResultSet rs = stnt.executeQuery("select ID , username , password from users where ID = 1");
                
                while (rs.next()) {
                    if(rs.getString(2).equals(username)){
                        if(rs.getString(3).equals(password)){
                            found = true ;
                            break;
                        }
                    }
                }
            }
        }
        catch (ClassNotFoundException | SQLException a) {
            System.out.println(a);
        }
        return found;
    }
}
