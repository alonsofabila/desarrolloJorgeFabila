package com.anahuac.desarrollo.comportamiento.templatemethod;

public abstract class Logger {

    protected Event event;

    public void open(){
        System.out.println("------------");
        System.out.println("Abriendo el archivo");
    }
    public abstract void formatt(Event event);
    public  void save(){
        System.out.println("Guardando");
    }
    public  void close(){
        System.out.println("Cerrando Archivo");

    }
    public final void write(Event event){
        open();
        formatt(event);
        save();
        close();
    }
}
