/**The Menu class represents the menu the user
 * interacts with at the console level
 @author Lauren Dennedy
 @since February 2020
 @version 1.1
 **/

package com.company;

import java.util.Scanner;

public class Menu {
    /**
     * Scanner object for the menu class to read user input
     */
    private static Scanner reader = new Scanner(System.in);

    /**
     * Prompt method to enter a first name
     * @return The first name the user entered as a string
     */
    public static String promptFirstName() {
        System.out.print("First Name: ");
        return reader.nextLine();
    }

    /**
     * Prompt method to enter a last name
     * @return The last name the user entered as a string
     */
    public static String promptLastName() {
        System.out.print("Last Name: ");
        return reader.nextLine();
    }

    /**
     * Prompt method to enter a street
     * @return The street the user entered as a string
     */
    public static String promptStreet() {
        System.out.print("Street: ");
        return reader.nextLine();
    }

    /**
     * Prompt method to enter a city
     * @return The city the user entered as a string
     */
    public static String promptCity() {
        System.out.print("City: ");
        return reader.nextLine();
    }

    /**
     * Prompt method to enter a state
     * @return The state the user entered as a string
     */
    public static String promptState() {
        System.out.print("State: ");
        return reader.nextLine();
    }

    /**
     * Prompt method to enter a zip code
     * @return The zip code the user entered as an integer
     */
    public static Integer promptZip() {
        System.out.print("Zip Code: ");
        String line = reader.nextLine();
        int zip = 0;

        // Input validation/exception checking for integer input
        try {
            zip = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println("Improper zip was entered.");
        }
        return zip;
    }

    /**
     * Prompt method to enter a phone number
     * @return The phone number the user entered as a string
     */
    public static String promptTelephone() {
        System.out.print("Telephone Number: ");
        return reader.nextLine();
    }

    /**
     * Prompt method to enter an email address
     * @return The email address the user entered as a string
     */
    public static String promptEmail() {
        System.out.print("Email: ");
        return reader.nextLine();
    }
}
