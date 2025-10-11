public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rojo Polo Paella Inc.");
        System.out.println();
        System.out.println("Carrertera Muelle 38");
        System.out.println("37531 Ávila, Ávila");
        System.out.println();
        System.out.println();
        System.out.printf("%-30s%-30s%-30s%30s%n", "FACTURAR A", "ENVIAR A", "Nº DE FACTURA", "ES-001");
        System.out.printf("%-30s%-30s%-30s%30s%n", "Leda Villareal", "Leda Villareal", "Fecha", "29.01.2019");
        System.out.printf("%-30s%-30s%-30s%30s%n", "Virgen Blanca 63", "Cercas Bajas 68", "Nº DE PEDIDO", "ES-001");
        System.out.printf("%-30s%-30s%-30s%30s%n", "08759 Burgos, Burgos", "47300 Cádiz, Cádiz", "FECHA", "29.01.2019");
        System.out.printf("%-30s%-30s%-30s%30s%n", "", "", "VENCIMIENTO", "");
        System.out.println();
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("%-30s%90s%n", "Total Factura", "199.65E");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println();
        System.out.printf("%-10s%-52s%-28s%30s%n", "Cant.", "DESCRIPCIÓN", "PRECIO", "IMPORTE");
        System.out.printf("%-10s%-50s%-28s%30s%n", "", "", "UNITARIO", "");
        System.out.printf("%-10s%-52s%-28s%30s%n", "1", "Talla pequeña traje de luces en rojo", "100.00", "100.00");
        System.out.printf("%-10s%-53s%-27s%30s%n", "2", "Mui grande churrolito", "25.00", "50.00");
        System.out.printf("%-10s%-54s%-26s%30s%n", "3", "Equipaje de Fútbol", "5.00", "15.00");
        System.out.println();
        System.out.printf("%68s%52s%n", "Subtotal", "165.00");
        System.out.printf("%68s%52s%n", "IVA 21.0%", "34.65");
    }
}
