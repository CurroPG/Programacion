public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la figura: "));
        int espacios = 0;
        int base = 0;
        int fila = altura;
        
        while(base < altura){
            for(int i = 0; i < espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i<=fila; i++){
                if(base == 0)
                    System.out.print("*");
                    else if(i == 1 || i == fila)
                            System.out.print("*");
                            else
                                System.out.print(" ");
            }
            System.out.println();
            base++;
            espacios++;
            fila--;     
        }
    }
}
