public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = 0;
        int suma = 0;
        do{
        numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número entero positivo: "));
        if (numeroIntroducido < 0)
            System.out.println("El número introducido no es correcto.\nDebe introducir un número postivo.");                            
        }while(numeroIntroducido < 0);

        for (int i = numeroIntroducido; i < numeroIntroducido + 100; i++){
            suma += i;
        }    
        System.out.println("La suma de los 100 números siguientes a "+numeroIntroducido+" es "+suma);
    }
}
