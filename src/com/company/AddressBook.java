/**The AddressBook class represents an AddressBook
 with a list for address entries and methods
 to take in the addresses.
 @author Lauren Dennedy
 @since February 2020
 @version 1.2
 **/

package com.company;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class AddressBook {
    /**
     * Single AddressBook instance (singleton)
     */
    private static AddressBook addressBook = null;

    /**
     * List of AddressEntry objects to comprise the AddressBook
     */
    private static ArrayList<AddressEntry> addresses;

    /**
     * Private constructor to initialize the singleton and the addresses list
     */
    private AddressBook() { addresses = new ArrayList<>(); }

    /**
     * Public AddressBook Getter to call the private constructor
     */
    public static AddressBook getAddressBook() {
        if (addressBook == null) {
            addressBook = new AddressBook();
        }
        return addressBook;
    }

    /**
     * Add an entry to the AddressBook's addresses list
     * @param e The entry added to the list
     */
    public static void add(AddressEntry e) { addresses.add(e); }

    /**
     * Remove an entry from the AddressBook's addresses list
     * TODO: This method cannot remove solely on the case of lastName alone, because
     *       then it could remove more than one entry at a time and the user needs
     *       a choice in that. This method takes in an object for removal instead,
     *       and the choice granted by searching for last name is handled in the
     *       menu instead.
     * @param e The entry removed from the list
     */
    public static void remove(AddressEntry e) { addresses.remove(e); }

    /**
     * Prints out the entries of the addresses list with their toString methods
     */
    public static void list() {
        for (AddressEntry e: addresses) {
            System.out.println(e);
        }
    }

    /**
     * Sorts the addresses list using comparators for the first and last name of an entry.
     * Sorts first by last name, then first name.
     */
    public static void sort() {
        // Compares last names
        Comparator<AddressEntry> lNameComparator = Comparator.comparing(AddressEntry::getLastName);

        // Compares first names
        Comparator<AddressEntry> fNameComparator = Comparator.comparing(AddressEntry::getFirstName);

        // Then sorts with regards to both, sorting by last name, then first name
        Collections.sort(addresses, lNameComparator.thenComparing(fNameComparator));
    }

    /**
     * Finds entries matching a string of the last name.
     * @param startOfLastName The string of the last name to search entries for
     * @return A list of matching entries
     */
    public static List<AddressEntry> find(String startOfLastName) {
        // Make sure list is sorted first
        sort();

        // Final list of all matching entries
        List<AddressEntry> matchingEntries = new ArrayList<>();

        // List of indices that match the searching algorithm
        List<Integer> matchingEntryIndices = new ArrayList<>();

        // List of just last name strings for comparison
        List<String> lastNameStrings = new ArrayList<>();

        // Populate the last name strings from the record of addresses
        for (AddressEntry entry: addresses) {
            lastNameStrings.add(entry.getLastName());
        }

        // Comparator to find the first item containing
        Comparator<String> containsComparator = (o1, o2) -> {
            // Modified comparator so any string containing the first chars of last name is considered a complete match
            if (o1.contains(o2)) {
                return 0;
            } else {
                return o1.compareTo(o2);
            }
        };

        // Adds the index of the first matching name to the matching indices list.
        matchingEntryIndices.add(Collections.binarySearch(lastNameStrings, startOfLastName, containsComparator));

        // Check any others after that
        int startIndex = matchingEntryIndices.get(0);

        // If at least one match was found, check linearly for any others after that (same last name)
        if (startIndex >= 0) {
            int i = startIndex + 1;
            while (i < lastNameStrings.size() && lastNameStrings.get(i).contains(startOfLastName)) {
                matchingEntryIndices.add(i);
                i++;
            }
        }

        // Populate the matching entries list from the matching indices and return it
        for (Integer j: matchingEntryIndices) {
            if (j >= 0) {
                matchingEntries.add(addresses.get(j));
            }
        }
        return matchingEntries;
    }

    /**
     * A method to populate the addresses list with formatted address entries from a file
     * @param filename The string of the filename to be used to get entries from
     */
    public static void readFromFile(String filename) {
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
            int count = 0;

            // Read all the contents in the file (while new line)
            while (fileReader.hasNextLine()) {
                // Depending on which interval assign to what
                switch (index) {
                    case 0:
                        try {
                            fName = fileReader.nextLine();
                            // Debug output: System.out.println("First name read: " + fName);
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }
                    case 1:
                        try {
                            lName = fileReader.nextLine();
                            // Debug output: System.out.println("Last name read: " + lName);
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }
                    case 2:
                        try {
                            street = fileReader.nextLine();
                            // Debug output: System.out.println("Street read: " + street);
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }
                    case 3:
                        try {
                            city = fileReader.nextLine();
                            // Debug output: System.out.println("City read: " + city);
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }
                    case 4:
                        try {
                            state = fileReader.nextLine();
                            // Debug output: System.out.println("State read: " + state);
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }
                    case 5:
                        try {
                            String temp = fileReader.nextLine();
                            try {
                                zip = Integer.parseInt(temp);
                                // Debug output: System.out.println("Zip code read: " + zip);
                            } catch (NumberFormatException e) {
                                System.out.println("Improper zip in file. Make sure entries in the .txt file have all 8 data items.");
                            }
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }

                    case 6:
                        try {
                            email = fileReader.nextLine();
                            // Debug output: System.out.println("Email address read: " + email);
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }
                    case 7:
                        try {
                            tel = fileReader.nextLine();
                            // Debug output: System.out.println("Telephone number read: " + tel);
                        } catch (NoSuchElementException e) {
                            System.out.println("Reached EOF while parsing. Make sure entries in the .txt file have all 8 data items.");
                        }

                        // Add entry to book
                        addresses.add(new AddressEntry(fName, lName, street, city, state, zip, tel, email));
                        count++;
                }

                // Loop item to read based on 8 items for an address
                // How it works: Increase index by one,
                // Mod it by 8 because there are 8 items to read for each address
                // Subtract one because our count starts at 0
                index = ((index + 1) % 8) - 1;
            }

            // Close the file
            fileReader.close();
            System.out.println(count + " addresses were successfully read from the file \'" + filename + "\'");
            sort();

        // Catch exception if at any point file could not be used
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
        }
    }
}
