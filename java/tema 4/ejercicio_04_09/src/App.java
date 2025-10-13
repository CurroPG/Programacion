public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Este programa resuelve ecuaciones de segundo grado.\nax^2 + bx + c = 0\nPorfavor, intprduzca los valores.\na: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("b: ");
        double b = Double.parseDouble(System.console().readLine());
        System.out.print("c: ");
        double c = Double.parseDouble(System.console().readLine());
        double discriminante = (Math.pow(b, 2) - (4*a*c));
        double x = -b / (2*a);
        double numerador1 = ((-b)+ Math.sqrt(discriminante));
        double numerador2 = ((-b) -  Math.sqrt(discriminante));
        double denominador = (2*a);
        double x1 = (numerador1 / denominador);
        double x2 = (numerador2 / denominador);
        if (discriminante < 0)
            System.out.println("La ecuacion no tiene soluciones reales.");
            else if (a == 0 && b == 0 && c == 0)
                System.out.println("La ecuación tiene infinitas soluciones.");
                else if (a == 0)
                    System.out.println("La ecuación no tiene solución.");
                    else if (discriminante == 0)
                        System.out.printf("La ecuacion tiene una única solución: %.2f", x);
                        else 
                            System.out.printf("x1 = %.2f%nx2 = %.2f", x1, x2);
    }
}
