package org.example;

public class Carro extends Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("Carro arrancando");
    }

    @Override
    public void detener() {
        System.out.println("Carro deteniendoce");
    }

    @Override
    public void combustible() {
        System.out.println("Carro funciona con combustible");
    }

}
