package com.anahuac.desarrollo.creacional.factorymethod;

public class Main {
    public static void main(String[] args) {

        DBCreator handler = new DB_R("Oracle");
        ReporteA uno = new ReporteA("Alonso", handler);
        uno.seeReporte(uno);

        DBCreator handler2 = new DB_R("SQLServer");
        ReporteA dos = new ReporteA("Alfredo", handler2);
        dos.seeReporte(dos);

        DBCreator handler3 = new DB_N("MongoDB");
        ReporteA tres = new ReporteA("Ricardo", handler3);
        tres.seeReporte(tres);

        DBCreator handler4 = new DB_N("CouchDB");
        ReporteA cuatro = new ReporteA("Jennifer", handler4);
        cuatro.seeReporte(cuatro);
    }
}
