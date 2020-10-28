/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramap
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Payment payment = new Payment();
        CashPayment cashpayment = new CashPayment();
        CreditCardPayment ccp = new CreditCardPayment();
        
        //double paid;
        String choose;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Sales amount? ");
        payment.setAmount(inp.nextDouble());
        //payment.amount=inp.nextDouble();
        System.out.print("Payment type? <Cash> or <Credit> ");
        choose=inp.next();
        
        switch (choose) {
            case "Cash":
            case "cash":
                System.out.print(cashpayment.toString());
                break;
            case "Credit":
            case "credit":
                System.out.print("Credit Card Holder: ");
                ccp.setName(inp.next());
                //ccp.name=inp.nextLine();
                System.out.print("Expire on: (mm/yy) ");
                ccp.setExDate(inp.next());
                //ccp.expireDate=inp.next();
                System.out.print("Credit Card Number: ");
                ccp.setNumber(inp.next());
                //ccp.number=inp.next();
                System.out.print(ccp.toString());
                break;
                
            default:
                System.out.print("ERROR");
                break;
        }
    }
    
}
