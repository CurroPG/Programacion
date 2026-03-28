public class App {
    public static void main(String[] args) throws Exception {
        int numero = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int aux = numero;
        aux = aux * 10 + 1;
        int digito = 0;
        int invertido = 0;
        int ultimoDigito = numero % 10;

        do{
            digito = aux % 10;
            invertido = invertido * 10 + digito;
            aux/=10;
        }while(aux != 0);

        digito = 0;
        aux = invertido;
        invertido = 0;
        invertido = invertido * 10 + ultimoDigito;

        do{
            if(aux != 1){
                digito = aux % 10;
                invertido = invertido * 10 + digito;
            }
            aux/=10;
        }while(aux != 1);
        invertido = invertido / 10;
        System.out.printf("El número resultado es %d", invertido);
    }
}
