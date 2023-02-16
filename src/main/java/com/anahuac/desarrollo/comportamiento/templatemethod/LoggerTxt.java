package com.anahuac.desarrollo.comportamiento.templatemethod;

public class LoggerTxt extends Logger{

    public LoggerTxt(Event event){
        this.event = event;
    }

    @Override
    public void formatt(Event event) {
        System.out.println("\nTypo: " + event.getType() + "\nFecha: " + event.getDate() + "\nMensaje: " + event.getMsg() + "\n");
    }
}
