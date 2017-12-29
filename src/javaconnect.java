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

public class javaconnect {
    
    Connection conn = null;
    public  static Connection ConnecrDb(){
        
        try{
            Class.forName("org.");
            Connection conn  = DriverManager.getConnection("");
            return conn;
        }catch(Exception ex){
            printStackTrace(ex);
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
}
