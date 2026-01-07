package com.jmart.strategies;

import com.jmart.entities.Cart;
import com.jmart.entities.CartItem;

public class NoDiscountPricing implements PricingStrategy{

    public double calculateTotal(Cart cart){
        double totalPrice = 0;
        for(CartItem cartItem:cart.getCartItems()){
            totalPrice += cartItem.getProduct().getProductPrice() * cartItem.getProductQuantity();
        }
        return totalPrice;
    }

}
