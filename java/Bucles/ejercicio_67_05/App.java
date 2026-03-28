public class App {
    public static void main(String[] args) throws Exception {
        int escalones = Integer.parseInt(System.console().readLine("Introduzca el número de escalones: "));
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de cada escalon: "));
        int base = 0;
        int fila = 4;

        while(base < escalones){
            for(int i = 0; i < altura; i++){
                for(int j = 0; j < fila; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            base++;
            fila+=4;
        }
    }
}
