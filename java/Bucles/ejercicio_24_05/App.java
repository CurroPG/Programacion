public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la altura: "));
        int longitudFila = 1;
        int espacios = altura-1;

        while(longitudFila <= altura){
            for(int i = 0; i<espacios; i++){
                System.out.print(" ");                
            }
            for(int i = 1; i<longitudFila; i++){
                System.out.print(i);
            }
            for (int i = longitudFila; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            longitudFila ++;
            espacios--;
        }     
    }
}
