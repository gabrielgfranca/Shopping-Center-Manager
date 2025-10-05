public class Computing extends Store {
    private double electronicsInsurance;

    public Computing(String name, int employeeQuantity, Address address, Date fundationDate, double electronicsInsurance) {
        super(name, employeeQuantity, address, fundationDate);
        this.electronicsInsurance = electronicsInsurance;
    }

    public Computing(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, double electronicsInsurance) {
        super(name, employeeQuantity, employeeBaseSalary, address, fundationDate);
        this.electronicsInsurance = electronicsInsurance;
    }

    public double getElectronicsInsurance() { return electronicsInsurance; }
    public void setElectronicsInsurance(double electronicsInsurance) { this.electronicsInsurance = electronicsInsurance; }

    @Override
    public String toString() {
        return super.toString() + "Computing { Electronics Insurance: " + electronicsInsurance + " }";
    }
}
