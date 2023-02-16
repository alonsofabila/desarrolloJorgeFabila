package com.anahuac.desarrollo.estructral.decorator;

public class BaseTicket implements Ticket{

    private float price;
    private String date;

    public BaseTicket(String date){
        this.date = date;
        this.price = 200;
    }

    @Override
    public void cost() {
        System.out.println("Costo Telefono: $" + this.price);

    }

    @Override
    public void description() {
        System.out.println("---------------");
        System.out.println("Fecha de Contratacion del servicio :" + this.date);
        System.out.println("Costo Telefono: $" + this.price + "\n");
    }
}
