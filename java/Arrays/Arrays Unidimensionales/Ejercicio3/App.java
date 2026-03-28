package Ejercicio3;

public class App {
    public static void main(String[] args) {
        int numeros [] = new int[10];
        int numerosIntroducidos = 0;
        
        for(int i = 0; i < 10; i++){
            numerosIntroducidos = Integer.parseInt(System.console().readLine());
            numeros[i] = numerosIntroducidos;
        }
        System.out.println("---------");
        for(int i = 9; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
