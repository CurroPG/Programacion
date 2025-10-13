public class App {
    public static void main(String[] args) throws Exception {
        final int MINUTOSTOTALES = 6660;
        final int MINUTOSDIA = 1440;
        System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
        String dia = System.console().readLine();
        System.out.print("A continuación introduzca la hora (hora y minutos)\nHora: ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("Minutos: ");
        int minutos = Integer.parseInt(System.console().readLine());
        int tiempo = (hora*60) + minutos;
        int tiempoRestante = 0;
        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 60)
            System.out.println("Por favor, introduzca una hora correcta.");
            else{
                switch (dia){
                case "Lunes":
                tiempoRestante = MINUTOSTOTALES - tiempo;
                break;
                case "Martes":
                tiempoRestante = (MINUTOSTOTALES - MINUTOSDIA) - tiempo;
                break;
                case "Miercoles":
                case "Miércoles":
                tiempoRestante = (MINUTOSTOTALES - (MINUTOSDIA*2)) - tiempo;
                break;
                case "Jueves":
                tiempoRestante = (MINUTOSTOTALES - (MINUTOSDIA*3)) - tiempo;
                break;
                case "Viernes":
                if (hora < 0 || hora > 14 || minutos < 0 || minutos > 60)
                    System.out.println("!Ya es fin de semana¡");
                    else
                        tiempoRestante = (MINUTOSTOTALES - (MINUTOSDIA*4)) - tiempo;
                break;
                default:
                System.out.println("Por favor, introduzca un día de la semana (lunes a vierenes).");
            }
            System.out.printf("Faltan %d minutos para llegar al fin de semana.", tiempoRestante);
        }
    }
}
