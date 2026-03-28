public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la A (mayor o igual que 3): "));
        int palito = Integer.parseInt(System.console().readLine("Introduzca la fila del palito horizontal (mayor o igual que 2): "));
        int espacios = altura - 1;
        int base = 1;
        int fila = 1;

        while(base <= altura){
            for(int i = 0; i < espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= fila; i++){
                if(base == palito)
                    System.out.print("*");
                    else if(i == 1 || i == fila)
                        System.out.print("*");
                        else
                            System.out.print(" ");
            }
            System.out.println();
            base++;
            fila+=2;
            espacios--;
        }
    
    }
}
