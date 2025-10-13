public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero < 10 && numero > -10)
            System.out.println("El número tiene 1 dígito");
            else if (numero < 100 && numero > -100)
                System.out.println("El número introducido tiene 2 dígitos");
                else if (numero < 1000 && numero > -1000)
                    System.out.println("El número introducido tiene 3 dígitos");
                    else if (numero < 10000 && numero > -10000)
                        System.out.println("El número introducido tiene 4 dígitos");
                        else if (numero < 100000 && numero > -100000)
                            System.out.println("El número introducido tiene 5 dígitos");
                            else 
                            System.out.println("Por favor, introduzca un número válido.");
    }
}
