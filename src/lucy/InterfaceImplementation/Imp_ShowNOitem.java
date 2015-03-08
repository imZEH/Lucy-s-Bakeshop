/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.InterfaceImplementation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.Connection.Connection;
import lucy.Interface.Int_ShowNOitem;

/**
 *
 * @author Tonix
 */
public class Imp_ShowNOitem implements Int_ShowNOitem{
java.sql.Connection con ;
PreparedStatement p;
ResultSet rs;
    @Override
    public int noItem(int p_Id, String dateNOw) {
        int nI = 0;
        try{
            con = (java.sql.Connection) Connection.getMySqlConnection();
                p = (PreparedStatement) con.prepareStatement("call str_showPitem('"+p_Id+"','"+dateNOw+"')");
                rs = p.executeQuery();

                while(rs.next()){ 
                   nI = rs.getInt(1);
                }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return nI;
    }
    
}
