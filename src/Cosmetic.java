public class Cosmetic extends Store{
    private double commercializationFee;

    public Cosmetic(String name, int employeeQuantity, Address address, Date foundationDate, double commercializationFee) {
        super(name, employeeQuantity, address, foundationDate);
        this.commercializationFee = commercializationFee;
    }

    public Cosmetic(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date foundationDate, double commercializationFee) {
        super(name, employeeQuantity, employeeBaseSalary, address, foundationDate);
        this.commercializationFee = commercializationFee;
    }

    public double getCommercializationFee() { return commercializationFee; }
    public void setCommercializationFee(double commercializationFee) { this.commercializationFee = commercializationFee; }

    @Override
    public String toString() {
        return super.toString() + "CommercializationFee: " + commercializationFee;
    }
}
