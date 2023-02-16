package com.anahuac.desarrollo.creacional.factorymethod;

public interface DBConnect {

    public void openConn();
    public void closeConn();
    public void createSentence();
    public void executeSentence();
}
