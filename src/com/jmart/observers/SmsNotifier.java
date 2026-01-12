package com.jmart.observers;

import com.jmart.entities.Order;
import com.jmart.entities.User;
import com.jmart.adapters.SmsAdapter;

public class SmsNotifier implements OrderObserver{

    public void update(Order order){
        SmsAdapter  smsAdapter = new SmsAdapter ();
        User user = order.getUser();
        //String phoneNumber = user.getUserPhoneNumber();
        String message = "Order " + order.getOrderId() + " placed successfully. Total: ₹" + order.getTotalPrice();
        //smsAdapter.send(phoneNumber, message);
    }

}
