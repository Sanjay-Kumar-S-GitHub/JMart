package com.jmart.observers;

import com.jmart.entities.Order;
import com.jmart.entities.User;
import com.jmart.adapters.MailAdapter;

public class MailNotifier implements OrderObserver{

    public void update(Order order){
        MailAdapter mailAdapter = new MailAdapter();
        User user = order.getUser();
        String mail = user.getUserMail();
        String message = "Order " + order.getOrderId() + " placed successfully. Total: ₹" + order.getTotalPrice();
        mailAdapter.send(mail, message);
    }

}
