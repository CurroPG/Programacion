package Ejercicio10;

public class App {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        int arrayOrden[] = new int[20];
        int indice = 0;

        for(int i = 0; i < 20; i++){
            int random = (int) (Math.random()*101);
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < 20; i++){
            if(numeros[i] % 2 == 0)
                arrayOrden[indice++] = numeros[i];
        }
        for(int i = 0; i < 20; i++){
            if(numeros[i] % 2 != 0)
                arrayOrden[indice++] = numeros[i];
        }
        for(int i = 0; i < 20; i++){
            System.out.print(arrayOrden[i] + " ");
        }
    }
}
