public class App {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int aux = numero;
        int invertido = 0;
        int digito = 0;
        do{
            digito = aux % 10;
            invertido = (invertido * 10) + digito;
            aux /= 10;
        }while(aux != 0);
        System.out.printf("Si le damos la vuelta al %d tenemos el %d.", numero, invertido);
    }
}
