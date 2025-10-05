public class Product {
    private String name;
    private double price;
    private Date expirationDate;

    public Product(String name, double price, Date validDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = validDate;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public Date getExpirationDate() { return expirationDate; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setExpirationDate(Date expirationDate) { this.expirationDate = expirationDate; }

    public boolean isExpired(Date currentDate) {
        int expDay = this.expirationDate.getDay();
        int expMonth = this.expirationDate.getMonth();
        int expYear = this.expirationDate.getYear();

        int curDay = currentDate.getDay();
        int curMonth = currentDate.getMonth();
        int curYear = currentDate.getYear();

        if (curYear > expYear) return true;
        if (curYear == expYear && curMonth < expMonth) return true;
        if (curYear == expYear && curMonth == expMonth && curDay > expDay) return true;

        return false;
    }


    @Override
    public String toString() {
        return "Product { name: " + name + ", price: " + price + ", ValidDate: " + expirationDate.toString() + " }";
    }


}
