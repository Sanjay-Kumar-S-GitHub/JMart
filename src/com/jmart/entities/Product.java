package com.jmart.entities;

public class Product {

    private final String productId;
    private final String productName;
    private final double productPrice;

    public Product(String productId, String productName, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public double getProductPrice(){
        return productPrice;
    }

}
