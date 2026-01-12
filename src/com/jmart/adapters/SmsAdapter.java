package com.jmart.adapters;

public class SmsAdapter {

    public void send(String phoneNumber, String message){
        System.out.println("SMS sent to " + phoneNumber);
        System.out.println("SMS message: ");
        System.out.println(message);
    }

}
