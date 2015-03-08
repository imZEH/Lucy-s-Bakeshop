/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.classes;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lucy.GettersSetters.Accounts;

/**
 *
 * @author Neil
 */
public class ShowUser {
    java.sql.Connection con;
    ResultSet rs;
    
    public List<Accounts> User(){
         List CollList = new ArrayList();
        try{
       
        con =  lucy.Connection.Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        rs = stmt.executeQuery("Select * from accounts Where A_Status = 'Active'");
        while(rs.next()){
            int id = rs.getInt(1);
            String fname = rs.getString(2);
            String lname = rs.getString(3);
            String mname = rs.getString(4);
            String gender = rs.getString(5);
            String add = rs.getString(6);
            String num = rs.getString(7);
            String uname = rs.getString(8);
            String pass = rs.getString(9);
            String type = rs.getString(10);
            String status = rs.getString(11);
            byte[] imagedata = rs.getBytes(12);
            Image img = Toolkit.getDefaultToolkit().createImage(imagedata);
            String path = rs.getString(13);
            
            Accounts EC = new Accounts(id,fname,lname,mname,gender,add,num,uname,pass,type,status,img,path);
            CollList.add(EC);
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
       return CollList;
    }
    
    public List<Accounts> searchUser(String text){
         List CollList = new ArrayList();
        try{
       
        con =  lucy.Connection.Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        rs = stmt.executeQuery("Select * from accounts Where A_Id LIKE '"+text+"%' "
                + "OR A_FirstName LIKE '"+text+"%' OR A_LastName LIKE '"+text+"%' OR A_MiddleName LIKE '"+text+"%' and A_Status = 'Active'");
        while(rs.next()){
            int id = rs.getInt(1);
            String fname = rs.getString(2);
            String lname = rs.getString(3);
            String mname = rs.getString(4);
            String gender = rs.getString(5);
            String add = rs.getString(6);
            String num = rs.getString(7);
            String uname = rs.getString(8);
            String pass = rs.getString(9);
            String type = rs.getString(10);
            String status = rs.getString(11);
            byte[] imagedata = rs.getBytes(12);
            Image img = Toolkit.getDefaultToolkit().createImage(imagedata);
            String path = rs.getString(13);
            
            Accounts EC = new Accounts(id,fname,lname,mname,gender,add,num,uname,pass,type,status,img,path);
            CollList.add(EC);
        }
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
       return CollList;
    }
}
