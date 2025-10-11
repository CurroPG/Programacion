public class App {
    public static void main(String[] args) throws Exception {
        int pesetas =  10000;
        double euros = pesetas / 166.386;

        System.out.printf("%d pesetas son %.2f euros", pesetas, euros);
    }
}
