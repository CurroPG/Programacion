public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, vaya introduciendo números enteros.");
        System.out.println("Puede terminar mediante la introducción de un número negativo.");
        int numeros = 0;
        int numerosContador = 0;
        int media = 0;
        int impar = 0;
        int maximo = 0;
        do{
            numeros = Integer.parseInt(System.console().readLine());
            if (numeros > 0)
                numerosContador++;
            if (numeros % 2 != 0 && numeros > 0){
                media += numeros;
                impar++;
            }
            if (numeros > maximo && numeros % 2 == 0)
            maximo = numeros;
        }while(numeros > 0);
        System.out.printf("Ha introducido %d números positivos.%nLa media de los impares es %.2f.%nEl máximo de los pares es %d.", numerosContador, (double)(media/impar), maximo);
    }
}
