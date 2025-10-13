public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número entero: ");
        int numero = Integer.parseInt(System.console().readLine());
        int ultimaCifra = (numero % 10);
        System.out.printf("La última cifra del número %d es %d", numero, ultimaCifra);
    }
}
