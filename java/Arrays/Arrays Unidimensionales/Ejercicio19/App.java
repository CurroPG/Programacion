package Ejercicio19;

public class App {
    public static void main(String[] args) {
        int indice = 0;
        int numeros[] = new int[12];
        int numerosOrdenados[] = new int[12];

        for (int i = 0; i < 12; i++) {
            int random = (int) (Math.random() * 201);
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        int numeroIntroducido = Integer
                .parseInt(System.console().readLine("Introduzca el numero que quiera insertar: "));
        int posicion = Integer.parseInt(System.console().readLine("Introduzca la posicion donde lo quiera insertar: "));

        for (int i = 0; i < 12; i++) {
            if (i < posicion)
                numerosOrdenados[indice++] = numeros[i];
            else if (i == posicion)
                numerosOrdenados[indice++] = numeroIntroducido;
            else if (i > posicion)
                numerosOrdenados[indice++] = numeros[i - 1];
        }

        for(int i = 0; i < 12; i++){
            System.out.print(numerosOrdenados[i] + " ");
        }
    }
}
