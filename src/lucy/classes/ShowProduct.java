/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.classes;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lucy.GettersSetters.Products;

/**
 *
 * @author Neil
 */
public class ShowProduct {
    
    java.sql.Connection con;
    ResultSet rs;
    
    public List<Products> Product(){
        List CollList = new ArrayList();
        try{
            
        con =  lucy.Connection.Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        rs = stmt.executeQuery("CALL str_showProduct()");
        
        while(rs.next()){
            int ID = rs.getInt(1);
            String Pname = rs.getString(2);
            double PPrice = rs.getDouble(3);
            double sPrice = rs.getDouble(4);
            String type = rs.getString(5);
            String dess = rs.getString(6);
            int item = rs.getInt(7);
            
            Products P = new Products(ID,Pname,PPrice,sPrice,type,dess,item);
            CollList.add(P);
        }
        
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return CollList;
    }
    
    public List<Products> searchProduct(String text){
        List CollList = new ArrayList();
        try{
            
        con =  lucy.Connection.Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        rs = stmt.executeQuery("Select * from products Where P_Name LIKE '"+text+"%' OR P_Code LIKE '"+text+"%'");
        
        while(rs.next()){
            int ID = rs.getInt(1);
            String Pname = rs.getString(2);
            double PPrice = rs.getDouble(3);
            double sPrice = rs.getDouble(4);
            String type = rs.getString(5);
            String dess = rs.getString(6);
            int item = rs.getInt(7);
            
            Products P = new Products(ID,Pname,PPrice,sPrice,type,dess,item);
            CollList.add(P);
        }
        
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return CollList;
    }
}
