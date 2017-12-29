/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

import java.sql.*;
import java.swing.*;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeError.getStackTrace;

public class javaconnect {
    
    Connection conn = null;
    public  static Connection ConnecrDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/deno/","root","");
            return conn;
        }catch(Exception ex){
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}
