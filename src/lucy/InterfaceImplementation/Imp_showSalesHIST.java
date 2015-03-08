/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lucy.Connection.Connection;
import lucy.GettersSetters.Accounts;
import lucy.GettersSetters.Products;
import lucy.GettersSetters.Sales;
import lucy.GettersSetters.SalesDetails;
import lucy.Interface.Int_showSalesHIST;

/**
 *
 * @author Tonix
 */
public class Imp_showSalesHIST implements Int_showSalesHIST {
java.sql.Connection con ;
ResultSet rs;
Statement st;

List AList;
List PList;
List SList;
    @Override
    public List<SalesDetails> salesdet(int tim,String a) {
        List SDList = new ArrayList();
        AList = new ArrayList();
        PList = new ArrayList();
        SList = new ArrayList();
        String sql = "";
        if(tim ==0)
            sql = "CALL str_AllSalesHIST()";
        else
            sql = "CALL str_SalesHistory('"+a+"')";
        try{
            con =  (java.sql.Connection) Connection.getMySqlConnection();
            java.sql.Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                String Fname = rs.getString(1);
                String LName = rs.getString(2);
                String MName = rs.getString(3);
                String type = rs.getString(4);
                String Date = rs.getString(5);
                String TStart = rs.getString(6);
                String TEnd = rs.getString(7);
                String PName = rs.getString(8);
                int qty = rs.getInt(9);
                String total = rs.getString(10);
                double price = rs.getDouble(11);
                
                SalesDetails sd = new SalesDetails();
                Sales s = new Sales();
                Accounts ac = new Accounts();
                Products pro = new Products();
                
                ac.setFName(Fname);
                ac.setLName(LName);
                ac.setMName(MName);
                ac.setType(type);
                s.setS_Date(Date);
                s.setTransaction_Start(TStart);
                s.setTransaction_End(TEnd);
                pro.setP_Name(PName);
                sd.setQuantity(qty);
                sd.setPrice(price);
                sd.setTotal(total);
                
                SDList.add(sd);
                SList.add(s);
                AList.add(ac);
                PList.add(pro);
                
            }
     
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return SDList;
    }

    @Override
    public List<Accounts> acc() {
       return AList;
    }

    @Override
    public List<Products> pro() {
        return PList;
    }

    @Override
    public List<Sales> sales() {
        return SList;
    }
    
    
}
