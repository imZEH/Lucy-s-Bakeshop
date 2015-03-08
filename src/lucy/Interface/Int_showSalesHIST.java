/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.Interface;

import java.util.List;
import lucy.GettersSetters.Accounts;
import lucy.GettersSetters.Products;
import lucy.GettersSetters.Sales;
import lucy.GettersSetters.SalesDetails;

/**
 *
 * @author Tonix
 */
public interface Int_showSalesHIST {
    public List<SalesDetails> salesdet(int tim , String a);
    public List<Accounts> acc();
    public List<Products> pro();
    public List<Sales> sales();
}
