package com.jmart.strategies;

import com.jmart.entities.Cart;

public interface PricingStrategy{

    double calculateTotal(Cart cart);

}