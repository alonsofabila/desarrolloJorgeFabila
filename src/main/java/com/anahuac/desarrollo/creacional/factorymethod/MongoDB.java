package com.anahuac.desarrollo.creacional.factorymethod;

public class MongoDB implements DBConnect{

    @Override
    public void openConn() {
        System.out.println("Conexion establecida con la base de datos MongoDB");
    }

    @Override
    public void closeConn() {
        System.out.println("Cerrando conexion con la base de datos MongoDB");
    }

    @Override
    public void createSentence() {
        System.out.println("MongoDB Query Creada");
    }

    @Override
    public void executeSentence() {
        System.out.println("Ejecutando MongoDB Query\n");
    }
}
