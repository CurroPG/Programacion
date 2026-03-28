package Ejercicio11;

public class App {
    public static boolean esPrimo(int numero){
        for(int i = 2; i < numero; i++){
            if(numero % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int arrayOrdenada[] = new int[10];
        int indice = 0;

        for(int i = 0; i < 10; i++){
            int random = (int) (Math.random()*101);
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        
        for(int i = 0; i < 10; i++){
            if(esPrimo(numeros[i]))
                arrayOrdenada[indice++] = numeros[i];
        }

        for(int i = 0; i < 10; i++){
            if(!esPrimo(numeros[i]))
                arrayOrdenada[indice++] = numeros[i];
        }

        for(int i = 0; i < 10; i++){
            System.out.print(arrayOrdenada[i] + " ");
        }
    }
}
