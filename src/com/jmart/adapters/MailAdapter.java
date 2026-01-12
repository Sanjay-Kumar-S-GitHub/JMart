package com.jmart.adapters;

public class MailAdapter {

    public void send(String mail, String message){
        System.out.println("Mail sent to " + mail);
        System.out.println("Mail message: ");
        System.out.println(message);
    }

}
