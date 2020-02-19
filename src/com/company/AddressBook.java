/**The AddressBook class represents an AddressBook
 with a list for address entries and methods
 to take in the addresses.
 @author Lauren Dennedy
 @since February 2020
 @version 1
 **/

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AddressBook {

    /**
     * List of AddressEntry objects to comprise the AddressBook
     */
    private List<AddressEntry> addresses;

    /**
     * Empty constructor for the AddressBook, initialized with zero entries
     */
    public AddressBook() { addresses = new ArrayList<>(); }

    /**
     * Add an entry to the AddressBook's addresses list
     * @param e The entry added to the list
     */
    public void add(AddressEntry e) { addresses.add(e); }

    /**
     * Remove an entry from the AddressBook's addresses list
     * @param lastName The entry removed from the list according to last name
     */
    // TODO: Finish this method -- Check UML for project
    public void remove(String lastName) {
        return;
        /*
        for (AddressEntry entry: addresses) {
            // Not sure how to fill this out
        }
        */
    }

    /**
     * Prints out the entries of the addresses list with their toString methods
     */
    public void list() {
        for (AddressEntry e: addresses) {
            System.out.println(e);
        }
    }

    /**
     * A method to populate the addresses list with formatted address entries from a file
     * @param filename The string of the filename to be used to get entries from
     */
    public void readFromFile(String filename) {
        try {
            // Set up objects to begin reading the file
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            String fName = "";
            String lName = "";
            String street = "";
            String city = "";
            String state = "";
            String tel = "";
            String email = "";
            int zip = 0;
            int index = 0;

            // Read all the contents in the file (while new line)
            while (fileReader.hasNextLine()) {
                // Depending on which interval assign to what
                switch (index) {
                    case 0:
                        try {
                            fName = fileReader.nextLine();
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }
                    case 1:
                        try {
                            lName = fileReader.nextLine();
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }
                    case 2:
                        try {
                            street = fileReader.nextLine();
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }
                    case 3:
                        try {
                            city = fileReader.nextLine();
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }
                    case 4:
                        try {
                            state = fileReader.nextLine();
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }
                    case 5:
                        try {
                            String temp = fileReader.nextLine();
                            try {
                                zip = Integer.parseInt(temp);
                            } catch (NumberFormatException e) {
                                System.out.println("Improper zip in file.");
                            }
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }

                    case 6:
                        try {
                            email = fileReader.nextLine();
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }
                    case 7:
                        try {
                            tel = fileReader.nextLine();
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing.");
                        }

                        // Add entry to book
                        this.add(new AddressEntry(fName, lName, street, city, state, zip, tel, email));
                }

                // Loop item to read based on 8 items for an address
                index = (index + 1) % 8;
            }

            // Close the file
            fileReader.close();

        // Catch exception if at any point file could not be used
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
        }
    }
}
