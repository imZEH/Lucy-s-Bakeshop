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
 * @author Tonix
 */
public class Showreport {
     java.sql.Connection con;
     ResultSet rs;
     
     public List<Products> Report(String type){
         List CollList = new ArrayList();
         String a = null;
         if(type.equals("Daily")){
             a= "Call str_reportD()";
         }
         else if(type.equals("Monthly")){
             a = "Call str_reportM()";
         }
         else {
            a = "Call str_reportY()";
         }
         
         
         
        try{
            
        con =  lucy.Connection.Connection.getMySqlConnection();
        java.sql.Statement stmt = con.createStatement();
        rs = stmt.executeQuery(a);
        
        while(rs.next()){
            int ID = rs.getInt(1);
            String Pname = rs.getString(2);
            String tITem = rs.getString(3);
            double tSales = rs.getDouble(4);
            String profit = rs.getString(5);
            String date = rs.getString(6);
            
            Products P = new Products(ID,Pname,tITem,tSales,profit,date);
            CollList.add(P);
        }
     
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return CollList;
    }
}
