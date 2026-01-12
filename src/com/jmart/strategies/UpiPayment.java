package com.jmart.strategies;

public class UpiPayment implements PaymentStrategy{

    public void pay(double totalPrice){
        System.out.println("$" + totalPrice + " paid through UPI");
    }

}
