package models;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private String number;
    private String complement;

    public Address(
            String street,
            String city,
            String state,
            String country,
            String zipcode,
            String number,
            String complement
    ) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
        this.number = number;
        this.complement = complement;
    }

    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getCountry() { return country; }
    public String getZipcode() { return zipcode; }
    public String getNumber() { return number; }
    public String getComplement() { return complement; }
    public void setStreet(String street) { this.street = street; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setCountry(String country) { this.country = country; }
    public void setZipcode(String zipcode) { this.zipcode = zipcode; }
    public void setNumber(String number) { this.number = number; }
    public void setComplement(String complement) { this.complement = complement; }

    @Override
    public String toString() {
        return "Address { " +
                "Street: " + street +
                ", City: " + city +
                ", State: " + state +
                ", Country: " + country +
                ", Zipcode: " + zipcode +
                ", Number: " + number +
                ", Complement: " + complement +
                " }";
    }
}
