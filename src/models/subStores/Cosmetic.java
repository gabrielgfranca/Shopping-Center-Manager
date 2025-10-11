package models.subStores;

import models.Address;
import models.Date;
import models.Store;

public class Cosmetic extends Store {
    private double commercializationFee;

    public Cosmetic(String name, int employeeQuantity, Address address, Date foundationDate, double commercializationFee, int productMaximumStock) {
        super(name, employeeQuantity, address, foundationDate, productMaximumStock);
        this.commercializationFee = commercializationFee;
    }

    public Cosmetic(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date foundationDate, double commercializationFee, int productMaximumStock) {
        super(name, employeeQuantity, employeeBaseSalary, address, foundationDate, productMaximumStock);
        this.commercializationFee = commercializationFee;
    }

    public double getCommercializationFee() { return commercializationFee; }
    @Override public String getType() { return "Cosmetic"; }
    public void setCommercializationFee(double commercializationFee) { this.commercializationFee = commercializationFee; }

    @Override
    public String toString() {
        return super.toString() + "Cosmetic { Commercialization Fee: " + commercializationFee + " }";
    }
}
