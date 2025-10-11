public class App {
 public static final String RESET = "\033[0m";  // Text Reset
 
 // Regular Colors
 public static final String BLACK = "\033[0;30m";   // BLACK
 public static final String RED = "\033[0;31m";     // RED
 public static final String GREEN = "\033[0;32m";   // GREEN
 public static final String YELLOW = "\033[0;33m";  // YELLOW
 public static final String BLUE = "\033[0;34m";    // BLUE
 public static final String PURPLE = "\033[0;35m";  // PURPLE
 public static final String CYAN = "\033[0;36m";    // CYAN
 public static final String WHITE = "\033[0;37m";   // WHITE

    public static void main(String[] args) throws Exception {
        String si = "SI";
        String lm = "LM";
        String sos = "SOS";
        String bdato = "BDATO";
        String prog = "PROG";
        String ipe1 = "IPE1";
        String dig = "DIG";
        String ed = "ED";
        System.out.printf("┌───────────────────────────────────────────────────────────────────────────────────────────┐%n");
        System.out.printf("|"+RESET+"%-10s"+"|"+"%-10s"+"|"+"%-10s"+"|"+"%-10s"+"|"+"%-10s%n", "LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES"+RESET);
        System.out.printf(RESET+"|"+RED+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+RED+"%-20s"+RESET+"|"+YELLOW+"%-20s"+RESET+"|"+BLUE+"%-20s%n", si, prog, si, ipe1, bdato);
        System.out.printf(RESET+"|"+RED+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+RED+"%-20s"+RESET+"|"+YELLOW+"%-20s"+RESET+"|"+BLUE+"%-20s%n", si, prog, si, ipe1, bdato);
        System.out.printf(RESET+"|"+PURPLE+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+YELLOW+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+RED+"%-20s%n", lm, prog, ipe1, prog, si);
        System.out.printf(RESET+"|"+PURPLE+"%-20s"+RESET+"|"+BLUE+"%-20s"+RESET+"|"+WHITE+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+CYAN+"%-20s%n", lm, bdato, dig, prog, ed);
        System.out.printf(RESET+"|"+BLUE+"%-20s"+RESET+"|"+BLUE+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+CYAN+"%-20s%n", bdato, bdato, prog, prog, ed);
        System.out.printf(RESET+"|"+BLUE+"%-20s"+RESET+"|"+BLACK+"%-20s"+RESET+"|"+GREEN+"%-20s"+RESET+"|"+PURPLE+"%-20s"+RESET+"|"+CYAN+"%-20s%n"+RESET, bdato, sos, prog, lm, ed);
    }
}
