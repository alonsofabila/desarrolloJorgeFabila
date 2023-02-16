package com.anahuac.desarrollo.estructral.decorator;

public class Controller {

    public static void main(String[] args) {

        Ticket baseticket = new BaseTicket("16/02/2022");
        baseticket.description();
        baseticket.cost();

        Ticket hboticket = new HBO(baseticket);
        hboticket.description();
        hboticket.cost();

        Ticket primeticket = new Prime(baseticket);
        primeticket.description();
        primeticket.cost();

        Ticket disneytucket = new Disney(baseticket);
        disneytucket.description();
        disneytucket.cost();


    }
}
