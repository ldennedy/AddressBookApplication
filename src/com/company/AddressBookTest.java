/**
 @author Lauren Dennedy
 @since February 2020
 @version 1.2
 **/

package com.company;

/**
 * The AddressBookTest class is used to test
 * AddressBook methods
 */
public class AddressBookTest {
    /**
     * The "constructor" to test static AddressBook methods
     */
    public AddressBookTest() {
        AddressBook.getAddressBook();
        AddressBook.add(new AddressEntry());
        AddressBook.add(new AddressEntry());

        AddressBook.add(new AddressEntry("hello", "goodbye", "123 st",
                "yellow", "WA", 12345, "123456", "haha@mail.com"));

        AddressBook.add(new AddressEntry("yes", "no", "987 way",
                "blue", "MA", 98765, "0987654", "ohno@mail.com"));

        System.out.println("TestBook:");
        AddressBook.list();

        System.out.println(AddressBook.find("goodbye"));
        System.out.println(AddressBook.find("n"));
    }
}
