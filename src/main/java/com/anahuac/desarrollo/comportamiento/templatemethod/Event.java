package com.anahuac.desarrollo.comportamiento.templatemethod;

public class Event {

    private final String type;
    private final String date;
    private final String msg;

    public Event(String type, String date, String msg){
        this.type = type;
        this.date = date;
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getMsg() {
        return msg;
    }
}
