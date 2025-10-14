public class App {
    public static void main(String[] args) throws Exception {
        final double PRECIO_BASE = 0.01;
        final double GASTOS_DE_ENVIO = 3.25;

        System.out.print("Introduzca la altura de la bandera: ");
        double altura = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca la anchura de la bandera: ");
        double anchura = Double.parseDouble(System.console().readLine());

        double areaBandera = altura*anchura;
        double precioBandera = areaBandera*PRECIO_BASE;

        System.out.print("¿Quiere escudo boradado? (s/n) ");
        String escudo = (System.console().readLine());

        double precioConEscudo = 0;
        String conSin = "sin";
        
         if (escudo.equalsIgnoreCase("s")){
            precioConEscudo = 2.5;
            conSin = "con";
         }

        double total = precioConEscudo + precioBandera + GASTOS_DE_ENVIO;

        System.out.printf("Bandera de %.0f cm2:       %6.2f%n", areaBandera, precioBandera);
        System.out.printf("%s escudo:               %6.2f%n", conSin, precioConEscudo);
        System.out.printf("Gastos de envío:         %6.2f %n", GASTOS_DE_ENVIO);
        System.out.printf("--------------------------------%n");
        System.out.printf("Total:                   %6.2f %n", total);
    }
}
