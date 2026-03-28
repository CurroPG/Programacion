public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número entero y te diré si es primo o no: "));
        boolean esPrimo = true;       
        for(int i = 2; i<numeroIntroducido; i++){                       
            if ((numeroIntroducido % i) == 0)
                esPrimo = false;
        }
        if (esPrimo)
            System.out.println("El numero introducido es primo.");
            else
                System.out.println("El numero introducido no es primo.");
    }
}
