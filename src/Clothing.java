public class Clothing extends Store {
    private boolean ImportedProducts;

    public Clothing(String name, int employeeQuantity, Address address, Date fundationDate, boolean ImportedProducts) {
        super(name, employeeQuantity, address, fundationDate);
        this.ImportedProducts = ImportedProducts;
    }

    public Clothing(String name, int employeeQuantity, double employeeBaseSalary, Address address, Date fundationDate, boolean ImportedProducts) {
        super(name, employeeQuantity, employeeBaseSalary, address, fundationDate);
        this.ImportedProducts = ImportedProducts;
    }

    public boolean getImportedProducts() { return ImportedProducts; }
    public void setImportedProducts(boolean ImportedProducts) { this.ImportedProducts = ImportedProducts; }

    @Override
    public String toString() {
        return super.toString() + "Clothing { ImportedProducts: " + ImportedProducts + " }";
    }
}
