package com.anahuac.desarrollo.creacional.singleton;

public class ReporteA {

    DBConnect conexion = DBConnect.getInstance();

    String reporte;

    public ReporteA(String reporte){
        this.reporte = reporte;
    }

    public void print(){
        conexion.getConnection();
        System.out.println(this.reporte);
    }
}
