package com.company;

import java.util.ArrayList;
import java.util.List;

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
}
