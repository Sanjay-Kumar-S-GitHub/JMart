package com.jmart.services;

import java.util.ArrayList;
import java.util.List;

import com.jmart.entities.Product;

public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService(){
        products.add(new Product("1","Television",15000.00));
        products.add(new Product("2","Refrigerator",25000.00));
        products.add(new Product("3","Washing machine",23000.00));
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProductById(String id){
        for(Product product:products){
            if(product.getProductId().equals(id)){
                return product;
            }
        }
        return null;
    }

}
