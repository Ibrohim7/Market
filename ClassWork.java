package com.SetApp;

import com.SetApp.entity.Product;
import com.SetApp.entity.Purchase;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork {
    static Product[] products = new Product[5];
    static Purchase[] purchases = new Purchase[5];
    static int i = 0;

    public static void addProduct(Scanner scanner) {
        Product product = new Product();
        System.out.println("Enter product name");
        String name = scanner.next();
        System.out.println("Enter product price");
        double price = scanner.nextDouble();
        System.out.println("Enter product barcode");
        String barcode = scanner.next();
        System.out.println("Enter product qty");

        product.setName(name);
        product.setPrice(price);
        product.setBarcode(barcode);
        product.setId(i);
        products[i] = product;
        i++;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command = 0;
        while (true) {
            System.out.println("1=>ADD product " + "\n" +
                    "2=>Product list " + "\n" +
                    "3=>Purchase product");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    System.out.println(Arrays.toString(products));
                    break;
                case 3:
                    System.out.println("Choose product");
                    System.out.println(Arrays.toString(products));
                    int id = scanner.nextInt();
                    System.out.println(products[id]);
                    Product product = products[id];
                    Purchase purchase = new Purchase();
                    purchase.setProduct(product);
            }
        }


    }
}
