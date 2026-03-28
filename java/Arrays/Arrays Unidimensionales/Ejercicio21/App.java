package Ejercicio21;

public class App {
    public static boolean esMultiplo5(int a){
        if(a % 5 == 0)
            return true;
        return false;
    }

    public static int incHastaMultiplo5(int a){
        for(int i = a; i < Integer.MAX_VALUE; i++){
            a++;
            if(a % 5 == 0)
                return a;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numeros[] = new int[20];
        int arrayMultiplos[] = new int[20];

        for(int i = 0; i < 20; i++){
            int random = (int) (Math.random()*401);
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < 20; i++){
            if(esMultiplo5(numeros[i]))
                arrayMultiplos[i] = numeros[i];
            else
                arrayMultiplos[i] = incHastaMultiplo5(numeros[i]);
            System.out.print(arrayMultiplos[i] + " ");
        }
    }
}
