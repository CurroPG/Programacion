public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la pirámide maya: "));
        int espacios = altura - 1;
        int fila = 6;
        int base = 1;

        while(base <= altura){
            for(int i = 0; i < espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= fila; i++){
                if(base % 2 != 0)
                    System.out.print("*");
                    else if(i > (fila/2 - 2) && i <= (fila/2+2) && base % 2 == 0)
                        System.out.print(" ");
                        else
                            System.out.print("*");
            }
            System.out.println();
            base++;
            fila+=2;
            espacios--;
        }
    }
}
