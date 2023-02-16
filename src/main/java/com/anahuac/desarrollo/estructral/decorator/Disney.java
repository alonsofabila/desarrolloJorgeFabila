package com.anahuac.desarrollo.estructral.decorator;

public class Disney extends TicketDecorator{

    public Disney(Ticket ticket){
        this.ticket = ticket;
        this.price = 100;
    }

    public void cost(){
        System.out.println("Costo de Disney+: $" + this.price);
    }

    public void description(){
        super.description();
    }
}
