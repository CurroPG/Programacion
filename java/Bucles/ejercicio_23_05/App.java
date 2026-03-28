public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, vaya introduciendo números. El programa terminará cuando la suma de los números sea mayor que 10000.");
        int numero = 0;
        double suma = 0;
        double contador = 0;        
        do{
            numero = Integer.parseInt(System.console().readLine());
            suma += numero;
            contador++;
        }while(suma<=10000);
        double media = suma/contador;
        System.out.printf("""
                Ha introducido un total de %.0f números.
                La suma total es %.0f.
                La media es %.2f.
                """, contador, suma, media);
    }
}
