public class App {
    public static void main(String[] args) throws Exception {
        int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
        int exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente máximo: "));
        int resultado = 1;
        int i=0;
        if(exponente == 0)
            System.out.println("Por favor, introduzca un exponente máximo.");
        if(exponente > 0)
            for(i=1; i<=exponente; i++){
                resultado*=base;
                System.out.printf("%d^%d = %d%n", base, i, resultado);
            }                   
    }
}
