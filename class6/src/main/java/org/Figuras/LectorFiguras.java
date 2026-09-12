package org.Figuras;

import java.util.Scanner;

public class LectorFiguras {
    private Scanner sc;

    public LectorFiguras(Scanner sc) {
        this.sc = sc;
    }

    private double leerdouble(String mensaje) {
        double valor = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                valor = Double.parseDouble(sc.nextLine().trim());
                if (valor <= 0) {
                    System.out.println("  ⚠ El valor debe ser positivo. Intenta de nuevo.");
                    continue;
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("  ⚠ Eso no es un número válido. Intenta de nuevo.");
            }
        }
        return valor;
    }

    public Circulo pedirCirculo() {
        System.out.println("\n ...Circulo... ");
        double radio = leerdouble("Radio: ");
        return new Circulo(radio);
    }

    public Rectangulo pedirRectangulo() {
        System.out.println("\n ...Rectangulo... ");
        double base = leerdouble("Base: ");
        double altura = leerdouble("Altura: ");
        return new Rectangulo(base, altura);
    }

    public Triangulo pedirTriangulo() {
        System.out.println("\n ...Triangulo... ");
        double base = leerdouble("Base: ");
        double altura = leerdouble("Altura: ");
        double lA =  leerdouble("Lado A: ");
        double lB =  leerdouble("Lado B: ");
        double lC =  leerdouble("Lado C: ");
        return new Triangulo(base, altura, lA, lB, lC);
    }
}


