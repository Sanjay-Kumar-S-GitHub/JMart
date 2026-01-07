package com.jmart.entities;

public class User {

    private final String userName;
    private final String userMail;

    public User(String userName, String userMail){
        this.userName = userName;
        this.userMail = userMail;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserMail(){
        return userMail;
    }

}
