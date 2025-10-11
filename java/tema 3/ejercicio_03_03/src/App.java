public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca la cantidad de pesetas que quiere convertir: ");
        int pesetas = Integer.parseInt(System.console().readLine());
        double euros = pesetas / 166.386;
        System.out.printf("%d pesetas son %.2f euros", pesetas, euros);
    }
}
