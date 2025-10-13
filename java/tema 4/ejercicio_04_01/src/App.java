public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String dia = System.console().readLine();
        switch(dia){
            case "Lunes":
                System.out.println("Base de Datos");
                break;
            case "Martes":
                System.out.println("Programación");
                break;
            case "Miércoles":
                System.out.println("Sistemas Informáticos");
                break;
            case "Jueves":
                System.out.println("IPE1");
                break;
            case "Viernes":
                System.out.println("Bse de Datos");
                break;
            default:
                System.out.println("El día iuntrooducido no es correcto");
        }
    }
}
