package Ejercicio13B;

public class App {
    public static void main(String[] args) {
        String pais[] = { "España", "Rusia", "Japón", "Australia" };
        int estaturas[][] = new int[4][10];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                int aleatorio = (int) (Math.random() * (210 - 140 + 1) + 140);
                estaturas[i][j] = aleatorio;
            }
        }

        for (int i = 0; i < 4; i++) {
            int minimo = Integer.MAX_VALUE;
            int maximo = 0;
            int suma = 0;
            int media = 0;
            System.out.print(pais[i] + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(estaturas[i][j] + " ");
                suma += estaturas[i][j];
                if (estaturas[i][j] < minimo)
                    minimo = estaturas[i][j];
                if (estaturas[i][j] > maximo)
                    maximo = estaturas[i][j];
            }
            media = suma / 10;
            System.out.print("| " + media + " " + minimo + " " + maximo);
            System.out.println();
        }
    }
}
