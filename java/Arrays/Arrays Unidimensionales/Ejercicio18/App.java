package Ejercicio18;

public class App {
    public static int[] ordenar(int[] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int numeros[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 201);
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        numeros = ordenar(numeros);
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
    }
}
