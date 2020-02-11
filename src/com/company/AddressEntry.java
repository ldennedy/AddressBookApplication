package com.company;

// AddressEntry class
public class AddressEntry {
    // Class members
    private String firstName, lastName, street, city, state, phone, email;
    private Integer zip;

    // Empty constructor
    public AddressEntry() {
        firstName = "";
        lastName = "";
        street = "";
        city = "";
        state = "";
        phone = "";
        email = "";
        zip = 0;
    }

    // Filled constructor
    public AddressEntry(String firstName, String lastName,
                        String street, String city, String state,
                        Integer zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // Setters and getters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Integer getZip() { return zip; }
    public void setZip(Integer zip) { this.zip = zip; }

    // toString
    public String toString() {
        return "\n" + firstName + " " + lastName +
                "\n\n" + street + "\n" + city + ", " + state + "\n" + zip +
                "\n\n" + email + "\n" + phone;
    }
}
