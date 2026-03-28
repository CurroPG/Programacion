public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int digitoIntroducido = Integer.parseInt(System.console().readLine("Introduzca un digito: "));
        int aux = numeroIntroducido;
        aux = aux * 10 + 1;
        int digito = 0;
        int invertido = 0;
        int contador = 1;
        
        do{    
            digito = aux % 10;
            invertido = (invertido * 10) + digito;
            aux /= 10;
        }while(aux != 0);

        System.out.print("Contando de izquierda a derecha, el "+digitoIntroducido+" aparece dentro de "+numeroIntroducido+" en las siguientes posiciones: ");
        
        do{           
            if (invertido % 10 == digitoIntroducido)
                System.out.print(contador + " ");
            invertido /= 10;
            if(invertido != 1)
                contador++;  
        }while(invertido != 1);
    }
}
