package models.subStores;

import models.Address;
import models.Date;
import models.Store;

public class Clothing extends Store {
    private boolean ImportedProducts;

    public Clothing(String name, int employeeQuantity, Address address, Date fundationDate, boolean ImportedProducts,  int productMaximumStock) {
        super(name, employeeQuantity, address, fundationDate, productMaximumStock);
        this.ImportedProducts = ImportedProducts;
    }

    public Clothing(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, boolean ImportedProducts, int productMaximumStock) {
        super(name, employeeQuantity, employeeBaseSalary, address, fundationDate, productMaximumStock);
        this.ImportedProducts = ImportedProducts;
    }

    public boolean getImportedProducts() { return ImportedProducts; }
    @Override public String getType() { return "Clothing"; }
    public void setImportedProducts(boolean ImportedProducts) { this.ImportedProducts = ImportedProducts; }

    @Override
    public String toString() {
        return super.toString() + "Clothing { ImportedProducts: " + ImportedProducts + " }";
    }
}
