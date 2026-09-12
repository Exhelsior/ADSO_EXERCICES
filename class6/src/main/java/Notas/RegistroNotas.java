package Notas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RegistroNotas {
    private final HashMap<String, ArrayList<Double>> notas = new HashMap<>();

    public boolean existe(String nombre) {
        return notas.containsKey(nombre);
    }

    public void addEstudiante(String nombre) {
        if (notas.containsKey(nombre)) {
            System.out.println("El estudiante ya esta registrado\n");
            return;
        }
        notas.put(nombre, new ArrayList<>());
        System.out.println("Estudiante \"" + nombre + "\" agregado. \n");
    }

    public void agregarNotas(String nombre, Double nota) {
        if (!notas.containsKey(nombre)) {
            System.out.println("Es estudiante no existe.Agregalo primero. \n");
            return;
        }
        notas.get(nombre).add(nota);
        System.out.println("Nota agregada a \"" + nombre + "\". \n");
    }

    public double calcularPromedio(String nombre) {
        try {
            ArrayList<Double> listaNotas = notas.get(nombre);
            if (listaNotas.isEmpty()) {
                throw new ArithmeticException(("Lista de notas vacia"));
            }
            double suma = 0;
            for(double n : listaNotas) {
                suma += n;
            }
            return suma / listaNotas.size();
        } catch (ArithmeticException e) {
            return Double.NaN;
        }
    }

    public void listarAprobados() {
        System.out.println("Estudiantes aprobados (promedio >= 3.0)");
        boolean hayAprobados = false;

        for (String nombre : notas.keySet()) {
            double promedio = calcularPromedio(nombre);
            if(!Double.isNaN(promedio) && promedio >= 3.0) {
                System.out.printf("  %s: %.2f%n%n", nombre, promedio);
                hayAprobados = true;
            }
        }

        if(!hayAprobados) {
            System.out.println("(Ningun estudiante aprobado todavia)");
        }
        System.out.println();
    }

    public void mostrarMejorPromedio() {
        String mejorNombre = null;
        double mejorPromedio = -1;

        for (Map.Entry<String, ArrayList<Double>> entrada : notas.entrySet()) {
            double promedio = calcularPromedio(entrada.getKey());
            if(!Double.isNaN(promedio) && promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorNombre = entrada.getKey();
            }
        }

        if(mejorNombre == null) {
            System.out.println("Aun no hay estudiambres con notas registradas. \n");
        } else {
            System.out.printf("El mejor promedio es de %s con %.2f%n%n", mejorNombre, mejorPromedio);
        }
    }
}
