package com.anahuac.desarrollo.estructral.decorator;

public class HBO extends TicketDecorator{

    public HBO(Ticket ticket){
        this.ticket = ticket;
        this.price = 100;
    }

    public void cost(){
        System.out.println("Costo de HBO: $" + this.price);
    }

    public void description(){
        super.description();
    }
}
