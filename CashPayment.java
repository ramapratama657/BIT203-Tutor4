/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
public class CashPayment extends Payment{
    public CashPayment(double am){
        super(am);
    }
    public CashPayment(){
        
    }
    public String toString(){
        return "Cash payment, "+super.toString();
    }
}
