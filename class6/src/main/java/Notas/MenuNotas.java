package Notas;

import java.util.Scanner;

public class MenuNotas {
    private final Scanner sc;
    private final RegistroNotas registro;

    public MenuNotas(Scanner sc, RegistroNotas registro) {
        this.sc = sc;
        this.registro = registro;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> opcionAgregarEstudiante();
                case "2" -> opcionAgregarNota();
                case "3" -> opcionConsultarPromedio();
                case "4" -> registro.listarAprobados();
                case "5" -> registro.mostrarMejorPromedio();
                case "6" -> salir = true;
                default -> System.out.println("Opcion no valida.\n");
            }
        }
        System.out.println("Ejercicio finalizado.");
    }

    private void mostrarMenu() {
        System.out.println("---Registro de Notas---");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Agregar nota a un estudiante");
        System.out.println("3. Consultar promedio de un estudiante");
        System.out.println("4. Listar estudiantes aprobados (promedio >= 3.0)");
        System.out.println("5. Mostara estudiante con el promedio mas alto");
        System.out.println("6. Salir");
        System.out.print("Elige una opcion: ");
    }

    private void opcionAgregarEstudiante() {
        System.out.println("Nombre del estudiante: ");
        String nombre = sc.nextLine();
        registro.addEstudiante(nombre);
    }

    private void opcionAgregarNota() {
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        if(!registro.existe(nombre)){
            System.out.println("Este estudiante no existe\n");
            return;
        }

        System.out.print("Nota a agreagar: ");
        try {
            double nota = Double.parseDouble(sc.nextLine());
            registro.agregarNotas(nombre, nota);
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un numero valido. La nota no fue registrada\n");
        }
    }

    private void opcionConsultarPromedio() {
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        if (!registro.existe(nombre)){
            System.out.println("Este estudiante no existe.\n");
            return;
        }

        double promedio = registro.calcularPromedio(nombre);
        if (Double.isNaN(promedio)){
            System.out.println("\"" + nombre + "\" no tiene notas registradas aun.\n");
        } else {
            System.out.printf("Promedio: %s: %.2f%n%n", nombre, promedio);
        }
    }
}
