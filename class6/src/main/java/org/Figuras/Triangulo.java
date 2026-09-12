package org.Figuras;

public class Triangulo extends Figura implements Dibujable{
    private double base;
    private double altura;
    private double lA;
    private double lB;
    private double lC;

    public Triangulo(double base, double altura, double lA, double lB, double lC) {
        this.base = base;
        this.altura = altura;
        this.lA = lA;
        this.lB = lB;
        this.lC = lC;
    }

    @Override
    double area(){
        return (base * altura) / 2.0;
    }

    @Override
    double perimetro(){
        return lA + lB + lC;
    }

    @Override
    public void dibujar() {
        System.out.println("Triangulo de base " + base + " y altura " + altura);
    }
}
