package com.anahuac.desarrollo.estructral.adapter;

import java.time.LocalDate;
import java.time.Period;

public class AdapterA implements IDep {

    private String name;
    private int age;
    private DepB depB;

    public AdapterA(String name, int age, DepB depB){
        this.name = name;
        this.age = age;
        this.depB = depB;
    }

    @Override
    public void print() {
        System.out.println("\n-----Persona-----");
        System.out.println("Nombre: " + this.getName() + ", edad: " + this.getAge());
    }

    @Override
    public String getName() {
        return depB.getName() + depB.getLastName();
    }

    @Override
    public int getAge() {
        LocalDate now = LocalDate.now();
        return Period.between(now, depB.getBirthdayDate()).getYears();
    }
}
