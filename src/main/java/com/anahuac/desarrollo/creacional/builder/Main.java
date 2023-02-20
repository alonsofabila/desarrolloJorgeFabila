package com.anahuac.desarrollo.creacional.builder;

public class Main {
    public static void main(String[] args) {

        Laptop lap = new Laptop.LaptopBuilder().setSsd("256 gb").setRam("16 gb").setCpu("AMD Ryzen 5").setKeyboard("English").setOs("Windows 11").build();

        lap.print();
    }
}
