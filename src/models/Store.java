package models;

import java.util.Arrays;

public class Store {
    private String name;
    private int employeeQuantity;
    private double employeeBaseSalary;
    private Address address;
    private Date foundationDate;
    private Product[] stockProducts;

    public Store(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, int maximumStock) {
        this.name = name;
        this.employeeQuantity = employeeQuantity;
        this.employeeBaseSalary = employeeBaseSalary;
        this.address = address;
        this.foundationDate = fundationDate;
        this.stockProducts = new Product[maximumStock];
    }

    public Store(String name, int employeeQuantity, Address address, Date fundationDate,  int productMaximumStock) {
        this.name = name;
        this.employeeQuantity = employeeQuantity;
        this.employeeBaseSalary = -1;
        this.address = address;
        this.foundationDate = fundationDate;
        this.stockProducts = new Product[productMaximumStock];
    }

    public String getName() { return name; }
    public int getEmployeeQuantity() { return employeeQuantity; }
    public double getEmployeeBaseSalary() { return employeeBaseSalary; }
    public Address getAddress() { return address; }
    public Date getFoundationDate() { return foundationDate; }
    public Product[] getStockProducts() { return stockProducts; }
    public String getType() { return "Generic"; }
    public void setName(String name) { this.name = name; }
    public void setEmployeeQuantity(int employeeQuantity) { this.employeeQuantity = employeeQuantity; }
    public void setEmployeeBaseSalary(double employeeBaseSalary) { this.employeeBaseSalary = employeeBaseSalary; }
    public void setAddress(Address address) { this.address = address; }
    public void setFoundationDate(Date foundationDate) { this.foundationDate = foundationDate; }
    public void setStockProducts(Product[] stockProducts) { this.stockProducts = stockProducts; }

    @Override
    public String toString() {
        return "Store: { Name: " + name + ", Quantity: " + employeeQuantity + ", Base Salary: " + employeeBaseSalary + ", Address: " + address.toString() + ", Foundation: " + foundationDate.toString() + ", Stock: " + Arrays.toString(stockProducts) + " }";
    }

    public double SalaryExpenses() {
        if  (employeeBaseSalary == -1) return -1;
        return employeeBaseSalary * employeeQuantity;
    }

    public char StoreSize() {
        if (employeeQuantity < 10) {
            return 'S';
        } else if (employeeQuantity <= 30) {
            return 'M';
        } else {
            return 'L';
        }
    }

    public void printProductsInfo() {
        for (Product product : stockProducts) {
            System.out.println(product.toString());
        }
    }

    public boolean insertProduct(Product product) {
        for (int i = 0; i < stockProducts.length; i++) {
            if (stockProducts[i] == null) {
                stockProducts[i] = product;
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(String productName) {
        for (int i = 0; i < stockProducts.length; i++) {
            if (stockProducts[i].getName().equals(productName)) {
                stockProducts[i] = null;
                return true;
            }
        }
        return false;
    }
}
