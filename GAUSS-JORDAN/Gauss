/**
 * Practica anterior: Eliminacion Gaussiana (triangulacion superior).
 * Modifica la matriz RECIBIDA POR REFERENCIA (en memoria RAM), sin copiarla.
 */
public class Gauss {

    private static final double EPSILON = 1e-12;

    /**
     * Convierte la matriz aumentada en triangular superior (con pivoteo parcial).
     * @param m matriz aumentada n x (n+1); se modifica en sitio.
     * @throws ArithmeticException si el sistema es singular.
     */
    public static void eliminacionGaussiana(double[][] m) {
        Matriz.validar(m);
        int n = m.length;

        for (int k = 0; k < n - 1; k++) {
            // Pivoteo parcial: fila con mayor valor absoluto en la columna k
            int filaMax = k;
            for (int i = k + 1; i < n; i++) {
                if (Math.abs(m[i][k]) > Math.abs(m[filaMax][k])) {
                    filaMax = i;
                }
            }
            if (Math.abs(m[filaMax][k]) < EPSILON) {
                throw new ArithmeticException(
                    "Sistema singular: pivote nulo en la columna " + (k + 1));
            }
            if (filaMax != k) {
                Matriz.intercambiarFilas(m, k, filaMax);
            }

            // Eliminacion hacia adelante (ceros debajo del pivote)
            for (int i = k + 1; i < n; i++) {
                double factor = m[i][k] / m[k][k];
                for (int j = k; j <= n; j++) {
                    m[i][j] -= factor * m[k][j];
                }
            }
        }
        if (Math.abs(m[n - 1][n - 1]) < EPSILON) {
            throw new ArithmeticException("Sistema singular: ultimo pivote nulo.");
        }
    }
}

