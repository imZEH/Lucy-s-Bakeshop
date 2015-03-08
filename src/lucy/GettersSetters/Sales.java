/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lucy.GettersSetters;

/**
 *
 * @author Tonix
 */
public class Sales {
    private int S_Code;
    private int A_Id;
    private String S_Date;
    private Double Profit;
    private Double Cash_received;
    private String Transaction_Start;
    private String Transaction_End;
    private int Number_of_Items;

    /**
     * @return the S_Code
     */
    public int getS_Code() {
        return S_Code;
    }

    /**
     * @param S_Code the S_Code to set
     */
    public void setS_Code(int S_Code) {
        this.S_Code = S_Code;
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
     * @return the S_Date
     */
    public String getS_Date() {
        return S_Date;
    }

    /**
     * @param S_Date the S_Date to set
     */
    public void setS_Date(String S_Date) {
        this.S_Date = S_Date;
    }

    /**
     * @return the Profit
     */
    public Double getProfit() {
        return Profit;
    }

    /**
     * @param Profit the Profit to set
     */
    public void setProfit(Double Profit) {
        this.Profit = Profit;
    }

    /**
     * @return the Cash_received
     */
    public Double getCash_received() {
        return Cash_received;
    }

    /**
     * @param Cash_received the Cash_received to set
     */
    public void setCash_received(Double Cash_received) {
        this.Cash_received = Cash_received;
    }

    /**
     * @return the Transaction_Start
     */
    public String getTransaction_Start() {
        return Transaction_Start;
    }

    /**
     * @param Transaction_Start the Transaction_Start to set
     */
    public void setTransaction_Start(String Transaction_Start) {
        this.Transaction_Start = Transaction_Start;
    }

    /**
     * @return the Transaction_End
     */
    public String getTransaction_End() {
        return Transaction_End;
    }

    /**
     * @param Transaction_End the Transaction_End to set
     */
    public void setTransaction_End(String Transaction_End) {
        this.Transaction_End = Transaction_End;
    }

    /**
     * @return the Number_of_Items
     */
    public int getNumber_of_Items() {
        return Number_of_Items;
    }

    /**
     * @param Number_of_Items the Number_of_Items to set
     */
    public void setNumber_of_Items(int Number_of_Items) {
        this.Number_of_Items = Number_of_Items;
    }
}
