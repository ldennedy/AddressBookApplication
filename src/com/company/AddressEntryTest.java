/**
 @author Lauren Dennedy
 @since February 2020
 @version 1.2
 **/

package com.company;

/**
 * The AddressEntryTest class is used to test
 * AddressEntry methods
 */
public class AddressEntryTest {
    /**
     * AddressEntries testEntry1 and testEntry2
     */
    private AddressEntry testEntry1, testEntry2;

    /**
     * The "constructor" to setup the testEntry objects and test AddressEntry methods on them
     */
    public AddressEntryTest() {
        testEntry1 = new AddressEntry();
        testEntry2 = new AddressEntry("hello", "goodbye", "123 st",
                "yellow", "WA", 12345, "123456", "haha@mail.com");

        System.out.println(testEntry1);
        System.out.println(testEntry2);

        System.out.println(testEntry2.getFirstName());
        System.out.println(testEntry2.getLastName());
        System.out.println(testEntry2.getStreet());
        System.out.println(testEntry2.getCity());
        System.out.println(testEntry2.getState());
        System.out.println(testEntry2.getZip());
        System.out.println(testEntry2.getPhone());
        System.out.println(testEntry2.getEmail());

        testEntry1.setFirstName("yes");
        testEntry1.setLastName("no");
        testEntry1.setStreet("987 way");
        testEntry1.setCity("blue");
        testEntry1.setState("WA");
        testEntry1.setZip(98765);
        testEntry1.setPhone("0987654");
        testEntry1.setEmail("ohno@mail.com");

        System.out.println(testEntry1);
    }
}
