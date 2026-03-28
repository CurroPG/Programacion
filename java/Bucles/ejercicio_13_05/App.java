public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, introduce 10 números enteros.");
        int numeropos = 0;
        int numeroneg = 0;
        for (int i = 0; i<10; i++){
            int numeroIntroducido = Integer.parseInt(System.console().readLine());
            if (numeroIntroducido <=0)
                numeroneg++;
                else
                    numeropos++;
        }
        System.out.println("Ha introducido "+ numeropos +" positivos y "+ numeroneg +" negativos.");
    }
}
