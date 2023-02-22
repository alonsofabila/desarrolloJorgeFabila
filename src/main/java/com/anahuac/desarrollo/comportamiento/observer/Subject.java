package com.anahuac.desarrollo.comportamiento.observer;

public interface Subject {

    void alertOn(Observer article);
    void alertOff(Observer article);
    void notifyObserver(Article article);
}
