package org.Figuras;

public class Rectangulo extends Figura implements Dibujable {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
   double area() {
        return base * altura;
    }

    @Override
    double perimetro () {
        return 2 * (base + altura);
    }

    @Override
    public void dibujar() {
        System.out.println("Rectangulo de " + base + " x " + altura);
    }
}
