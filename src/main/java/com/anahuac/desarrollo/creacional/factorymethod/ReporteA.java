package com.anahuac.desarrollo.creacional.factorymethod;

public class ReporteA {

    private String name;
    private DBCreator handler;

    public ReporteA(String name, DBCreator handler){
        this.name = name;
        this.handler = handler;
    }

    public DBCreator getHandler(){
        return handler;
    }

    public String getName(){
        return name;
    }

    public void seeReporte(ReporteA reporte){
        System.out.println("Usuario: " + this.name);
        handler.consultReporte(reporte);
    }

}
