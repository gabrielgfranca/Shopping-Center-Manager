package models.subStores;

import models.Address;
import models.Date;
import models.Store;

public class Jewelry extends Store {
    private double monthlySalesGoal;

    public Jewelry(String name, int employeeQuantity, Address address, Date fundationDate, double monthlySalesGoal, int productMaximumStock) {
        super(name, employeeQuantity, address, fundationDate, productMaximumStock);
        this.monthlySalesGoal = monthlySalesGoal;
    }

    public Jewelry(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, double monthlySalesGoal, int productMaximumStock) {
        super(name, employeeQuantity, employeeBaseSalary, address, fundationDate, productMaximumStock);
        this.monthlySalesGoal = monthlySalesGoal;
    }

    public double getMonthlySalesGoal() { return monthlySalesGoal; }
    @Override public String getType() { return "Jewelry"; }
    public void setMonthlySalesGoal(double monthlySalesGoal) { this.monthlySalesGoal = monthlySalesGoal; }

    @Override
    public String toString() {
        return super.toString() + "Jewelry { Monthly Sales Goal: " + monthlySalesGoal + " }";
    }
}
