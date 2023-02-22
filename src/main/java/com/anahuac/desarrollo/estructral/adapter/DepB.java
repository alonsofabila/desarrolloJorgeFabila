package com.anahuac.desarrollo.estructral.adapter;


import java.time.LocalDate;

public class DepB {

    private String name;
    private String lastName;
    private LocalDate birthdayDate;

    public DepB(String name, String lastName, LocalDate birthdayDate){
        this.name = name;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public void print(){
        System.out.println("\n-----Persona-----");
        System.out.println("Nombre: " + this.name + "\nApellido: " + this.lastName + "\nFecha de nacimiento: " + this.birthdayDate);
    }
}
