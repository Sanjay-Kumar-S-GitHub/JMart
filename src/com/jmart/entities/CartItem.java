package com.jmart.entities;

public class CartItem {

    private final Product product;
    private final int productQuantity;

    public CartItem(Product product, int productQuantity){
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Product getProduct(){
        return product;
    }

    public int getProductQuantity(){
        return productQuantity;
    }

}
