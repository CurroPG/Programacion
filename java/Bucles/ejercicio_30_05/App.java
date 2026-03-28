public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura: "));
        int fila = (2 * altura) - 1;
        int planta = 1;
        int espacios = 0;
        while(planta <= altura){
            for(int i = 1; i <= espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= fila; i++){
                System.out.print("*");
            }
            System.out.println();
            fila-=2;
            espacios++;
            planta++;
        }
        espacios = altura - 1;
        fila = 1;
        planta = 1;
        while(planta <= altura){
            if(planta>=2){
                for(int i = 1; i<= espacios; i++){
                    System.out.print(" ");
                }
                for(int i = 1; i<= fila; i++){
                    System.out.print("*");
                }
            System.out.println();
            }
            espacios--;
            planta++;
            fila+=2;
        }
    }
}
