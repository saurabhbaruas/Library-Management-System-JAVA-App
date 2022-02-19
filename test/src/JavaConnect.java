/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurabh
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    Connection conn;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\saurabh\\Documents\\NetBeansProjects\\Library_MngmntSystm\\Librarymngmnt.sqlite");
            return conn;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    
}
