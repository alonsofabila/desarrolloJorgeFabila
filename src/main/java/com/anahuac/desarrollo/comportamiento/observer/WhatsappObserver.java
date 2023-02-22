package com.anahuac.desarrollo.comportamiento.observer;

public class WhatsappObserver implements Observer{

    @Override
    public void update(Article article) {
        System.out.println("notificacion de whats: " + article.getName() + " tiene un precio de: $" + article.getPrice());
    }
}
