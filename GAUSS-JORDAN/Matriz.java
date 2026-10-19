/**
 * Define la matriz aumentada [A|b] y utilidades basicas de acceso.
 * Responsabilidad: SOLO la definicion/validacion de datos.
 */
public class Matriz {

    /** Crea una copia profunda para no alterar la matriz original. */
    public static double[][] copiar(double[][] origen) {
        double[][] copia = new double[origen.length][];
        for (int i = 0; i < origen.length; i++) {
            copia[i] = origen[i].clone();
        }
        return copia;
    }

    /** Valida que la matriz aumentada sea de tamano n x (n+1). */
    public static void validar(double[][] m) {
        if (m == null || m.length == 0) {
            throw new IllegalArgumentException("La matriz esta vacia.");
        }
        int n = m.length;
        for (double[] fila : m) {
            if (fila.length != n + 1) {
                throw new IllegalArgumentException(
                    "La matriz aumentada debe ser de tamano n x (n+1).");
            }
        }
    }

    /** Intercambia dos renglones (solo cambia referencias, O(1)). */
    public static void intercambiarFilas(double[][] m, int a, int b) {
        double[] tmp = m[a];
        m[a] = m[b];
        m[b] = tmp;
    }
}
