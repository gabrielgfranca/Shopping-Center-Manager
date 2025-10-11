package models.subStores;

import models.Address;
import models.Date;
import models.Store;

public class Computing extends Store {
    private double electronicsInsurance;

    public Computing(String name, int employeeQuantity, Address address, Date fundationDate, double electronicsInsurance, int productMaximumStock) {
        super(name, employeeQuantity, address, fundationDate, productMaximumStock);
        this.electronicsInsurance = electronicsInsurance;
    }

    public Computing(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, double electronicsInsurance, int productMaximumStock) {
        super(name, employeeQuantity, employeeBaseSalary, address, fundationDate, productMaximumStock);
        this.electronicsInsurance = electronicsInsurance;
    }

    public double getElectronicsInsurance() { return electronicsInsurance; }
    @Override public String getType() { return "Computing"; }
    public void setElectronicsInsurance(double electronicsInsurance) { this.electronicsInsurance = electronicsInsurance; }

    @Override
    public String toString() {
        return super.toString() + "Computing { Electronics Insurance: " + electronicsInsurance + " }";
    }
}
