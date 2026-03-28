public class App {
    public static void main(String[] args) throws Exception {
        long numero = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
        long aux = numero;
        int digito = 0;
        int invertido = 0;
        int suma = 0;
        do{
            digito = (int)aux % 10;
            invertido = (invertido * 10) + digito;
            aux/=10;
        }while(aux!=0);

        System.out.print("Dígitos pares: ");

        do{
            aux = invertido % 10;
            if(aux%2 == 0){
                System.out.print(aux + " ");
                suma+=aux;
            }
            invertido/=10;
        }while(invertido != 0);
        System.out.println();
        System.out.printf("Suma de los dígitos pares: %d", suma);
    }
}
