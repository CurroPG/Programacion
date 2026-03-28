public class App {
    public static void main(String[] args) throws Exception {
        long numero = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero positivo: "));
        int posicion = Integer.parseInt(System.console().readLine("Por favor, introduzca la posición a partir de la cual quiere partir el número: "));
        int newDigit = Integer.parseInt(System.console().readLine("Por favor, introduzca el nuevo numero: "));
        long aux = numero;
        aux = numero * 10 + 1;
        int digito = 0;
        int contador = 0;
        long invertido = 0;
        int newNumero = 0;

        do{
            digito = (int)aux % 10;
            invertido = invertido * 10 + digito;
            aux/=10;
        }while(aux != 0);
        digito = 0;
        aux = invertido;
        do{
            digito = (int)aux % 10;
            if(aux != 1){
                contador++;
                if (contador == posicion)
                    newNumero = newNumero * 10 + newDigit;
                newNumero = newNumero * 10 + digito;
                aux/=10;
            }
        }while(aux != 1);
        System.out.printf("El número resultante es %d", newNumero);
    }
}
