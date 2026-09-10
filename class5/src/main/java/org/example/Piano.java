package org.example;

public class Piano implements Instrumento{

    @Override
    public void tocar() {
        System.out.println("Presionar las teclas");
    }

    @Override
    public void afinar() {
        System.out.println("Tencionar las cuerdas");
    }
}
