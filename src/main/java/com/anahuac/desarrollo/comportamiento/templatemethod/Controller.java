package com.anahuac.desarrollo.comportamiento.templatemethod;

public class Controller {
    public static void main(String[] args) {

        Event event = new Event("prueba numero uno", "18/9/2022", "prueba fallida");
        Event even2 = new Event("prueba numero dos", "18/10/2022", "prueba fallida proyecto suspendido hasta nuevo aviso");
        Event even3 = new Event("prueba numero tres", "13/02/2023", "despues de mucha investigacion el proyecto se ha vuelto a poner en marcha y la prueba fue exitosa");


        LoggerCSV logger1 = new LoggerCSV(event);
        LoggerJSON logger2 = new LoggerJSON(even2);
        LoggerTxt logger3 = new LoggerTxt(even3);

        logger1.write(event);
        logger2.write(even2);
        logger3.write(even3);
    }
}
