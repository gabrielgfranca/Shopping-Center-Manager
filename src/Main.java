import models.Address;
import models.Date;
import models.Product;
import models.Store;
import java.util.Scanner;

import static builders.CreateProduct.createProduct;
import static builders.CreateStore.createStore;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Store store = null;
        Product product = null;

        int choice = 0;

        while (choice != 3) {
            System.out.println("----- MENU -----");
            System.out.println("(1) Create Store\n(2) Create Product\n(3) Exit");
            System.out.println("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    store = createStore(input);
                    break;
                case 2:
                    product = createProduct(input);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        }

        if (product != null && store != null) {
            Date referenceDate = new Date(20, 10, 2023);
            if (product.isExpired(referenceDate))
                System.out.println("Product is expired.");
            else
                System.out.println("Product is not expired.");
            System.out.println("\nStore Information's:");
            System.out.println(store.toString());
        } else {
            System.out.println("The Store and Product needs to be created before the verification.");
        }

        input.close();
    }
}