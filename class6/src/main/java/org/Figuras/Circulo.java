package org.Figuras;

public class Circulo extends Figura implements Dibujable {

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    double area() {
        return Math.PI * radio * radio;
    }

    @Override
    double perimetro() {
        return 2 * Math.PI * radio * radio;
    }

    @Override
    public void dibujar() {
    System.out.println("Circulo de radio " + radio);
    }

}

