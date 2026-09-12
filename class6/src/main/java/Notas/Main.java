package Notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroNotas registro = new RegistroNotas();
        MenuNotas menu = new MenuNotas(sc, registro);

        menu.iniciar();

        sc.close();
    }
}
