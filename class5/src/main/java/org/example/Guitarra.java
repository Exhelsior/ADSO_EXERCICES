package org.example;

public class Guitarra implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocar las cuerdas");
    }

    @Override
    public void afinar(){
        System.out.println("Girar clavijas para afinar las cuerdas");
    }

}
