
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Venta de entradas CineTuring.");

        System.out.print("Número de entradas: ");
        int numEntradas = Integer.parseInt(System.console().readLine());

        System.out.print("Día de la semana: ");
        String diaSemana = System.console().readLine();

        System.out.print("¿Tiene tarjeta CineTuring? (s/n) ");
        String tarjeta = System.console().readLine();

        double precioBase;  
        double total;
        String indPar = "individual";

        switch(diaSemana.toLowerCase()){
            case "lunes", "martes", "viernes", "sabado", "sábado", "domingo" -> {  
                precioBase = 8.00;
                total = precioBase*numEntradas;
                break;
            }
            case "miercoles", "miércoles" -> { 
                precioBase = 5.00;
                total = precioBase*numEntradas;
                break;
            }
            case "jueves" -> { 
                if (numEntradas % 2 == 0){
                    precioBase = 11;
                    total = 11*(numEntradas/2);
                    indPar = "pareja";
                } else {
                    precioBase = 8.00;
                    total = 11.00 * (numEntradas / 2) + precioBase;
                    indPar = "pareja e individual";
                }
                break;
            }
            default -> {
                System.out.println("Introduce un día de la semana.");
                return;
            }
        }
        
        double descuento;
        if (tarjeta.toLowerCase().equals("s"))
            descuento = total*0.1;
            else
                descuento = 0;
        
        double aPagar = total - descuento;
        System.out.printf("""
                Entrada %s %10d
                Precio por entrada %s%10.2f
                Total %10.2f
                Descuento %10.2f
                A pagar %10.2f
                """,
                indPar, numEntradas,
                indPar, precioBase,
                total,
                descuento,
                aPagar);
    }
}