package org.example;

public class Viaje {
    public void iniciarViaje(
            Vehiculo v) {
        v.arrancar();
        v.detener();
        v.combustible();
    }
}
