/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.Connection.Connection;
import lucy.Interface.Int_InsertSales;

/**
 *
 * @author Tonix
 */
public class Imp_InsertSales implements Int_InsertSales{
java.sql.Connection con;
PreparedStatement p;
ResultSet rs;
    @Override
    public void sales(int a_id, String s_date, double profit, double cash_received, String t_start, String t_end, int nOitems) {

        try{
        String sql = "CALL str_addSales(?,?,?,?,?,?,?)";
        
        con =  (java.sql.Connection) Connection.getMySqlConnection();
        p = (PreparedStatement) con.prepareStatement(sql);
        
        p.setInt(1,a_id);
        p.setString(2,s_date);
        p.setDouble(3,profit);
        p.setDouble(4,cash_received);
        p.setString(5,t_start);
        p.setString(6,t_end);
        p.setInt(7,nOitems);
        p.executeUpdate();
       
         }catch(Exception a){
            JOptionPane.showMessageDialog(null,a);
        }

    }
    
}
