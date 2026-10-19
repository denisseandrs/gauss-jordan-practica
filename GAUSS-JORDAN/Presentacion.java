/** Presentacion de resultados por consola (sin logica numerica). */
public class Presentacion {

    public static void mostrarMatriz(String titulo, double[][] m) {
        System.out.println(titulo);
        int n = m.length;
        for (double[] fila : m) {
            StringBuilder sb = new StringBuilder("[ ");
            for (int j = 0; j < fila.length; j++) {
                if (j == n) sb.append("| ");
                double v = Math.abs(fila[j]) < 1e-10 ? 0.0 : fila[j];
                sb.append(String.format("%9.4f ", v));
            }
            sb.append("]");
            System.out.println(sb);
        }
        System.out.println();
    }

    public static void mostrarSoluciones(double[] x) {
        System.out.println("Vector de soluciones:");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("  x%d = %.4f%n", i + 1, x[i]);
        }
        System.out.println();
    }
}
