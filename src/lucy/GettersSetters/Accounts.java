/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.GettersSetters;

import java.awt.Image;

/**
 *
 * @author Tonix
 */
public class Accounts {
    private int A_Id;
    private  String FName;
    private  String LName;
    private  String MName;
    private String Gender;
    private String Address;
    private String ContactNo;
    private String UName;
    private String Password;
    private String Type;
    private String Status;
    private Image Pic;
    private String Path;
    private String Full_name;
    
    private static String Full;
    private static String FN;
    private static String MN;
    private static String LN;
    private static String tpe;
    private static Image im;
    
    public Accounts(){}

	public Accounts(int id,String Fname,String Lname, String Mname ,String Gender, String Add, String Number ,String username, String password, String type,String Status,Image Pic,String path ){
        this.A_Id = id;
        this.FName = Fname;
        this.LName = Lname;
        this.MName = Mname;
        this.Gender = Gender;
        this.Address = Add;
        this.ContactNo = Number;
        this.UName = username;
        this.Password = password;
        this.Type = type;
        this.Pic = Pic;
        this.Path = path;
        this.Status = Status;
        
    }
	
    /**
     * @return the A_Id
     */
    public int getA_Id() {
        return A_Id;
    }

    /**
     * @param A_Id the A_Id to set
     */
    public void setA_Id(int A_Id) {
        this.A_Id = A_Id;
    }

    /**
     * @return the FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * @param FName the FName to set
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * @return the LName
     */
    public String getLName() {
        return LName;
    }

    /**
     * @param LName the LName to set
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * @return the MName
     */
    public String getMName() {
        return MName;
    }

    /**
     * @param MName the MName to set
     */
    public void setMName(String MName) {
        this.MName = MName;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the ContactNo
     */
    public String getContactNo() {
        return ContactNo;
    }

    /**
     * @param ContactNo the ContactNo to set
     */
    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    /**
     * @return the UName
     */
    public String getUName() {
        return UName;
    }

    /**
     * @param UName the UName to set
     */
    public void setUName(String UName) {
        this.UName = UName;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the Pic
     */
    public Image getPic() {
        return Pic;
    }

    /**
     * @param Pic the Pic to set
     */
    public void setPic(Image Pic) {
        this.Pic = Pic;
    }

    /**
     * @return the Path
     */
    public String getPath() {
        return Path;
    }

    /**
     * @param Path the Path to set
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * @return the Full_name
     */
    public String getFull_name() {
        return LName+","+FName+" "+MName;
    }
    public String getFull() {
        return LN+","+FN+" "+MN;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @param Full the Full to set
     */
    

    /**
     * @return the FN
     */
    public String getFN() {
        return FN;
    }

    /**
     * @param FN the FN to set
     */
    public void setFN(String FN) {
        this.FN = FN;
    }

    /**
     * @return the MN
     */
    public String getMN() {
        return MN;
    }

    /**
     * @param MN the MN to set
     */
    public void setMN(String MN) {
        this.MN = MN;
    }

    /**
     * @return the LN
     */
    public String getLN() {
        return LN;
    }

    /**
     * @param LN the LN to set
     */
    public void setLN(String LN) {
        this.LN = LN;
    }

    /**
     * @return the tpe
     */
    public String getTpe() {
        return tpe;
    }

    /**
     * @param tpe the tpe to set
     */
    public void setTpe(String tpe) {
        this.tpe = tpe;
    }

    /**
     * @return the image
     */
    public Image getIm() {
        return im;
    }

    /**
     * @param image the image to set
     */
    public void setIm(Image im) {
        this.im = im;
    }

    /**
     * @param Full_name the Full_name to set
     */
   
    
    
    
}
