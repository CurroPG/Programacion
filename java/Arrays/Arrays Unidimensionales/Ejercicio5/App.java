package Ejercicio5;

public class App {
    public static void main(String[] args) {
        int numeros = 0;
        int numeroMax = 0;
        int numeroMin = Integer.MAX_VALUE;
        int numArray[] = new int[8];

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO: ");

        for (int i = 0; i < 8; i++) {
            numeros = Integer.parseInt(System.console().readLine());
            if (numeros > numeroMax)
                numeroMax = numeros;
            if (numeros < numeroMin)
                numeroMin = numeros;
            numArray[i] = numeros;
        }
        System.out.println("===============");
        for (int i = 0; i < 8; i++) {
            if (numArray[i] == numeroMax)
                System.out.println(numeroMax + " máximo");
            else if (numArray[i] == numeroMin)
                System.out.println(numeroMin + " mínimo");
            else
                System.out.println(numArray[i]);
        }
    }
}
