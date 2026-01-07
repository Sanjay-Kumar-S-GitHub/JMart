package com.jmart.main;

import java.util.Scanner;

import com.jmart.entities.User;
import com.jmart.entities.Product;
import com.jmart.entities.Cart;
import com.jmart.entities.CartItem;
import com.jmart.services.ProductService;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductService productService = new ProductService();
        Cart cart = new Cart();

        //Welcome message
        System.out.println("Welcome to JMart");

        //Taking in user details
        System.out.println("Enter your Username: ");
        String userName = scanner.nextLine();
        System.out.println("Enter your mail: ");
        String userMail = scanner.nextLine();
        User user = new User(userName,userMail);
        System.out.println("Welcome " + userName + ", Happy shopping!.");

        //Listing available products
        System.out.println("Available products: ");
        System.out.println("---------------------------------------------------------------------------------");
        for(Product product:productService.getAllProducts()){
            System.out.println("Id : " + product.getProductId() + " Name : " + product.getProductName() + " Price : " + product.getProductPrice());
        }
        System.out.println("---------------------------------------------------------------------------------");

        //Adding items to cart
        System.out.println("Add items to cart");
        boolean shopping = true;
        while(shopping){
            System.out.println("Enter the Id of the product you wan to add: ");
            String productId = scanner.nextLine();
            Product product = productService.getProductById(productId);
            if(product==null){
                System.out.println("Enteres invalid product Id! Try again");
                continue;
            }
            System.out.println("enter the quantity of the product you need: ");
            int productQuantity = Integer.parseInt(scanner.nextLine());
            cart.addCartItem(new CartItem(product, productQuantity));
            System.out.println("Product added to cart successfully!");

            System.out.println("Do you want to add any other product? (Y/N): ");
            String ans = scanner.nextLine();
            if(ans.equals("N")){
                shopping = false;
            }
        }

        System.out.println("Thank you for shopping with JMart!");

    }
}
