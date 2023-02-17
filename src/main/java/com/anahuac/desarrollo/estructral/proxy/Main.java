package com.anahuac.desarrollo.estructral.proxy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bannedPages = new ArrayList<String>();
        bannedPages.add("www.facebook.com");
        bannedPages.add("www.youtube.com");
        bannedPages.add("www.friv.com");
        bannedPages.add("www.wikipedia.com");

        PPage pag1 = new PPage(bannedPages);
        User user = new User("Alonso", true);
        pag1.open("www.friv.com", user);

        PPage pag2 = new PPage(bannedPages);
        User user2 = new User("Valeria", false);
        pag2.open("www.wikipedia.com", user2);

        PPage pag3 = new PPage(bannedPages);
        User user3 = new User("Romina", false);
        pag3.open("www.facebook.com", user3);

        PPage pag4 = new PPage(bannedPages);
        User user4 = new User("Alfredo", true);
        pag4.open("www.youtube.com", user4);
    }
}
