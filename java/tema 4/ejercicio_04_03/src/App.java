public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número del 1 al 7: ");
        int numero = Integer.parseInt(System.console().readLine());
        String dia;
        switch(numero){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes"; 
                break;
            case 3:
                dia = "Miércoles";  
                break;
            case 4:
                dia = "Jueves"; 
                break;
            case 5:
                dia = "Viernes"; 
                break;  
            case 6:
                dia = "Sábado"; 
                break;
            case 7:
                dia = "Domingo"; 
                break;
            default:
                dia = "Por favor, introduzca un número válido";
        }
        System.out.println(dia);
    }
}
