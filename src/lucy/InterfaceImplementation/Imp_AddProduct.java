/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.Interface.Int_AddProduct;
import lucy.classes.Duplicate;

/**
 *
 * @author Neil
 */
public class Imp_AddProduct implements Int_AddProduct{
    
    private  java.sql.Connection con ;
    private  PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public void Product(String PName,double Pprice,double Sp,String Utype,String desc,int NoItem){
      try{
          
          String sql = "CALL str_addProduct(?,?,?,?,?,?)";
          con =  (java.sql.Connection) lucy.Connection.Connection.getMySqlConnection();
          ps =  con.prepareCall(sql);
          
          ps.setString(1, PName);
          ps.setDouble(2, Pprice);
          ps.setDouble(3, Sp);
          ps.setString(4, Utype);
          ps.setString(5, desc);
          ps.setInt(6, NoItem);
          
          rs = ps.executeQuery();
          String b =  new Duplicate().AddUser(rs);
          
          ps.executeUpdate();
          con.close();
          
      }  catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    }
}
