package org.programacionII.models;

import com.google.gson.annotations.SerializedName;

public class Person {
    private String name;
    private String phoneNumber;
    private String email;
    @SerializedName("date_Creation")
    private String dateCreation;

    public Person() {
    }

    public Person(String name, String phoneNumber, String email, String dateCreation) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setDateCreation(dateCreation);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }
}
