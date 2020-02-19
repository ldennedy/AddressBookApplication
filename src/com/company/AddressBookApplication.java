/**The Main class used to prompt menu commands
 * and create address objects to be placed in the book.
 @author Lauren Dennedy
 @since February 2020
 @version 1.1
 **/

package com.company;

public class AddressBookApplication {
    /**
     * The main method to start the AddressBookApplication
     * @param args Arguments to accept when calling main
     */
    public static void main(String[] args) {
        //initAddressBookExercise(addressBook);
        AddressBook.getAddressBook();
        AddressBook.readFromFile("AddressInputDataFile.txt");
        AddressBook.list();

        // Run test classes:
        // AddressBookTest bookTest = new AddressBookTest();
        // AddressEntryTest entryTest = new AddressEntryTest();
        // MenuTest menuTest = new MenuTest();
    }

    /**
     * A testing method to take new addresses from user input using the menu prompt methods
     * @param ab The AddressBook new entries will be added to
     */
    public static void initAddressBookExercise(AddressBook ab) {
        // Variables to store entry information
        String fName, lName, street, city, state, tel, email;
        int zip;

        for (int i: new int[] {0, 1}) {
            // Prompt menu commands to accept a new address
            fName = Menu.promptFirstName();
            lName = Menu.promptLastName();

            street = Menu.promptStreet();
            city = Menu.promptCity();
            state = Menu.promptState();
            zip = Menu.promptZip();

            tel = Menu.promptTelephone();
            email = Menu.promptEmail();

            // Add new address once complete
            ab.add(new AddressEntry(fName, lName, street, city, state, zip, tel, email));
        }

        // Print the whole list
        ab.list();
    }
}
