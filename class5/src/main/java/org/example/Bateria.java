package org.example;

public class Bateria implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("bateria toca los tambores y platos");
    }

    @Override
    public void afinar(){
        System.out.println("tenza la piel los tambores");
    }

}
