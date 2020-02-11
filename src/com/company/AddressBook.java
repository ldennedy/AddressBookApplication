package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// AddressBook class
public class AddressBook {
    // List of addresses
    private List<AddressEntry> addresses;

    // Empty constructor
    public AddressBook() { addresses = new ArrayList<>(); }

    // Add address
    public void add(AddressEntry e) { addresses.add(e); }

    // Print the whole book
    public void list() {
        for (AddressEntry e: addresses) {
            System.out.println(e);
        }
    }

    // init function to start AddressBook with its own file
    public static void init(String filename) {
        try {
            // Set up objects to begin reading the file
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            String fName, lName, street, city, state, tel, email;
            int zip;
            int index = 0;

            // Read all the contents in the file (while new line)
            while (fileReader.hasNextLine()) {
                switch (index) {
                    case 0: fName = fileReader.nextLine();
                    case 1: lName = fileReader.nextLine();
                    case 2: street = fileReader.nextLine();
                    case 3: city = fileReader.nextLine();
                    case 4: state = fileReader.nextLine();
                    case 5:
                        String temp = fileReader.nextLine();
                        try {
                            zip = Integer.parseInt(temp);
                        } catch (NumberFormatException e) {
                            System.out.println("Improper zip in file.");
                        }
                    case 6: email = fileReader.nextLine();
                    case 7: tel = fileReader.nextLine();
                }
                index = (index + 1) % 8;
            }

        // Catch exception if at any point file could not be used
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
        }
    }
}
