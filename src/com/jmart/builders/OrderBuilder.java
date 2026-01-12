package com.jmart.builders;

import java.util.ArrayList;
import java.util.List;

import com.jmart.entities.CartItem;
import com.jmart.entities.User;
import com.jmart.entities.Order;

public class OrderBuilder {

    private String orderId = "1";
    private User user = null;
    private List<CartItem> orderItems = new ArrayList<>();
    private double totalPrice;

    public OrderBuilder setUser(User user){
        this.user = user;
        return this;
    }

    public OrderBuilder setOrderItems(List<CartItem> cartItems){
        orderItems = cartItems;
        return this;
    }

    public OrderBuilder setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
        return this;
    }

    public Order build(){
        return new Order(orderId, user, orderItems, totalPrice);
    }

}
