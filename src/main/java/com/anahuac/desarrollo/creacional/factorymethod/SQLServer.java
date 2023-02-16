package com.anahuac.desarrollo.creacional.factorymethod;

public class SQLServer implements DBConnect{

    @Override
    public void openConn() {
        System.out.println("Conexion establecida con la base de datos SqlServer");
    }

    @Override
    public void closeConn() {
        System.out.println("Cerrando conexion con la base de datos SqlServer");
    }

    @Override
    public void createSentence() {
        System.out.println("SqlServer Query Creada");
    }

    @Override
    public void executeSentence() {
        System.out.println("Ejecutando SqlServer Query\n");
    }
}
