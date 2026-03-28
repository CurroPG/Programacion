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
    public static final String BG_RED     = "\u001B[41m";
    public static final String BG_GREEN   = "\u001B[42m";
    public static final String BG_YELLOW  = "\u001B[43m";
    public static final String BG_CYAN    = "\u001B[46m";

    public static void main(String[] args) throws Exception {
        int random;

        while(true){
            random = (int)(Math.random()*160);
            if(random < 40)
                System.out.print(BG_CYAN+"  "+random+"db"+RESET);
                else if(random < 80)
                    System.out.print(BG_CYAN+"      "+BG_GREEN+"    "+random+"db"+RESET);
                    else if(random < 120)
                        System.out.print(BG_CYAN+"      "+BG_GREEN+"        "+BG_YELLOW+"         "+random+"db"+RESET);
                        else if(random < 160)
                            System.out.print(BG_CYAN+"      "+BG_GREEN+"        "+BG_YELLOW+"             "+BG_RED+"             "+random+"db"+RESET);
            Thread.sleep(100);
            limpiarPantalla();
        }
        
    }
}
