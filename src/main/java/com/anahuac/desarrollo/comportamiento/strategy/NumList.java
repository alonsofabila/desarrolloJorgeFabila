package com.anahuac.desarrollo.comportamiento.strategy;

public class NumList {

    private SortBehavior sb;

    public void setSb(SortBehavior sb) {
        this.sb = sb;
    }

    public void setNums() {
        System.out.println("Lista de numeros desordenados: 2 1 6 3 5 4");
    }

    public void performSort() {
        sb.sort();
    }

    public void display() {
        System.out.println("Lista de numeros desordenados: 2 1 6 3 5 4");
        System.out.println("Lista de numeros desordenados: 1 2 3 4 5 6\n");
    }
}
