package com.jmart.strategies;

public class CardPayment implements PaymentStrategy{

    public void pay(double totalPrice){
        System.out.println("$" + totalPrice + " paid through card");
    }

}
