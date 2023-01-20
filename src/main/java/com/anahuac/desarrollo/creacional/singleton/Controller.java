package com.anahuac.desarrollo.creacional.singleton;

public class Controller {
    public static void main(String[] args) {

        ReporteA connectionA = new ReporteA("Coneccion desde el reporte A\n");
        ReporteB connectionB = new ReporteB("Coneccion desde el reporte B\n");

        connectionA.print();
        connectionB.print();

        if(connectionA.conexion == connectionB.conexion){
            System.out.println("ccnectados a la misma base de datos");
        }
        else{
            System.out.println("no estan conectados a la misma base de datos");
        }
    }

}
