package org.example;

public class Director {
    public void batuta () {

        Instrumento[] instrumentos = {
                new Guitarra(),
                new Piano(),
        };

        Orquesta tocarOrquesta = new Orquesta();

        for (Instrumento i : instrumentos) {
            tocarOrquesta.tocarOrquesta(i);
        }
    }

}
