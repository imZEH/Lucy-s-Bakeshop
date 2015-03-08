/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.Connection.Connection;
import lucy.GettersSetters.Accounts;
import lucy.Interface.Int_ShowUser;

/**
 *
 * @author Tonix
 */
public class Imp_ShowUser implements Int_ShowUser{
java.sql.Connection con ;
PreparedStatement p;
ResultSet rs;
    @Override
    public int user(String uname, String pass) {
        int id = 0;
        String FName="",MName="",LName="",Type="";
        byte[] pic= null;
        try{
                con = (java.sql.Connection) Connection.getMySqlConnection();
                p = (PreparedStatement) con.prepareStatement("call str_selectAccount('"+uname+"','"+pass+"')");
                rs = p.executeQuery();

                while(rs.next()){ 
                   id = rs.getInt(1);
                   FName = rs.getString(2);
                   MName = rs.getString(3);
                   LName = rs.getString(4);
                   Type = rs.getString(5);
                   pic = rs.getBytes(6);
                }
                Accounts acc = new Accounts();
                   acc.setA_Id(id);
                   acc.setFN(FName);
                   acc.setMN(MName);
                   acc.setLN(LName);
                   acc.setTpe(Type);
                   Image img = Toolkit.getDefaultToolkit().createImage(pic);
                   acc.setIm(img);
            }catch(Exception a){
               // JOptionPane.showMessageDialog(null,a);
            }
        return id;
    }
    
}
