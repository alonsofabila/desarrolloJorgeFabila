package com.anahuac.desarrollo.creacional.singleton;

public class DBConnect {
    private static DBConnect instance = new DBConnect();

    private DBConnect(){}

    public static DBConnect getInstance(){
        if (DBConnect.instance == null){
            DBConnect.instance = new DBConnect();
        }
        return DBConnect.instance;
    }

    public void getConnection(){
        System.out.println("Conectado a la Base de datos");
    }
}
