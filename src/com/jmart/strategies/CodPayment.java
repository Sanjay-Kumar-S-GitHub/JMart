package com.jmart.strategies;

public class CodPayment implements PaymentStrategy{

    public void pay(double totalPrice){
        System.out.println("$" + totalPrice + " to be paid through COD");
    }

}
