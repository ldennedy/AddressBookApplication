package com.company;

public class AddressBookTest {

    private AddressBook testBook1, testBook2;

    public AddressBookTest() {
        testBook1 = new AddressBook();
        testBook2 = new AddressBook();

        testBook1.add(new AddressEntry());
        testBook2.add(new AddressEntry());

        testBook1.add(new AddressEntry("hello", "goodbye", "123 st",
                "yellow", "WA", 12345, "123456", "haha@mail.com"));

        testBook2.add(new AddressEntry("yes", "no", "987 way",
                "blue", "MA", 98765, "0987654", "ohno@mail.com"));

        System.out.println("TestBook1:");
        testBook1.list();

        System.out.println("TestBook2:");
        testBook1.list();
    }
}
