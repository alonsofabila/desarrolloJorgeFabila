package com.anahuac.desarrollo.comportamiento.observer;

import com.anahuac.desarrollo.estructral.decorator.Prime;

public class BrowserObserver implements Observer{

    @Override
    public void update(Article article) {
        System.out.println("notificacion del navegador: " + article.getName() + " tiene un precio de: $" + article.getPrice());
    }
}
