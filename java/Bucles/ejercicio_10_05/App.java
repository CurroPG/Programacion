public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar introduzca un numero negativo.");
        System.out.println("Vaya introduciendo números:");
        double numeroIntroducido;  
        double suma = 0;
        double numero = 0;
        do{
            numeroIntroducido = Double.parseDouble(System.console().readLine());
            if(numeroIntroducido >= 0){
                numero ++;
                suma += numeroIntroducido;
            }
        }while(numeroIntroducido >= 0);

        System.out.printf("La media de los numeros positivos introducidos es: %.2f", suma/numero);
    }
}
