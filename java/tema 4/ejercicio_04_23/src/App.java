public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido) ");
        String tipoIVA = System.console().readLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc) ");
        String tipoPromo = System.console().readLine();
        double IVA = switch(tipoIVA = tipoIVA.toLowerCase()){
            case "general" -> IVA = baseImponible*0.21;
            case "reducido" -> IVA = baseImponible*0.1;
            case "superreducido" -> IVA = baseImponible*0.04;
            default -> {
                System.out.println("Por favor, introduzca un tipo de IVA correcto.");
                yield 0;
            }        
        };
        double precioConIVA = baseImponible + IVA;
        double promocion = switch(tipoPromo = tipoPromo.toLowerCase()){
            case "nopro" -> promocion = 0;
            case "mitad" -> promocion = precioConIVA / 2;
            case "meno5" -> promocion = precioConIVA - 5;
            case "5porc" -> promocion = precioConIVA * 0.05;
            default ->{
                System.out.println("Por favor, introduzca una promoción válida.");
                yield 0;
            }
        };
        double total = precioConIVA - promocion;

        System.out.printf("""
                %-14s%10.2f
                %-14s%10.2f
                %-14s%10.2f
                %-14s%10.2f
                %-14s%10.2f
                """, "Base imponible", baseImponible, "IVA " + "("+tipoIVA+")", IVA, "Precio con IVA", precioConIVA, "Promo " + "("+tipoPromo+")", -promocion, "TOTAL", total);
    }
}
