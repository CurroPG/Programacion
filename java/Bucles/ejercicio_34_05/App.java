public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = Integer.parseInt(System.console().readLine("Por favor, introduzca un número: "));
        int numero2 = Integer.parseInt(System.console().readLine("Introduzca otro número: "));  
        
        int aux1 = numero1;
        int aux2 = numero2;
        int invertido1 = 0;
        int invertido2 = 0;
        int digito1 = 0;
        int digito2 = 0;
        
        do{
            digito1 = aux1 % 10;
            digito2 = aux2 % 10;
            invertido1 = (invertido1 * 10) + digito1;
            invertido2 = (invertido2 * 10) + digito2;
            aux1/=10;
            aux2/=10;
        }while (aux1 != 0 || aux2 != 0);
        
        int numPar = 0;
        int numImpar = 0;
        aux1 = invertido1;
        aux2 = invertido2;
        digito1 = 0;
        digito2 = 0;
        do{
            digito1 = aux1 % 10;
            digito2 = aux2 % 10;
            if(digito1 % 2 == 0){
                numPar = numPar * 10 + digito1;
            }else{
                numImpar = numImpar * 10 + digito1;
            }
            if(digito2 % 2 == 0){
                numPar = numPar * 10 + digito2;
            }else{
                numImpar = numImpar * 10 + digito2;
            }
            
            aux1 /= 10;
            aux2 /= 10;
        }while(aux1 != 0 || aux2 != 0);
        System.out.printf("El número formado por los dígitos pares es %d%n", numPar);
        System.out.printf("El número formado por los dígitos impares es %d", numImpar);

    }
}
