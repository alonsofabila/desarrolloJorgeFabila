package com.anahuac.desarrollo.estructral.adapter;

import java.time.LocalDate;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        ArrayList<IDep> personasNuevas = new ArrayList<IDep>();

        DepA personaNueva = new DepA("Alonso Fabila", 21);

        DepB personaVieja = new DepB("Alfredo ", "Fabila", LocalDate.of(2001, 2, 16));
        DepB personaVieja2 = new DepB("Ricardo ", "Fabila", LocalDate.of(1996, 8, 28));
        DepB personaVieja3 = new DepB("Valeria ", "Romero", LocalDate.of(2003, 3, 27));

        personaVieja.print();
        personaVieja2.print();
        personaVieja3.print();

        AdapterA personaAdaptada = new AdapterA("Alfredo", 23, personaVieja);
        AdapterA personaAdaptada2 = new AdapterA("Ricardo", 26, personaVieja2);
        AdapterA personaAdaptada3 = new AdapterA("Valeria", 19, personaVieja3);

        personasNuevas.add(personaNueva);
        personasNuevas.add(personaAdaptada);
        personasNuevas.add(personaAdaptada2);
        personasNuevas.add(personaAdaptada3);

        System.out.println("\n-----Lista de personas Nuevas-----");
        for (int i = 0; i < 4; i++){
            personasNuevas.get(i).print();
        }
    }
}
