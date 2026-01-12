package com.jmart.entities;

import java.util.List;

public class Order {

    private final String orderId;
    private final User user;
    private final List<CartItem> orderItems;
    private final double totalPrice;

    public Order(String orderId, User user, List<CartItem> orderItems, double totalPrice){
        this.orderId = orderId;
        this.user = user;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
    }

    public String getOrderId(){
        return orderId;
    }

    public User getUser(){
        return user;
    }

    public List<CartItem> getOrderItems(){
        return orderItems;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

}
