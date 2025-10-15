public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Venta de entradas CineTuring.");

        System.out.print("Número de entradas: ");
        int numEntradas = Integer.parseInt(System.console().readLine());

        System.out.print("Día de la semana: ");
        String diaSemana = System.console().readLine();

        System.out.print("¿Tiene tarjeta CineTuring? (s/n) ");
        String tarjeta = System.console().readLine();

        double precioBase = 0;  
        double total = 0;
        String indPar = "individual";

        switch(diaSemana.toLowerCase()){
            case "Lunes", "Martes", "Viernes", "Sabado", "Sábado", "Domingo":{  
                precioBase = 8.00;
                total = precioBase*numEntradas;
                break;
            }
            case "Miercoles", "Miércoles":{ 
                precioBase = 5.00;
                total = precioBase*numEntradas;
                break;
            }
            case "Jueves":{ 
                if (numEntradas % 2 == 0){
                    precioBase = 11;
                }
                total = (numEntradas % 2 == 0)? 11*(numEntradas/2): 11*(numEntradas/2) + 8;
                indPar = "pareja";
                break;
            }
            default: System.out.println("Introduce un día de la semana.");
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