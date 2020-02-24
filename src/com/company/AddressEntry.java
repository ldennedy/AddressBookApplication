/**
 @author Lauren Dennedy
 @since February 2020
 @version 1.2
 **/

package com.company;

/**
 * The AddressEntry class represents a specific
 * address entry to be placed in an AddressBook object
 */
public class AddressEntry {
    /**
     * String variables store first name, last name, street, city, state,
     * phone number, and email
     */
    private String firstName, lastName, street, city, state, phone, email;

    /**
     * Integer variable to store the zip code
     */
    private Integer zip;

    /**
     * Empty constructor for the address entry, sets all values to empty/zero
     */
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

    /**
     * Full constructor to create an entire AddressEntry object
     * @param firstName First Name
     * @param lastName Last Name
     * @param street Street
     * @param city City
     * @param state State
     * @param zip Zip Code
     * @param phone Phone Number
     * @param email Email Address
     */
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

    /**
     * First Name Getter
     * @return the first name as a string
     */
    public String getFirstName() { return firstName; }

    /**
     * First Name Setter
     * @param firstName The string to be set as the first name
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     * Last Name Getter
     * @return the last name as a string
     */
    public String getLastName() { return lastName; }

    /**
     * Last Name Setter
     * @param lastName The string to be set as the last name
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Street Getter
     * @return the street address as a string
     */
    public String getStreet() { return street; }

    /**
     * Street Setter
     * @param street The string to be set as the street
     */
    public void setStreet(String street) { this.street = street; }

    /**
     * City Getter
     * @return the city as a string
     */
    public String getCity() { return city; }

    /**
     * City Setter
     * @param city The string to be set as the city
     */
    public void setCity(String city) { this.city = city; }

    /**
     * State Getter
     * @return the state as a string
     */
    public String getState() { return state; }

    /**
     * State Setter
     * @param state The string to be set as the state
     */
    public void setState(String state) { this.state = state; }

    /**
     * Phone Number Getter
     * @return the phone number as a string
     */
    public String getPhone() { return phone; }

    /**
     * Phone Number Setter
     * @param phone The string to be set as the phone number
     */
    public void setPhone(String phone) { this.phone = phone; }

    /**
     * Email Getter
     * @return the email address as a string
     */
    public String getEmail() { return email; }

    /**
     * Phone Number Setter
     * @param email The string to be set as the email address
     */
    public void setEmail(String email) { this.email = email; }

    /**
     * Zip Code Getter
     * @return the zip code as an integer
     */
    public Integer getZip() { return zip; }

    /**
     * Zip Code Setter
     * @param zip The integer to be set as the zip code
     */
    public void setZip(Integer zip) { this.zip = zip; }

    /**
     * toString Method for AddressEntry
     * @return a formatted string of the full contact information of the entry
     */
    public String toString() {
        return "\n" + firstName + " " + lastName +
                "\n" + street + "\n" + city + ", " + state + "\n" + zip +
                "\n" + email + "\n" + phone + "\n";
    }
}
