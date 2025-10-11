public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
        double euros = Integer.parseInt(System.console().readLine());
        double pesetas = euros * 166.386;
        System.out.printf("%.2f euros son %d pesetas", euros, (int)pesetas);
    }
}
