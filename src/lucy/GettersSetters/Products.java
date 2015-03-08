/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.GettersSetters;

/**
 *
 * @author Tonix
 */
public class Products {
    private int P_Code;
    private String P_Name;
    private Double Pprice;
    private Double Sprice;
    private String UType;
    private String Description;
    private int item;
    private String date;
    
    public Products(){}
    public Products(int id, String name, double pprice, double sprice, String type,String des,int item){
        this.P_Code = id;
        this.P_Name = name;
        this.Pprice = pprice;
        this.Sprice = sprice;
        this.UType = type;
        this.Description = des;
        this.item = item;
    }
    
    public Products(int a,String b,double c,double d,String e){
        this.P_Code = a;
        this.P_Name = b;
        this.Pprice = c;
        this.Sprice = d;
        this.UType = e;

    }
     public Products(int a,String b,String c,double d,String e,String date){
        this.P_Code = a;
        this.P_Name = b;
        this.Description = c;
        this.Sprice = d;
        this.UType = e;
        this.date = date;

    }
    /**
     * @return the P_Code
     */
    public int getP_Code() {
        return P_Code;
    }

    /**
     * @param P_Code the P_Code to set
     */
    public void setP_Code(int P_Code) {
        this.P_Code = P_Code;
    }

    /**
     * @return the P_Name
     */
    public String getP_Name() {
        return P_Name;
    }

    /**
     * @param P_Name the P_Name to set
     */
    public void setP_Name(String P_Name) {
        this.P_Name = P_Name;
    }

    /**
     * @return the Pprice
     */
    public Double getPprice() {
        return Pprice;
    }

    /**
     * @param Pprice the Pprice to set
     */
    public void setPprice(Double Pprice) {
        this.Pprice = Pprice;
    }

    /**
     * @return the Sprice
     */
    public Double getSprice() {
        return Sprice;
    }

    /**
     * @param Sprice the Sprice to set
     */
    public void setSprice(Double Sprice) {
        this.Sprice = Sprice;
    }

    /**
     * @return the UType
     */
    public String getUType() {
        return UType;
    }

    /**
     * @param UType the UType to set
     */
    public void setUType(String UType) {
        this.UType = UType;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the item
     */
    public int getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(int item) {
        this.item = item;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}
