public class App {
     // Reset
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

     // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    public static void main(String[] args) throws Exception {
        System.out.println(CYAN_BACKGROUND+"                                                   "+RESET);
        System.out.println(CYAN_BACKGROUND+"                                        "+RESET+WHITE_BACKGROUND+"███"+RESET+CYAN_BACKGROUND+"        "+RESET);
        System.out.println(CYAN_BACKGROUND+"             "+RESET+GREEN_BACKGROUND+"APRENDE JAVA"+CYAN_BACKGROUND+"          "+RESET+WHITE_BACKGROUND+"███"+RESET+CYAN_BACKGROUND+"             "+RESET);
        System.out.println(CYAN_BACKGROUND+"            "+RESET+GREEN_BACKGROUND+"CON EJERCICIOS"+CYAN_BACKGROUND+"              "+RESET+WHITE_BACKGROUND+"███"+RESET+CYAN_BACKGROUND+"        "+RESET);
        System.out.println(CYAN_BACKGROUND+"                                                   "+RESET);
        System.out.println(CYAN_BACKGROUND+"            "+RESET+GREEN_BACKGROUND+"CURRO PORTILLO"+CYAN_BACKGROUND+"        "+RESET+BLACK+"██████████████████"+RESET+CYAN_BACKGROUND+" "+RESET);

    }
}
