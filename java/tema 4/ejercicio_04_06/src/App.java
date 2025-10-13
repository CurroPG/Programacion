public class App {
    public static void main(String[] args) throws Exception {
        final double gravedad = 9.81;
        System.out.println("Cálculo del tiempo de caída de un objeto.");
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        double altura = Double.parseDouble(System.console().readLine());
        double tiempoCaida = Math.sqrt((2*altura)/gravedad);
        if (altura < 0)
            System.out.println("La altura no puede ser negativa.");
            else
            System.out.printf("El objeto tarda %.2f segundos en caer.", tiempoCaida);
    }
}
