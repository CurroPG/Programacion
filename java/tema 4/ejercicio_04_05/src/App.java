public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduce el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce el valor de b: ");
        double b = Double.parseDouble(System.console().readLine());
        double x = -b / a;
        if (a == 0 )
            System.out.println("Esa ecuacion no tiene solucion real");
         else 
            System.out.printf("x = %.2f", x);
    }
}
