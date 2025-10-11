public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Este programa multiplica dos números enteros");
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(System.console().readLine());
        int resultado = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + resultado);
    }
}
