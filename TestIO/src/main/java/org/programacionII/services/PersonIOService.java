package org.programacionII.services;

import com.google.gson.Gson;
import org.programacionII.models.Person;

import java.io.*;

public class PersonIOService {

    private Gson gson;
    private Person person;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private final String PATH_NAME = "src/main/resources/Data/employees.json";

    public PersonIOService() {
        gson = new Gson();
    }

    public void writeJson(Person person){
        try {
            fileWriter = new FileWriter(PATH_NAME);
            bufferedWriter = new BufferedWriter(fileWriter);
            String personJson = gson.toJson(person);
            bufferedWriter.write(personJson);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error al esxribir el archivo " + e.getMessage());
        }
    }

    public void readJson(){
        String fileRead = "", line;
        try{
            fileReader = new FileReader(PATH_NAME);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                fileRead+=line;
            }
            person = gson.fromJson(fileRead, Person.class);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe o no fue encontrado " + e.getMessage());
        } catch (IOException e) {
            System.out.println("error al leer el archivo");
        }
    }
}
