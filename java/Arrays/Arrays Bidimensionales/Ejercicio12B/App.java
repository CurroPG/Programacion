package Ejercicio12B;

public class App {
    public static void main(String[] args) {
        int array[][] = new int[9][9];
        int diagonal = 8;
        int suma = 0;
        int cantidadNumeros = 0;
        double media;
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int aleatorio = (int)(Math.random()*(900-500+1)+500);
                array[i][j] = aleatorio;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Diagonal:");
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(j == diagonal){
                    System.out.print(array[i][j] + " ");
                    diagonal--;
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
