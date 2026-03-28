package Ejercicio6;

public class App {
    public static void main(String[] args) {
        int random = 0;
        int lastNumber = 0;
        int numeros[] = new int[12];

        for(int i = 0; i < 12; i++){
            random = (int) (Math.random()*101);
            if(i == 11)
                lastNumber = random;
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 12; i++){
            if(i == 0)
                System.out.print(lastNumber + " ");
            else 
                System.out.print(numeros[i - 1] + " ");
        } 
    }
}
