package models.subStores;

import models.Address;
import models.Date;
import models.Store;

public class Food extends Store {
    private Date licenseDate;

    public Food(String name, int employeeQuantity, Address address, Date fundationDate, Date licenseDate) {
        super(name, employeeQuantity, address, fundationDate);
        this.licenseDate = licenseDate;
    }

    public Food(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, Date licenseDate) {
        super(name, employeeQuantity, employeeBaseSalary, address, fundationDate);
        this.licenseDate = licenseDate;
    }

    public Date getLicenseDate() { return licenseDate; }
    public void setLicenseDate(Date licenseDate) { this.licenseDate = licenseDate; }

    @Override
    public String toString() {
        return super.toString() + "Food { licenseDate: " + licenseDate + " }";
    }
}
