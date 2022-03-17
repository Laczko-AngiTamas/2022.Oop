package oop.labor04.lab4_1;

public class Person {
    private String firstName;
    private String lastName;
    private String birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public Person(String firstName, String lastName, int birtYear) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
