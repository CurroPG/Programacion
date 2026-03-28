public class App {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero: "));
        int factorial = 1;
        for(int i = 1; i<=numero; i++){
            factorial *= i;
        }
        System.out.printf("%d! = %d", numero, factorial);
    }
}
