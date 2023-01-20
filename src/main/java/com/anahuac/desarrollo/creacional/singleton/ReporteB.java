package com.anahuac.desarrollo.creacional.singleton;

public class ReporteB {

    DBConnect conexion = DBConnect.getInstance();

    String reporte;

    public ReporteB(String reporte){
        this.reporte = reporte;
    }

    public void print(){
        conexion.getConnection();
        System.out.println(this.reporte);
    }
}
