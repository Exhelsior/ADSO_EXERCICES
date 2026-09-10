package org.example;

public class Operations {

    public int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double promedio(int suma) {
        return suma / 3.0;
    }

    public int mayor(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public int resta(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }
}