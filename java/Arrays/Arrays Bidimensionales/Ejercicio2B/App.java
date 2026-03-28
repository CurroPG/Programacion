package Ejercicio2B;

public class App {
    public static void main(String[] args) {
        int total = 0;
        int array[][] = new int[4][5];
        int sumaFila = 0;
        int sumaFilaTotal = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                int aleatorio = (int)(Math.random()*101);
                array[i][j] = aleatorio;
                sumaFila += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println("| " + sumaFila);
            sumaFilaTotal += sumaFila;
            sumaFila = 0;
        }

        int sumaColumna = 0;
        int sumaColumnaTotal = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                sumaColumna += array[j][i];
            }
            System.out.print(sumaColumna + " ");
            sumaColumnaTotal += sumaColumna;
            sumaColumna = 0;
        }
        System.out.println();
        total = sumaColumnaTotal + sumaFilaTotal;
        System.out.println("TOTAL = " + total);
    }
}
