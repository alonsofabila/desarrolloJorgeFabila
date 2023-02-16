package com.anahuac.desarrollo.estructral.decorator;

public abstract class TicketDecorator implements Ticket {

    protected float price;
    protected Ticket ticket;

    @Override
    public void cost() {
        ticket.cost();
    }

    @Override
    public void description() {
        ticket.description();
    }
}
