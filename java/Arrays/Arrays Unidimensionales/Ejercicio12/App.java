package Ejercicio12;

public class App {
    public static void main(String[] args) {
        int lastNumber = 0;
        int aux = 0;
        int numeros[] = new int[10];
        int arrayDesplazada[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int numerosIntroducido = Integer.parseInt(System.console().readLine());
            if (i == 9)
                lastNumber = numerosIntroducido;
            numeros[i] = numerosIntroducido;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        int posiInicial = Integer.parseInt(System.console().readLine("Introduce la posicion inicial: "));
        int posiFinal = Integer.parseInt(System.console().readLine("Introduce la posicion final: "));

        for (int i = 0; i < 10; i++) {
            if(i == posiInicial)
                aux = numeros[i];
            if (i == 0)
                arrayDesplazada[i] = lastNumber;
            else if (i < posiFinal && i > posiInicial)
                arrayDesplazada[i] = numeros[i];
            else if (i == posiFinal)
                arrayDesplazada[i] = aux;
            else
                arrayDesplazada[i] = numeros[i - 1];
            System.out.print(arrayDesplazada[i] + " ");
        }
    }
}
