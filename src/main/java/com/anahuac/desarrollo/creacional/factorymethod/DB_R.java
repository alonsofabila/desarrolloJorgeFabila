package com.anahuac.desarrollo.creacional.factorymethod;

public class DB_R extends DBCreator{

    public DB_R(String dbType){
        this.dbType = dbType;
    }

    @Override
    public DBConnect createDB(String dbType) {
        if (dbType.equals("Oracle")){
            return new Oracle();
        }
        else if (dbType.equals("SQLServer")){
            return new SQLServer();
        }
        return null;
    }
}
