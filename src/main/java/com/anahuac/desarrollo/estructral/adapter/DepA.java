package com.anahuac.desarrollo.estructral.adapter;

public class DepA implements IDep{

    private String name;
    private int age;

    public DepA(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("\n-----Persona-----");
        System.out.println("Nombre: " + this.name + ", edad: " + this.age);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
