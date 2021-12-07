package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private Address address;
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public User(final String name, final String surname, final int age, final String phoneNumber, final Address address) {
        this.firstName = name;
        this.lastName = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        validate();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
        validate();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
        validate();
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
        validate();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        validate();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
        validate();
    }

    public void validate() {
        final List<String> exceptionsMessages = new ArrayList<>();
        if (getAddress().getCountry().isEmpty()) {
            exceptionsMessages.add("Incorrect country");
        }
        if (getAddress().getCity().isEmpty()) {
            exceptionsMessages.add("Incorrect city");
        }
        if (getAddress().getStreet().isEmpty()) {
            exceptionsMessages.add("Incorrect street");
        }
        if (getAddress().getHouseNumber() < 1) {
            exceptionsMessages.add("Incorrect house");
        }
        if (getFirstName().length() < 3) {
            exceptionsMessages.add("Incorrect firstName");
        }
        if (getLastName().length() < 3) {
            exceptionsMessages.add("Incorrect lastName");
        }
        if (getAge() < 16 || getAge() > 110) {
            exceptionsMessages.add("Incorrect age");
        }
        if (getPhoneNumber().length() < 10 || getPhoneNumber().length() > 14) {
            exceptionsMessages.add("Incorrect phoneNumber");
        }
        if (!exceptionsMessages.isEmpty()) {
            throw new UncheckedException(exceptionsMessages, ErrorCode.ERROR_500);
        }

    }
}

