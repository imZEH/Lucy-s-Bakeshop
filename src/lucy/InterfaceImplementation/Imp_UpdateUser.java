/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.Interface.Int_UpdateUser;
import lucy.classes.Duplicate;

/**
 *
 * @author Neil
 */
public class Imp_UpdateUser implements Int_UpdateUser{
    private  java.sql.Connection con ;
    private  PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public void User(int id,String Fname,String Lname, String Mname ,String Gender, String Add, String Number ,String username, String password, String type,String pic){
        try{
            
            File f=new File(pic);
            FileInputStream fis ;
            fis = new FileInputStream(f);
            
            String sql = "CALL str_updateUser(?,?,?,?,?,?,?,?,?,?,?,?)";
            con =  (java.sql.Connection) lucy.Connection.Connection.getMySqlConnection();
            ps =  con.prepareCall(sql);
            
            ps.setInt(1, id);
            ps.setString(2, Fname);
            ps.setString(3, Lname);
            ps.setString(4, Mname);
            ps.setString(5, Gender);
            ps.setString(6,Add);
            ps.setString(7, Number);
            ps.setString(8, username);
            ps.setString(9, password);
            ps.setString(10, type);
            ps.setBinaryStream(11, (InputStream)fis, (int)(f.length()));
            ps.setString(12, pic);

            

            ps.executeUpdate();
            con.close();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    @Override
    public void DeleteUser(int ID){
        try{
            
            String sql = "Update accounts set A_Status = 'InActive' Where A_Id = '"+ID+"' ";
            con =  (java.sql.Connection) lucy.Connection.Connection.getMySqlConnection();
            ps =  con.prepareCall(sql);
            
            ps.executeUpdate();
            con.close();
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }
}
