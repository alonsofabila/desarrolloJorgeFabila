package com.anahuac.desarrollo.creacional.factorymethod;

public abstract class DBCreator {

    public String dbType;

    public abstract DBConnect createDB(String dbType);

    public DBConnect consultReporte(ReporteA reporte){
        DBConnect db= createDB(dbType);
        db.openConn();
        db.closeConn();
        db.createSentence();
        db.executeSentence();
        return db;
    }

}
