/**
 * Metodo de Gauss-Jordan. REUTILIZA Gauss.eliminacionGaussiana() para la
 * fase de triangulacion y agrega: normalizacion de pivotes + barrido superior.
 */
public class GaussJordan {

    /**
     * Transforma la matriz aumentada en la matriz identidad (en sitio, por referencia)
     * y devuelve el vector de soluciones leido de la ultima columna.
     */
    public static double[] resolver(double[][] m) {
        // Paso 1: reutilizacion -> triangular superior
        Gauss.eliminacionGaussiana(m);

        int n = m.length;

        // Paso 2: recorrer hacia arriba
        for (int i = n - 1; i >= 0; i--) {
            normalizarPivote(m, i);
            eliminarSuperiores(m, i);
        }

        // Paso 3: lectura directa, sin sustitucion regresiva
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = m[i][n];
        }
        return x;
    }

    /** Divide todo el renglon i entre su pivote para dejar 1 en la diagonal. */
    private static void normalizarPivote(double[][] m, int i) {
        double pivote = m[i][i];
        for (int j = i; j < m[i].length; j++) {
            m[i][j] /= pivote;
        }
    }

    /** Anula los coeficientes de la columna i en los renglones superiores. */
    private static void eliminarSuperiores(double[][] m, int i) {
        for (int k = i - 1; k >= 0; k--) {
            double factor = m[k][i];
            for (int j = i; j < m[k].length; j++) {
                m[k][j] -= factor * m[i][j];
            }
        }
    }
}
