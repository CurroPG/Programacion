public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número: "));
        int numero=0;
        double numero2=0;
        double numero3=0;
        System.out.println("   n  |    n2   |    n3    ");
        System.out.println("---------------------------");
        for (int i=0; i<=5; i++) {
            numero = numeroIntroducido+i;
            numero2 = Math.pow(numeroIntroducido+i, 2);
            numero3 = Math.pow(numeroIntroducido+i, 3);
            System.out.printf("%5d|%9d|%10d%n", numero,(int)numero2,(int)numero3);
        }       
    }
}
