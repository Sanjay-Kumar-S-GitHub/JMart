package com.jmart.services;

import java.util.ArrayList;
import java.util.List;

import com.jmart.entities.Order;
import com.jmart.entities.CartItem;
import com.jmart.entities.Product;
import com.jmart.entities.User;
import com.jmart.observers.OrderObserver;

public class OrderService {

    private List<OrderObserver> orderObservers = new ArrayList<>();

    public void placeOrder(Order order){
        System.out.println("Order placed successfully!");
        System.out.println("Order summary: ");
        System.out.println("Order Id: " + order.getOrderId());
        User user = order.getUser();
        System.out.println("Username: " + user.getUserName());
        System.out.println("Ordered items: ");
        int index=1;
        for(CartItem cartItem:order.getOrderItems()){
            Product product = cartItem.getProduct();
            System.out.println("    " + index + " " + product.getProductName() + " " + product.getProductPrice() + " " + cartItem.getProductQuantity());
            index++;
        }
        System.out.println("Total price: " + order.getTotalPrice());
        notifyObservers(order);
    }

    private void notifyObservers(Order order){
        for(OrderObserver orderObserver:orderObservers){
            orderObserver.update(order);
        }
    }

    public void addOrderObserver(OrderObserver orderObserver){
        orderObservers.add(orderObserver);
    }

}
