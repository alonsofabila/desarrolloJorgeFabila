package com.anahuac.desarrollo.estructral.proxy;

import java.util.ArrayList;

public class PPage implements Access{

    private Page page;
    private ArrayList<String> bannedPages;

    public PPage(ArrayList<String> bannedpages){
        this.bannedPages = bannedpages;
        this.page = new Page();
    }

    @Override
    public void open(String name, User user) {
        if(!this.bannedPages.contains(name) || user.isPermission()){
            this.page.open(name, user);
        }
        else {
            System.out.println("-----");
            System.out.println("Usuario: " + user.getName() + "\nAcceso a la pagina: " + name +" Bloqueado");
            System.out.println("-----");

        }
    }
}
