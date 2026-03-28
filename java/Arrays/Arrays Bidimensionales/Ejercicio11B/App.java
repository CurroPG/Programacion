package Ejercicio11B;

public class App {
    public static void main(String[] args) {
        int array[][] = new int[9][9];
        int suma = 0;
        int cantidadNumeros = 0;
        int media;
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int aleatorio = (int)(Math.random()*(300-200+1)+200);
                array[i][j] = aleatorio;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Diagonal:");
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(i == j){
                    System.out.print(array[i][j] + " ");
                    if(array[i][j] < minimo)
                        minimo = array[i][j];
                    if(array[i][j] > maximo)
                        maximo = array[i][j];
                    suma += array[i][j];
                    cantidadNumeros++;
                }
            }
        }
        media = suma/cantidadNumeros;
        System.out.println();
        System.out.println("Máximo: " + maximo + "   Mínimo: " + minimo + "   Media: " + media);
    }
}
