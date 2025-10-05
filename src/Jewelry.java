public class Jewelry extends Store{
    private double monthlySalesGoal;

    public Jewelry(String name, int employeeQuantity, Address address, Date fundationDate, double monthlySalesGoal) {
        super(name, employeeQuantity, address, fundationDate);
        this.monthlySalesGoal = monthlySalesGoal;
    }

    public Jewelry(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, double monthlySalesGoal) {
        super(name, employeeQuantity, employeeBaseSalary, address, fundationDate);
        this.monthlySalesGoal = monthlySalesGoal;
    }

    public double getMonthlySalesGoal() { return monthlySalesGoal; }
    public void setMonthlySalesGoal(double monthlySalesGoal) { this.monthlySalesGoal = monthlySalesGoal; }

    @Override
    public String toString() {
        return super.toString() + "Jewelry { Monthly Sales Goal: " + monthlySalesGoal + " }";
    }
}
