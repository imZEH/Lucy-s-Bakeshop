/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lucy.Connection.Connection;
import lucy.GettersSetters.Products;

/**
 *
 * @author Tonix
 */
public class Show_Products {
java.sql.Connection con ;
PreparedStatement p;
ResultSet rs;
    public List<Products> products(){
        ArrayList p = new ArrayList();
        try{
           con =  (java.sql.Connection) Connection.getMySqlConnection();
            java.sql.Statement stmt = con.createStatement();
            rs = stmt.executeQuery("CALL str_selectProduct()");
            while(rs.next()){
                int id = rs.getInt(1);
                String pname = rs.getString(2);
                double pprice = rs.getDouble(3);
                double sprice = rs.getDouble(4);
                String type = rs.getString(5);
                
                  Products pr = new Products(id,pname,pprice,sprice,type);
  
                p.add(pr);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return p;
    }
}
