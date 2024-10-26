package org.programacionII.services;

import org.programacionII.models.Person;

import java.util.Date;
import java.util.Scanner;

public class PersonService {

    private Person person;
    private Scanner scanner;
    private PersonIOService personIOService;

    public PersonService(){
        scanner = new Scanner(System.in);
        personIOService = new PersonIOService();
    }

    public void showMenu(){
        int option=0;
        do {
            System.out.println("******MENU******");
            System.out.println("1. Crear persona");
            System.out.println("2. Visualizar persona");
            System.out.println("Ingresa una opcion");
            int userOption = scanner.nextInt();
            switch (userOption){
                case 1-> createPerson();
                case 2-> showPerson();
                default -> option=0;
            }
        }while (option != 0);
    }

    public void createPerson(){
        System.out.println("Crear persona");
        System.out.println("Ingresa un nombre");
        String name = scanner.next();
        System.out.println("Ingresa el correo");
        String email = scanner.next();
        System.out.println("Ingresa el telefono");
        String phone = scanner.next();
        String dateCration = new Date().toString();
        person = new Person(name, email, phone, dateCration);
        personIOService.writeJson(person);
    }

    public void showPerson(){
        System.out.println("Visualizar persona");
        person = personIOService.readJson();
        System.out.println(person.toString());
    }
}
