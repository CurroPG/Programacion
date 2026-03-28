public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa cuenta los dígitos de un número.");
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int aux = numero;
        int digito = 0;
        do{
            aux/=10;
            digito++;
        }while(aux!=0);

        System.out.printf("%d tiene %d dígito/s.", numero, digito);
    }
}
