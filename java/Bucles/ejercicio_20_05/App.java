public class App {
    public static void main(String[] args) throws Exception {
        int alturaIntroducida = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura de la pirámide: "));
        String relleno = System.console().readLine("Introduzca el carácter de relleno: ");       
        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida - 1;
        int huecos = 0;
        
        while (altura < alturaIntroducida) {
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            System.out.print(relleno);
            for (i = 1; i < huecos; i++) {
                System.out.print(" ");
            }            
            if (altura>1) {
                System.out.print(relleno);
            }            
            System.out.println();
            altura++;
            espacios--;
            huecos += 2;
        } 
        
        for (i = 1; i < altura*2; i++) {
        System.out.print(relleno);
        }
    }
}
