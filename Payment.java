/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class Payment {
    //Declaration
    private double amount;
    
    public Payment(){
        this.amount=0.0;
    }
    
    public Payment(double am){
        this.amount=am;
    }
    
    //Setter
    public void setAmount(double am){
        this.amount=am;
    }
    
    //Getter
    public double getAmount(){
        return this.amount;
    }
    
    public String toString(){
        return "amount paid is "+getAmount();
    }
}
