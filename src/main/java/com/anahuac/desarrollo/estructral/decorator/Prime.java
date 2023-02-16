package com.anahuac.desarrollo.estructral.decorator;

public class Prime extends TicketDecorator{

    public Prime(Ticket ticket){
        this.ticket = ticket;
        this.price = 50;
    }

    public void cost(){
        System.out.println("Costo de Prime: $" + this.price);
    }

    public void description(){
        super.description();
    }
}
