public class App {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un numero mayor que 1: "));
        int suma = 0;
        int contador = 0;
        
        for(int i= 1; i<=numero; i++){     
            if(i % 3 == 0){
                System.out.print(i + " ");
                suma += i;
                contador++;
            }        
        }
        System.out.println();
        System.out.printf("Desde 1 hasta %d hay %d múltiplos de 3 y suman %d", numero, contador, suma);
    }
}
