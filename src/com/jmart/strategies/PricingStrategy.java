package com.jmart.strategies;

import com.jmart.entities.Cart;

interface PricingStrategy{

    double calculateTotal(Cart cart);

}