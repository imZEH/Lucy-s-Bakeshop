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
import lucy.Interface.Int_AddUser;
import lucy.classes.Duplicate;

/**
 *
 * @author Neil
 */
public class Imp_AddUser implements Int_AddUser {
    
    private  java.sql.Connection con ;
    private  PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public void User(String Fname,String Lname, String Mname ,String Gender, String Add, String Number ,String username, String password, String type,String pic ){
        try{
            
       String sql = "CALL str_addUser(?,?,?,?,?,?,?,?,?,?,?)";
       con =  (java.sql.Connection) lucy.Connection.Connection.getMySqlConnection();
       ps =  (PreparedStatement) con.prepareCall(sql);
            
        String picture = pic;
        File f=new File(picture);
        FileInputStream fis;
        fis = new FileInputStream(f);
        
        ps.setString(1, Fname);
        ps.setString(2, Lname);
        ps.setString(3, Mname);
        ps.setString(4, Gender);
        ps.setString(5,Add);
        ps.setString(6, Number);
        ps.setString(7, username);
        ps.setString(8, password);
        ps.setString(9, type);
        ps.setBinaryStream(10, (InputStream)fis, (int)(f.length()));
        ps.setString(11, pic);
        
       rs = ps.executeQuery();
       String b =  new Duplicate().AddUser(rs);
       
       ps.executeUpdate();
       con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
