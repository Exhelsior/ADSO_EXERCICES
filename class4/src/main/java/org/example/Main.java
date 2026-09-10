package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
          new Carro(),
          new Moto(),
          new Bicicleta(),
        };

        Viaje viaje = new Viaje();

        for (Vehiculo v : vehiculos) {
            viaje.iniciarViaje(v);
        }
    }
}