package builders;

import models.Date;
import models.Product;

import java.util.Scanner;

public class CreateProduct {

    public static Product createProduct(Scanner input) {
        System.out.println("Enter the name of the product");
        String productName = input.nextLine();

        System.out.println("Enter the product price");
        double productPrice = input.nextDouble();
        input.nextLine();

        System.out.println("Product Expiration Date: ");
        System.out.println("Day: ");
        int day = input.nextInt();
        input.nextLine();
        System.out.println("Month: ");
        int month = input.nextInt();
        input.nextLine();
        System.out.println("Year: ");
        int year = input.nextInt();
        input.nextLine();

        Date expirationDate = new Date(year, month, day);
        Product product = new Product(productName, productPrice, expirationDate);

        System.out.println("Product created successfully!");
        return product;
    }
}
