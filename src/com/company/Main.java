package com.company;

// The main class for the AddressBookApplication
public class Main {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        //initAddressBookExercise(addressBook);
        addressBook.init("AddressInputDataFile.txt");
        addressBook.list();
    }

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
