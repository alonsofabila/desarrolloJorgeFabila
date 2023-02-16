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

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermission() {
        return permission;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }
}
