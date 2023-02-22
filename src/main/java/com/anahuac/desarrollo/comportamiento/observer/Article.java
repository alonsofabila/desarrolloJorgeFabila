package com.anahuac.desarrollo.comportamiento.observer;

public class Article {

    private String name;
    private float price;

    public Article(String name, float price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
