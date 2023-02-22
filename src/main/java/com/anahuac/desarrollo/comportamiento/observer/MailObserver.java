package com.anahuac.desarrollo.comportamiento.observer;

public class MailObserver implements Observer {

    @Override
    public void update(Article article) {
        System.out.println("notificacion del correo: " + article.getName() + " tiene un precio de: $" + article.getPrice());
    }
}
