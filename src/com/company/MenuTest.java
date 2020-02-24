/**
 @author Lauren Dennedy
 @since February 2020
 @version 1.2
 **/

package com.company;

/**
 * The MenuTest class tests the functionality of each menu method
 * Methods are called statically, because the original menu class
 * is static
 **/
public class MenuTest {
    /**
     * The "constructor" to call the static menu methods
     */
    public MenuTest() {
        String fName = Menu.promptFirstName();
        System.out.println(fName);

        String lName = Menu.promptLastName();
        System.out.println(lName);

        String street = Menu.promptStreet();
        System.out.println(street);

        String city = Menu.promptCity();
        System.out.println(city);

        String state = Menu.promptState();
        System.out.println(state);

        Integer zip = Menu.promptZip();
        System.out.println(zip);

        String tel = Menu.promptTelephone();
        System.out.println(tel);

        String email = Menu.promptEmail();
        System.out.println(email);
    }
}
