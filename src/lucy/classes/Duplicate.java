/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.classes;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lucy.GUI_ManagerModule.manager;

/**
 *
 * @author Neil
 */
public class Duplicate {
    
    
    public String AddUser(ResultSet rs)throws Exception{
        String a = null;
        String b =null;
        if(rs.next()){
           a  = rs.getString(1);
            
        }switch (a) {
            case "Username Already Exist":
                JOptionPane.showMessageDialog(null,a,"Error",JOptionPane.ERROR_MESSAGE);
                break;
            case "Product Name Already Exist":
                JOptionPane.showMessageDialog(null,a,"Error",JOptionPane.ERROR_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,a);
                manager.jButton3.setEnabled(true);
                manager.jButton2.setEnabled(true);
                manager.fname.setText("");manager.lname.setText("");manager.mname.setText("");
                manager.gender.setSelectedItem("Male");manager.contact.setText("");manager.add.setText("");
                manager.uname.setText("");manager.pass.setText("");manager.cpass.setText("");
                manager.type.setSelectedItem("Manager");
                manager.pict.setText("No Image");
                manager.pict.setIcon(null);
                break;
        }
        return a;
        }
    
    }

