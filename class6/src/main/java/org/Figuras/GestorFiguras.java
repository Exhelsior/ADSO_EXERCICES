package org.Figuras;

public class GestorFiguras {
    private Figura[] figuras;

    public GestorFiguras(Figura[] figuras) {
        this.figuras = figuras;
    }

    public void mostrarResultados() {
        System.out.println("\n...Resultados...");
        Figura mayor = null;
        for (Figura f : figuras) {
            if (f instanceof Dibujable d){
                d.dibujar();
            }
            System.out.printf(" Area: %.2f  |  Perimetro: %.2f%n", f.area(), f.perimetro());
            if (mayor == null || f.area() > mayor.area()) {
                mayor = f;
            }
        }
        System.out.println("\nLa figura con mayor area es: " + mayor.getClass().getSimpleName() + " (area = " + String.format("%.2f", mayor.area()) + ")");
    }
}
