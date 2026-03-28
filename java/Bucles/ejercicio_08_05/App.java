public class App {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número y le mostraré su tabla de multiplicaión: "));
        for(int i=0; i<=10; i++){
            int resultado = numero*i;
            System.out.printf("%d x %2d = %4d%n", numero,i,resultado);
        }
    }
}
