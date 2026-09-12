package org.Figuras;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        LectorFiguras lector = new LectorFiguras(sc);
        Circulo circulo = lector.pedirCirculo();
        Rectangulo rectangulo = lector.pedirRectangulo();
        Triangulo triangulo = lector.pedirTriangulo();

        Figura[] figuras = {circulo, rectangulo, triangulo};
        GestorFiguras gestor = new GestorFiguras(figuras);
        gestor.mostrarResultados();

        sc.close();
    }
}
