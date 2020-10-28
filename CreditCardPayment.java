/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class CreditCardPayment extends Payment {
    //Declaration
    private String name;
    private String expireDate;
    private String number;
    
    public CreditCardPayment(){
        this.name="";
        this.expireDate="";
        this.number="";
    }
    
    public CreditCardPayment(double am,String nm, String exDate, String num){
        super(am);
        this.name=nm;
        this.expireDate=exDate;
        this.number=num;
    }
    
    //Setter
    public void setName(String nm){
        this.name=nm;
    }
    public void setExDate(String exDate){
        this.expireDate=exDate;
    }
    public void setNumber(String num){
        this.number=num;
    }
    
    //Getter
    public String getName(){
        return this.name;
    }
    public String getExDate(){
        return this.expireDate;
    }
    public String getNumber(){
        return this.number;
    }
    
    public String toString(){
        return "Using card ("+getName()+" ["+getNumber()+"] exp: "+getExDate()+") \n for credit-card payment, "
                +super.toString();
    }
}
