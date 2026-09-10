package org.example;

public class Moto extends Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("Moto arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Moto deteniendoce");
    }

    @Override
    public void combustible() {
        System.out.println("Moto funciona con combustible");
    }
}
