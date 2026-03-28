package Ejercicio9;

public class App {
    public static void main(String[] args) {
        int numeros[] = new int[10];

        for(int i = 0; i < 10; i++){
            int random = (int) (Math.random()*101);
            numeros[i] = random;
        }

        for(int i = 0; i < 10; i++){
            if(numeros[i] % 2 == 0)
                System.out.println(numeros[i] + " par");
            else
                System.out.println(numeros[i] + " impar");
        }    
    }
}
