package com.anahuac.desarrollo.creacional.factorymethod;

public class DB_N extends DBCreator{

    public DB_N(String dbType){
        this.dbType = dbType;
    }

    @Override
    public DBConnect createDB(String dbType) {
        if (dbType.equals("MongoDB")){
            return new MongoDB();
        }
        else if (dbType.equals("CouchDB")){
            return new CouchDB();
        }
        return null;
    }
}
