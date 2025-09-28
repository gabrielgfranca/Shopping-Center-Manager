public class Store {
    private String name;
    private int employeeQuantity;
    private double employeeBaseSalary;

    public Store(String name, int employeeQuantity, double employeeBaseSalary) {
        this.name = name;
        this.employeeQuantity = employeeQuantity;
        this.employeeBaseSalary = employeeBaseSalary;
    }

    public Store(String name, int employeeQuantity) {
        this.name = name;
        this.employeeQuantity = employeeQuantity;
        this.employeeBaseSalary = -1;
    }

    public String getName() { return name; }
    public int getEmployeeQuantity() { return employeeQuantity; }
    public double getEmployeeBaseSalary() { return employeeBaseSalary; }
    public void setName(String name) { this.name = name; }
    public void setEmployeeQuantity(int employeeQuantity) { this.employeeQuantity = employeeQuantity; }
    public void setEmployeeBaseSalary(double employeeBaseSalary) { this.employeeBaseSalary = employeeBaseSalary; }

    @Override
    public String toString() {
        return "Store: { Name: " + name + ", Quantity: " + employeeQuantity + ", Base Salary: " + employeeBaseSalary + " }";
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
