package org.example;

public class Bicicleta extends Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("Bicileta arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Bicileta deteniendoce");
    }

    @Override
    public void combustible() {
        System.out.println("Bicicleta no funciona con combustible, se mueve a pedal");
    }
}
