package builders;

import models.Address;
import models.Date;
import models.Store;

import java.util.Scanner;

public class CreateStore {

    public static Store createStore(Scanner input) {
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
        String stateName = input.nextLine();
        System.out.print("Country: ");
        String countryName = input.nextLine();
        System.out.print("Zip code: ");
        String zipCode = input.nextLine();
        System.out.print("Number: ");
        String number = input.nextLine();
        System.out.print("Complement: ");
        String complement = input.nextLine();

        Address storeAddress = new Address(streetName, cityName, stateName, countryName, zipCode, number, complement);

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
}
