/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.Interface.Int_UpdateProduct;

/**
 *
 * @author Neil
 */
public class Imp_UpdateProduct implements Int_UpdateProduct{
    private  java.sql.Connection con ;
    private  PreparedStatement ps;
    private ResultSet rs;
    
    @Override
    public void Product(int id,String PName,double Pprice,double Sp,String Utype,String desc,int NoItem){
       try{
           
           String sql = "UPDATE Products set P_Name = '"+PName+"',P_PurchasePrice = '"+Pprice+"',"
                   + "P_SellingPRice = '"+Sp+"',P_UnitType = '"+Utype+"',P_Description = '"+desc+"',P_NoItem = '"+NoItem+"' where P_Code = '"+id+"'";
           con =  (java.sql.Connection) lucy.Connection.Connection.getMySqlConnection();
           ps =  con.prepareCall(sql);
           
           ps.executeUpdate();
           con.close();
           
       } catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }
}
