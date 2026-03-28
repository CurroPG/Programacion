public class App {
    public static void main(String[] args) throws Exception {
        int numeroGrande = Integer.parseInt(System.console().readLine("Introduzca un número entero positivo (relativamente grande): "));
        int numeroPeque = Integer.parseInt(System.console().readLine("Introduzca otro número (relativamente pequeño): "));
        System.out.printf("Los números enteros positivos menores que %d que no son divisibles entre %d son los siguientes:%n", numeroGrande, numeroPeque);
        for(int numero = 1; numero<numeroGrande; numero++){
            if(!  (numero % numeroPeque == 0))
                System.out.print(numero+ " ");
        }
    }
}
