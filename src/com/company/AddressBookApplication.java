/**
 @author Lauren Dennedy
 @since February 2020
 @version 1.2
 **/

package com.company;

/**
 * The Main class used to start the menu.
 */
public class AddressBookApplication {
    /**
     * The main method to start the AddressBookApplication
     * @param args Arguments to accept when calling main
     */
    public static void main(String[] args) {
        AddressBook.getAddressBook();
        Menu.getMenu();
        Menu.display();

        // Run test classes:
        // AddressBookTest bookTest = new AddressBookTest();
        // AddressEntryTest entryTest = new AddressEntryTest();
        // MenuTest menuTest = new MenuTest();
    }
}
