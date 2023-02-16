package com.anahuac.desarrollo.estructral.proxy;

public class Page implements Access{
    @Override
    public void open(String name, User user) {
        System.out.println("-----");
        System.out.println("Usuario: " + user.getName() + "\nAcceso a la pagina: " + name);
        System.out.println("-----");
    }
}
