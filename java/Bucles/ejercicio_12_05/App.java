public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Por favor, introduzca n: "));
        int numero = 0;
        int numero1 = 0;
        int numero2 = 1;
        if (numeroIntroducido == 1){
            System.out.println(numero1);
            if (numeroIntroducido == 2){
                System.out.println(numero1 + " " + numero2);
            }
        }else{
            System.out.print(numero1 + " " + numero2);
            for (int i = 2; i<numeroIntroducido; i++){
            numero = numero1 + numero2;
            numero1 = numero2;
            numero2 = numero;
            System.out.print(" " + numero); 
            }
        }
    }
}
