package task1;

import java.util.Objects;

public class Address {

    private String country;
    private String city;
    private String street;
    private int houseNumber;

    public Address(final String country, final String city, final String street, final int houseNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address() {
        this.country = "";
        this.city = "";
        this.street = "";
        this.houseNumber = 0;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(final int houseNumber) {
        this.houseNumber = houseNumber;

    }
}
