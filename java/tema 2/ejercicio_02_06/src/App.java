public class App {
    public static void main(String[] args) throws Exception {
        double baseImp = 22.75;
        double iva = 4.78;
        double total = baseImp + iva;

        System.out.printf("%-10s %10.2f%n", "Base imponible", baseImp);
        System.out.printf("%-10s %14.2f%n", "IVA", iva);
        System.out.println("-------------------------");
        System.out.printf("%-10s %14.2f", "Total", total);
    }
}
