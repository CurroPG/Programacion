public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, vaya introduciendo números enteros positivos. El programa terminará cuando introduzca un numero primo.");
        int numero = 0;
        boolean esPrimo;
        int numerosNoPrimos = 0;
        int numeroMayor = 0;
        double suma = 0;
        int numeroMenor = Integer.MAX_VALUE;
        do{
            esPrimo = true;
            numero = Integer.parseInt(System.console().readLine());
            for(int i = 2; i < numero; i++){
                if(numero % i == 0)
                    esPrimo = false;
            }
            if(!esPrimo){
                numerosNoPrimos++;
                suma+=numero;
                if(numero>numeroMayor)
                    numeroMayor = numero;
                if(numero<numeroMenor)
                    numeroMenor = numero;
            }
        }while(!esPrimo);
        double media = suma / numerosNoPrimos;
        System.out.printf("Ha introducido %d números no primos.%n", numerosNoPrimos);
        System.out.printf("Máximo: %d%n", numeroMayor);
        System.out.printf("Mínimo: %d%n", numeroMenor);
        System.out.printf("Media: %.2f%n",media);
    }
}
