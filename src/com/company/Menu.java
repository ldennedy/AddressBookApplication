package com.company;

import java.util.Scanner;

// Menu class
public class Menu {
    // Scanner for the menu
    private static Scanner reader = new Scanner(System.in);

    // First name
    public static String promptFirstName() {
        System.out.print("First Name: ");
        return reader.nextLine();
    }

    // Last name
    public static String promptLastName() {
        System.out.print("Last Name: ");
        return reader.nextLine();
    }

    // Street
    public static String promptStreet() {
        System.out.print("Street: ");
        return reader.nextLine();
    }

    // City
    public static String promptCity() {
        System.out.print("City: ");
        return reader.nextLine();
    }

    // State
    public static String promptState() {
        System.out.print("State: ");
        return reader.nextLine();
    }

    // Zip
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

    // Telephone
    public static String promptTelephone() {
        System.out.print("Telephone Number: ");
        return reader.nextLine();
    }

    // Email
    public static String promptEmail() {
        System.out.print("Email: ");
        return reader.nextLine();
    }
}
