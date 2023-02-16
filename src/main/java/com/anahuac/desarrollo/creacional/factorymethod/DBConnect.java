package com.anahuac.desarrollo.creacional.factorymethod;

public interface DBConnect {

     void openConn();
     void closeConn();
     void createSentence();
     void executeSentence();
}
