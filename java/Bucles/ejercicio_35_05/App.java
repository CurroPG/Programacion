public class App {
    public static void main(String[] args) throws Exception {
        int altura = 0;

        do{
            altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la X (<=3): "));
            if(altura < 3 || altura % 2 == 0)
                System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
        }while(altura < 3 || altura % 2 == 0);
        int contador = 0;
        int fila = altura;
        int espacios = 0;

        while(contador<altura/2){
            for(int i = 1; i<= espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i<=fila; i++){
                if(i == 1 || i == fila)
                    System.out.print("*");
                    else
                        System.out.print(" ");
            }
            System.out.println();
            espacios++; 
            fila -= 2;
            contador++;
        }
        fila = 1;
        espacios = altura / 2 + 1;
        while(contador<altura){
            for(int i = 1; i < espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= fila; i++){
                if(i == 1 || i == fila)
                    System.out.print("*");
                    else
                        System.out.print(" ");
            }
            System.out.println();
            contador++;
            fila+=2;
            espacios--;
        }
        
    }
}
