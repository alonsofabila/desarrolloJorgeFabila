package com.anahuac.desarrollo.creacional.factorymethod;

public class Oracle implements DBConnect{


    @Override
    public void openConn() {
        System.out.println("Conexion establecida con la base de datos Oracle");
    }

    @Override
    public void closeConn() {
        System.out.println("Cerrando conexion con la base de datos Oracle");
    }

    @Override
    public void createSentence() {
        System.out.println("Oracle Query Creada");
    }

    @Override
    public void executeSentence() {
        System.out.println("Ejecutando Oracle Query\n");
    }
}
