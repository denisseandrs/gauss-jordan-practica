/** Programa principal: define los sistemas de prueba y coordina los modulos. */
public class Main {

    public static void main(String[] args) {
        double[][][] pruebas = {
            // Prueba 1: 3x3 -> x1=-17, x2=10, x3=-21
            { {2, 1, -1,  -3}, {-3, -1, 2, -1}, {-2, 1, 2, 2} },
            // Prueba 2: 3x3 con pivote inicial cero (requiere pivoteo)
            { {0, 2, 1, 8}, {1, 1, 1, 6}, {2, 1, -1, 1} },
            // Prueba 3: 4x4
            { {1, 1, 1, 1, 10}, {2, -1, 1, 0, 5}, {1, 2, -1, 1, 6}, {3, 1, 0, -1, 4} },
            // Prueba 4: sistema singular
            { {1, 2, 3, 6}, {2, 4, 6, 12}, {1, 1, 1, 3} }
        };
        for (int t = 0; t < pruebas.length; t++) {
            System.out.println("=== PRUEBA " + (t + 1) + " ===");
            double[][] m = Matriz.copiar(pruebas[t]);
            Presentacion.mostrarMatriz("Matriz aumentada inicial:", m);
            try {
                double[] x = GaussJordan.resolver(m);
                Presentacion.mostrarMatriz("Matriz final (identidad | soluciones):", m);
                Presentacion.mostrarSoluciones(x);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage() + "\n");
            }
        }
    }
}
