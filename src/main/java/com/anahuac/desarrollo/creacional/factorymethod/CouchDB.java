package com.anahuac.desarrollo.creacional.factorymethod;

public class CouchDB implements DBConnect{

    @Override
    public void openConn() {
        System.out.println("Conexion establecida con la base de datos CouchDB");
    }

    @Override
    public void closeConn() {
        System.out.println("Cerrando conexion con la base de datos CouchDB");
    }

    @Override
    public void createSentence() {
        System.out.println("CouchDB Query Creada");
    }

    @Override
    public void executeSentence() {
        System.out.println("Ejecutando CouchDB Query\n");
    }
}
