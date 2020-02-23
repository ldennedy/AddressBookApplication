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
        AddressBook.getAddressBook();
        Menu.getMenu();
        Menu.display();

        // Run test classes:
        // AddressBookTest bookTest = new AddressBookTest();
        // AddressEntryTest entryTest = new AddressEntryTest();
        // MenuTest menuTest = new MenuTest();
    }
}
