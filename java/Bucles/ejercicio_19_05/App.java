public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la pirámide: "));
        String relleno = System.console().readLine("Introduzca el carácter de relleno: ");        
        int base = 1;
        int longitudLinea = 1;
        int espacios = altura-1;
        
        while (base <= altura) {        
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= longitudLinea; i++) {
                System.out.print(relleno);
            }
            System.out.println();
            base++;
            espacios--;
            longitudLinea += 2;
        }
    }
}
