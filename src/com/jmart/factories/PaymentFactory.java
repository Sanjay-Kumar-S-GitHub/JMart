package com.jmart.factories;

import java.util.HashMap;

import com.jmart.strategies.PaymentStrategy;
import com.jmart.strategies.UpiPayment;
import com.jmart.strategies.CardPayment;
import com.jmart.strategies.CodPayment;

public class PaymentFactory {
    private final HashMap<String,PaymentStrategy> paymentStrategyMap = new HashMap<>();

    public PaymentFactory(){
        paymentStrategyMap.put("UPI",new UpiPayment());
        paymentStrategyMap.put("CARD",new CardPayment());
        paymentStrategyMap.put("COD",new CodPayment());
    }

    public PaymentStrategy getPaymentStrategy(String paymentStrategyName){
        return paymentStrategyMap.get(paymentStrategyName);
    }
}
