package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear arreglo de 5 libros
        Libros[] libros = new Libros[5];

        // Pedir información de los libros
        for (int i = 0; i < libros.length; i++) {

            System.out.println("\nLibro #" + (i + 1));

            System.out.print("Ingrese el título: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el autor: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese el año de publicación: ");
            int anio = scanner.nextInt();

            scanner.nextLine(); // Limpiar el salto de línea

            // Crear el objeto Libro
            libros[i] = new Libros(titulo, autor, anio);
        }

        // Mostrar información de todos los libros
        System.out.println("\n===== LIBROS INGRESADOS =====");

        for (Libros libro : libros) {
            libro.mostrarInformacion();
        }


        boolean encontrado = false;


        while (!encontrado) {

            System.out.println("Ingrese el título del libro que desea buscar:");
            String tituloBuscado = scanner.nextLine();

            for (Libros libro : libros) {

                if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                    System.out.println("\nLibro encontrado:");
                    libro.mostrarInformacion();

                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún libro con ese título.");
                System.out.println("Intente nuevamente.\n");
            }
        }


        // Buscar el libro más antiguo
        Libros libroAntiguo = libros[0];

        for (int i = 1; i < libros.length; i++) {

            if (libros[i].getAnioPublicacion() <
                    libroAntiguo.getAnioPublicacion()) {

                libroAntiguo = libros[i];
            }
        }

        System.out.println("\n===== LIBRO MÁS ANTIGUO =====");
        libroAntiguo.mostrarInformacion();

        scanner.close();
    }
}