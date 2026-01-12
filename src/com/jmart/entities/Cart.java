package com.jmart.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    final List<CartItem> cartItems = new ArrayList<>();

    public void addCartItem(CartItem cartItem){
        cartItems.add(cartItem);
    }

    public List<CartItem> getCartItems(){
        return cartItems;
    }

}
