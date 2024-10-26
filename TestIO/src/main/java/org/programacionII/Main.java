package org.programacionII;

import org.programacionII.services.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.showMenu();
    }
}