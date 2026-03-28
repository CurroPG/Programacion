public class App {
    public static void main(String[] args) {

        System.out.print("Primera nota: ");
        double nota1 = Double.parseDouble(System.console().readLine());
        
        System.out.print("Segunda nota: ");
        double nota2 = Double.parseDouble(System.console().readLine());
        
        System.out.print("Tercera nota: ");
        double nota3 = Double.parseDouble(System.console().readLine());

        double notaMedia = (nota1 + nota2 + nota3)/3;

        String boletin = "";
        switch(Math.round((int)notaMedia)){
            case 1, 2, 3, 4 -> boletin = "Insuficiente";
            case 5 -> boletin = "Suficiente";
            case 6 -> boletin = "Bien";
            case 7, 8 -> boletin = "Notable";
            case 9, 10 -> boletin = "Sobresaliente";
            default -> System.out.println("Error.");
        }
        
        System.out.println("La media es " + notaMedia);
        System.out.println(boletin);
    }
}
