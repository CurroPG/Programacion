package Ejercicio5B;

public class App {
    public static void main(String[] args) {
        int array[][] = new int[6][10];
        int minimo = Integer.MAX_VALUE;
        int maximo = 0;
        int aleatorio = 0;
        boolean esta = false;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                do {
                    aleatorio = (int) (Math.random() * 1001);
                    for (int k = 0; k < 6; k++) {
                        for (int z = 0; z < 10; z++) {
                            if (aleatorio == array[k][z])
                                esta = true;
                            else 
                                esta = false;
                        }
                    }
                } while (esta);
                array[i][j] = aleatorio;
                System.out.printf("%4d", aleatorio);
                if (j == 9)
                    System.out.println();
                if (array[i][j] < minimo)
                    minimo = array[i][j];
                if (array[i][j] > maximo)
                    maximo = array[i][j];
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (array[i][j] == maximo)
                    System.out.println("El máximo es " + maximo + " y está en la fila " + i + ", columna " + j);
                if (array[i][j] == minimo)
                    System.out.println("El mínimo es " + minimo + " y está en la fila " + i + ", columna " + j);
            }
        }
    }
}
