package com.anahuac.desarrollo.estructral.proxy;

public class User {

    private String name;
    private boolean permission;

    public User(String name, boolean permission){
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return name;
    }

    public boolean isPermission() {
        return permission;
    }

}
