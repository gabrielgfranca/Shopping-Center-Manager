import java.util.Scanner;

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
                    store = createStore();
                    break;
                case 2:
                    product = createProduct();
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

    public static Store createStore() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the store");
        String storeName = input.nextLine();

        System.out.println("Enter the number of employees");
        int employeeQuantity = input.nextInt();
        input.nextLine();

        System.out.println("Enter the employee base salary");
        double employeeBaseSalary = input.nextDouble();
        input.nextLine();

        System.out.println("Store Address:");
        System.out.print("Street: ");
        String streetName = input.nextLine();
        System.out.print("City: ");
        String cityName = input.nextLine();
        System.out.print("State: ");
        String estateName = input.nextLine();
        System.out.print("Country: ");
        String countryName = input.nextLine();
        System.out.print("Zip code: ");
        String zipCode = input.nextLine();
        System.out.print("Number: ");
        String number = input.nextLine();
        System.out.print("Complement: ");
        String complement = input.nextLine();

        Address storeAddress = new Address(streetName, cityName, estateName, countryName, zipCode, number, complement);

        System.out.println("Store Foundation Date:");
        System.out.print("Day: ");
        int day = input.nextInt();
        input.nextLine();
        System.out.print("Month: ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("Year: ");
        int year = input.nextInt();
        input.nextLine();

        Date foundationDate = new Date(year, month, day);
        Store finalStore = new Store(storeName, employeeQuantity,  employeeBaseSalary, storeAddress, foundationDate);

        System.out.println("Store created successfully!");
        return finalStore;
    }

    public static Product createProduct() {
        Scanner input = new Scanner(System.in);

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