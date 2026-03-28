public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura del árbol (mayor o igual a 4): "));
        int espacios = altura - 3;
        int base = 1;
        int fila = 1;

        System.out.printf("%"+(espacios+1)+"s","*");
        System.out.println();
        while(base <= altura - 2){
            for(int i = 0; i < espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i<=fila; i++){
                if(base == altura - 2)
                    System.out.print("^");
                    else if(i == 1 || i == fila)
                        System.out.print("^");
                        else
                            System.out.print(" ");
            }
            System.out.println();
            base++;
            fila+=2;
            espacios--;
        }
        espacios = altura - 3;
        System.out.printf("%"+(espacios+1)+"s","Y");
    }
}
