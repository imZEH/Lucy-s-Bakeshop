/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.Connection.Connection;
import lucy.Interface.Int_InsertSD;

/**
 *
 * @author Tonix
 */
public class Imp_InsertSD implements Int_InsertSD{
java.sql.Connection con;
PreparedStatement p;
ResultSet rs;
    @Override
    public void salesDetails(int p_code, double price, int qty, double total,int itemleft) {
        try{
        String sql = "CALL str_addSalesDetails(?,?,?,?,?)";
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        p = (PreparedStatement) con.prepareStatement(sql);
        
        p.setInt(1,p_code);
        p.setDouble(2,price);
        p.setDouble(3,qty);
        p.setDouble(4,total);
        p.setInt(5,itemleft);
        p.executeUpdate();
       
         }catch(Exception a){
            JOptionPane.showMessageDialog(null,a);
        }
    }
    
}
