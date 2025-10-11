package models;

public class Store {
    private String name;
    private int employeeQuantity;
    private double employeeBaseSalary;
    private Address address;
    private Date foundationDate;

    public Store(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate) {
        this.name = name;
        this.employeeQuantity = employeeQuantity;
        this.employeeBaseSalary = employeeBaseSalary;
        this.address = address;
        this.foundationDate = fundationDate;
    }

    public Store(String name, int employeeQuantity, Address address, Date fundationDate) {
        this.name = name;
        this.employeeQuantity = employeeQuantity;
        this.employeeBaseSalary = -1;
        this.address = address;
        this.foundationDate = fundationDate;
    }

    public String getName() { return name; }
    public int getEmployeeQuantity() { return employeeQuantity; }
    public double getEmployeeBaseSalary() { return employeeBaseSalary; }
    public Address getAddress() { return address; }
    public Date getFoundationDate() { return foundationDate; }
    public void setName(String name) { this.name = name; }
    public void setEmployeeQuantity(int employeeQuantity) { this.employeeQuantity = employeeQuantity; }
    public void setEmployeeBaseSalary(double employeeBaseSalary) { this.employeeBaseSalary = employeeBaseSalary; }
    public void setAddress(Address address) { this.address = address; }
    public void setFoundationDate(Date foundationDate) { this.foundationDate = foundationDate; }

    @Override
    public String toString() {
        return "Store: { Name: " + name + ", Quantity: " + employeeQuantity + ", Base Salary: " + employeeBaseSalary + ", Address: " + address.toString() + ", Foundation: " + foundationDate.toString() + " }";
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
}
