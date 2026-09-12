package org.Figuras;

import java.util.Scanner;

public class Ejercicio {
    private static double leerDouble (Scanner sc, String mensaje) {
        double valor = -1;
        boolean valido = false;
        while (!valido) {
            System.out.println(mensaje);

            try {
                valor = Double.parseDouble(sc.nextLine());
                if (valor <= 0) {
                    System.out.println("Ingresa un valor positivo");
                    continue;
                }
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println(" No es un numero valido. Ingrese un nuevo valor");
            }
        }
        return valor;
    }
}
