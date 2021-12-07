package task3;

public class StudentSimple {
    public String firstName;
    public String lastName;

    public StudentSimple() {}

    public StudentSimple(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return '\n' + "firstName = " + firstName + ", lastName = " + lastName;
    }
}
