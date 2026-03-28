package Ejercicio9B;

public class App {
    public static int[] desplazarDerecha(int array[]){
        int resultado[] = new int[array.length];
        int ultimoNumero = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                ultimoNumero = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(i == 0){
                resultado[i] = ultimoNumero;
            }else
                resultado[i] = array[i - 1];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int arrayO[][] = new int[8][8];
        int arrayR[][] = new int[8][8];
        int indice1 = 0;
        int indice2 = 0;
        int indice3 = 0;
        int indice4 = 0;
        int aux1[] = new int[28];
        int aux2[] = new int[20];
        int aux3[] = new int[12];
        int aux4[] = new int[4];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int aleatorio = (int) (Math.random() * 100);
                arrayO[i][j] = aleatorio;
                if ((i == 0 || i == 7) || (j == 0 || j == 7)) {
                    aux1[indice1] = arrayO[i][j];
                    indice1++;
                } else if ((i == 1 || i == 6) || (j == 1 || j == 6)) {
                    aux2[indice2] = arrayO[i][j];
                    indice2++;
                } else if ((i == 2 || i == 5) || (j == 2 || j == 5)) {
                    aux3[indice3] = arrayO[i][j];
                    indice3++;
                } else {
                    aux4[indice4] = arrayO[i][j];
                    indice4++;
                }
                System.out.printf("%4d", arrayO[i][j]);
            }
            System.out.println();
        }
        aux1 = desplazarDerecha(aux1);
        aux2 = desplazarDerecha(aux2);
        aux3 = desplazarDerecha(aux3);
        aux4 = desplazarDerecha(aux4);
        indice1 = 0;
        indice2 = 0;
        indice3 = 0;
        indice4 = 0;
        System.out.println("================");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i == 0 || i == 7) || (j == 0 || j == 7)) {
                    arrayR[i][j] = aux1[indice1];
                    indice1++;
                } else if ((i == 1 || i == 6) || (j == 1 || j == 6)) {
                    arrayR[i][j] = aux2[indice2];
                    indice2++;
                } else if ((i == 2 || i == 5) || (j == 2 || j == 5)) {
                    arrayR[i][j] = aux3[indice3];
                    indice3++;
                } else {
                    arrayR[i][j] = aux4[indice4];
                    indice4++;
                }
                System.out.printf("%4d", arrayR[i][j]);
            }
            System.out.println();
        }
    }
}
