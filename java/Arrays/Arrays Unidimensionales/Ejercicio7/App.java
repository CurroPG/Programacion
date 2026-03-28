package Ejercicio7;

public class App {
    public static void main(String[] args) {
        int random = 0;
        int numeros[] = new int[100];
        
        for(int i = 0; i < 100; i++){
            random = (int) (Math.random()*21);
            numeros[i] = random;
            System.out.print(random + "  ");
        }
        int numChosen = Integer.parseInt(System.console().readLine("Introduzca un numero de los que se han mostrado: "));
        int numChange = Integer.parseInt(System.console().readLine("Introduzca el valor por el que quiera sustituirlo: "));
        for(int i = 0; i < 100; i++){
            if(numeros[i] == numChosen)
                System.out.print("*"+numChange+"*  " );
            else
                System.out.print(numeros[i] + "  ");
        }
    }
}
