public class App {
    public static void main(String[] args) throws Exception {
        final int SEGUNDOSDIA = 86400;
        System.out.print("A continuación deberá introducir una hora del día, primero introducirá la hora y luego los minutos.\nhora: ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("minuto: ");
        int minuto = Integer.parseInt(System.console().readLine());
        int segundos = ((hora * 3600) + (minuto * 60));
        int segundosRestantes = SEGUNDOSDIA - segundos;
        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 60)
            System.out.printf("Desde las %d:%d hasta la medianoche faltan %d segundos.", hora, minuto, segundosRestantes);
            else 
                System.out.println("Por favor, introduce valores correctos");
    }
}
