public class App {
    public static void limpiarPantalla() {
        try {
            String sistemaOperativo = System.getProperty("os.name");

            if (sistemaOperativo.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }

        } catch (Exception e) {
            // Fallback: imprimir líneas en blanco
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BROWN = "\u001B[38;5;94m";
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura: "));
        int espacios = altura - 3;
        int fila = 1;
        int base = 1;
        String color;

        while(true){
            while(base <= altura){
                if(base == 1){
                    for(int i = 0; i <= espacios; i++){
                        System.out.print(" ");
                    }
                    System.out.println(YELLOW + "*" + RESET);
                }else if(base == altura){
                    for(int i = 0; i < altura - 3; i++){
                            System.out.print(" ");
                        }
                    System.out.println(BROWN + "Y" + RESET);
                }else{
                    for(int i = 0; i <= espacios; i++){
                        System.out.print(" ");
                    }
                    for(int i = 1; i <= fila; i++){
                        int random = (int)(Math.random()*5+1);
                        switch (random) {
                            case 1:
                                color = GREEN;
                                break;
                            case 2:
                                color = RED;
                                break;
                            case 3:
                                color = MAGENTA;
                                break;
                            case 4:
                                color = CYAN;
                                break;
                            default:
                                color = GREEN;
                                break;
                        }
                        System.out.print(color+"*"+RESET);
                    }
                    System.out.println();
                }
                base++;      
                fila+=2;
                espacios--;
            }
            base = 1;
            fila = 1;
            espacios = altura - 3;
            Thread.sleep(100);
            limpiarPantalla();
        } 
    }
}
