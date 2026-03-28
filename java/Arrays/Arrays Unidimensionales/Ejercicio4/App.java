package Ejercicio4;

public class App {
    public static void main(String[] args) {
        int random = 0; 
        int numero[] = new int[12];
        int cuadrado[] = new int[12];
        int cubo[] = new int[12];

        System.out.println("   n  |   n2  |    n3  ");
        System.out.println("-----------------------");

        for(int i = 0; i < 12; i++){
            random = (int) (Math.random()*101);
            numero[i] = random;
            cuadrado[i] = (int) Math.pow(random, 2);
            cubo[i] = (int) Math.pow(random, 3);
            System.out.printf("%4d  |%6d |%8d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
