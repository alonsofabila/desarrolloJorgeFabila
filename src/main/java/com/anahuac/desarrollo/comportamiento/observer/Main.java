package com.anahuac.desarrollo.comportamiento.observer;

public class Main {
    public static void main(String[] args) {

        BrowserObserver opera = new BrowserObserver();
        MailObserver gmail = new MailObserver();
        WhatsappObserver whats = new WhatsappObserver();

        Article manzana = new Article("manzana", 16);
        Article pera = new Article("pera", 15);

        ItemMonitoring system = new ItemMonitoring();

        system.alertOn(opera);
        system.alertOn(gmail);
        system.alertOn(whats);

        system.notifyObserver(manzana);
        manzana.setPrice(20);
        system.notifyObserver(manzana);


        system.alertOff(opera);
        system.alertOff(whats);

        system.notifyObserver(pera);
        pera.setPrice(18);
        system.notifyObserver(pera);

    }
}
