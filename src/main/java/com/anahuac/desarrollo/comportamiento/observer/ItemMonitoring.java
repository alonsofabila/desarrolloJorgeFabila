package com.anahuac.desarrollo.comportamiento.observer;

import java.util.ArrayList;

public class ItemMonitoring implements Subject{

    private ArrayList<Observer> observers = new ArrayList<>();
    //private ArrayList<Article> articulos = new ArrayList<>();

    @Override
    public void alertOn(Observer article) {
        System.out.println("-----Notificaciones activadas-----");
        observers.add(article);
    }

    @Override
    public void alertOff(Observer article) {
        System.out.println("-----Notificaciones desactivadas-----");
        observers.remove(article);
    }

    @Override
    public void notifyObserver(Article article) {
        System.out.println("\n-----------");
        for (Observer observer : observers){
            observer.update(article);
        }
        System.out.println("-----------\n");
    }
}
