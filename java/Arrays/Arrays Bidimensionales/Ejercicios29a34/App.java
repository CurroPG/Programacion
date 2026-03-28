package Ejercicios29a34;

public class FuncionesBidimensionales {
    /**
     * Crea una array bidimensional de números enteros
     * 
     * @param ancho
     * @param alto
     * @return array bidimensional
     */
    public static int[][] generaArrayBiInt(int ancho, int alto) {
        int array[][] = new int[alto][ancho];
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                int aleatorio = (int) (Math.random() * 101);
                array[i][j] = aleatorio;
            }
        }
        return array;
    }

    /**
     * Devuelve la fila indicada de una array bidimensional
     * 
     * @param fila
     * @param array
     */
    public static void filaDeArrayBiInt(int fila, int[][] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == fila)
                    System.out.print(array[i][j] + " ");
            }
        }
    }

    /**
     * Devuelve la columna indicada de una array bidimensional
     * 
     * @param fila
     * @param array
     */
    public static void columnaDeArrayBiInt(int columna, int[][] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == columna)
                    System.out.print(array[i][j] + " ");
            }
        }
    }

    /**
     * Devuelve la coordenada de un número indicado de una array bidimensional
     * 
     * @param fila
     * @param array
     */
    public static void coordenadasEnArrayBiInt(int numero, int[][] array) {
        boolean esta = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (array[i][j] == numero) {
                    System.out.print(i + " " + j);
                    esta = true;
                }
            }
        }
        if (!esta)
            System.out.print("-1 -1");
    }

    public static void minimoYmaximo(int array[][]) {
        int minimo = Integer.MAX_VALUE;
        int maximo = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (array[i][j] < minimo)
                    minimo = array[i][j];
                if (array[i][j] > maximo)
                    maximo = array[i][j];
            }
        }
        System.out.print(minimo + " " + maximo);
    }

    public static void diagonal(int fila, int columna, String direccion, int[][] array) {
        if (direccion.equals("nose")) {
            do {
                fila--;
                columna--;
            } while ((fila != 0) && (columna != 0));
        } else {
            do {
                fila--;
                columna++;
            } while ((fila != 0) && (columna != 7));
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == fila && j == columna && direccion.equals("nose")) {
                    System.out.print(array[i][j] + " ");
                    fila++;
                    columna++;
                }
                if (i == fila && j == columna && direccion.equals("neso")) {
                    System.out.print(array[i][j] + " ");
                    fila++;
                    columna--;
                }
            }
        }
    }
}
