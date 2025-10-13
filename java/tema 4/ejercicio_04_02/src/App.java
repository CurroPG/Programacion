public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
        int hora = Integer.parseInt(System.console().readLine());

        if (0 <= hora && hora < 7)
            System.out.println("Buenas noches"); 
        else if (7 <= hora && hora < 12)
            System.out.println("Buenos días");
        else if (12 <= hora && hora < 20)
            System.out.println("Buenas tardes");    
        else if (20 <= hora && hora < 23)
            System.out.println("Buenas noches");
        else
            System.out.println("La hora introducida no es correcta");         
    }
}
