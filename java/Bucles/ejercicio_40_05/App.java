public class App {
    public static void main(String[] args) throws Exception {
        int altura = 0;
        do{
            altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura del rombo: "));
            if(altura<3 || altura % 2 == 0)
                System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3.");
        }while(altura<3 || altura % 2 == 0);
        
        int espacios = altura / 2 + 1;
        int base = 0;
        int fila = 1;

        while(base < altura/2){
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
            fila+=2;
            espacios--;
            base++;
        }
        fila = altura;
        espacios = 1;
        while(base < altura){
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
            fila-=2;
            espacios++;
            base++;
        }
    }
}
