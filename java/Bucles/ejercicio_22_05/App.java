public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Numeros primos entre 2 y 100.");
        
        boolean esPrimo = true;
        for (int i = 2; i <= 100; i++){
            esPrimo = true;
            for(int j = 2; j < i; j++){           
                if (i % j == 0){
                    esPrimo = false;
                }               
            }
            if (esPrimo){
                System.out.print(i + " ");
            }
        }
    }
}
