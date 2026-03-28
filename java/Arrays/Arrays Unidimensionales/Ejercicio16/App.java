package Ejercicio16;

public class App {
    public static boolean esMultiplo5(int a){
        if(a % 5 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int numeros[] = new int[20];

        for(int i = 0; i < 20; i++){
            int random = (int) (Math.random()*401);
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < 20; i++){
            if(esMultiplo5(numeros[i]))
                System.out.print("["+numeros[i]+"] ");
            System.out.print(numeros[i] + " ");
        }
    }
}
