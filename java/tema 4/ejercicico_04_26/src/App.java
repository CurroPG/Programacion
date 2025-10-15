public class App {
    public static void main(String[] args) throws Exception {
        final double PRECIO_ENTRADA_BASE = 8.00;
        final double PRECIO_ENTRADA_MIERCOLES = 5.00;
        System.out.println("Venta de entradas CineTuring");

        System.out.println("Número de entradas: ");
        int numeroEntradas = Integer.parseInt(System.console().readLine());

        System.out.println("Día de la semana: ");
        String diaSemana = System.console().readLine();

        System.out.println("¿Tiene tarjeta CineTuring? (s/n) ");
        String tarjeta = System.console().readLine();

        double precioEntrada = 0; 
        switch(diaSemana.toLowerCase()){
            case "Lunes":
            case "Martes":
            case "Viernes":
            case "Sabado":
            case "Sábado":
            case "Domingo":
                precioEntrada = PRECIO_ENTRADA_BASE;
                break;
            case "Miercoles":
            case "Miércoles":
                precioEntrada = PRECIO_ENTRADA_MIERCOLES;
                break;
            case "Jueves":
                if (numeroEntradas % 2 == 0)
                    precioEntrada = 11*(numeroEntradas/2);
                    else 
                        precioEntrada = 11*(numeroEntradas/2) + PRECIO_ENTRADA_BASE; 
            default:
                System.out.println("Por favor, introduzca un dia de la semana.");
                break;
        };
        
        double descuento = 0;
        if (tarjeta.equals("s"))
            descuento = precioEntrada*0.1;
            else
                descuento = 0;
        
        
    }
}
