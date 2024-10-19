package org.programacionII;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/Data/employees.json");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has"  + file.length() + " bytes");
        System.out.println("Can it be reads? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified time is " + new Date((file.lastModified())));

        System.out.println("Reading text in an archive");
        try{
            /*PrintWriter write = new PrintWriter(file);
            write.println("Hello world! I'm live");
            write.close();*/
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe o se mamo del hp de programacion y se fue");
        }
    }
}