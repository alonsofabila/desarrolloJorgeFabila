package com.anahuac.desarrollo.creacional.builder;

public class Laptop {

    private String ssd;
    private String ram;
    private String cpu;
    private String keyboard;
    private String os;

    private Laptop(LaptopBuilder lapbuild){
        this.ssd = lapbuild.ssd;
        this.ram = lapbuild.ram;
        this.cpu = lapbuild.cpu;
        this.keyboard = lapbuild.keyboard;
        this.os = lapbuild.os;
    }

    public void print(){
        System.out.println("-------------");
        System.out.println("Especificaciones:\n" + "CPU: " + this.cpu + "\nSSD: " + this.ssd + "\nMemoria ram: " + this.ram + "\nSistema operativo: " + this.os + "\nTeclado: " + this.keyboard);
    }

    public static class LaptopBuilder{
        private String ssd;
        private String ram;
        private String cpu;
        private String keyboard;
        private String os;

        public LaptopBuilder(){}

        public LaptopBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public LaptopBuilder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public LaptopBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public Laptop build(){
            return new Laptop(this);
        }

    }

}
