package org.example;

import java.util.Scanner;



public class exercice_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operations op = new Operations();

        System.out.print("Ingresa el primer numero:");
        int num1 = input.nextInt();

        System.out.print("Ingresa el segundo numero:");
        int num2 = input.nextInt();

        System.out.print("Ingresa el tercer numero:");
        int num3 = input.nextInt();

        int suma = op.sumar(num1, num2, num3);
        double prom = op.promedio(suma);
        int mayor = op.mayor(num1, num2, num3);
        int resta = op.resta(num1, num2, num3);

        System.out.println("La suma es: " + suma);
        System.out.println("La prom es: " + prom);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("La resta es: " + resta);

    }
}
