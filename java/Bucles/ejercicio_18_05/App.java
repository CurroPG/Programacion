public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = 0;
        int numero2 = 0;
        do{
            numero1 = Integer.parseInt(System.console().readLine("Introduzca un numero entero: "));
            numero2 = Integer.parseInt(System.console().readLine("Introduzca otro numero entero distinto al anterior: "));
            if (numero1 == numero2){
                System.out.println("Los números introducidos no son válidos, deben ser distintos.");
            }           
        }while(numero1 == numero2);

        int numeroMayor = Math.max(numero1, numero2);
        int numeroMenor = Math.min(numero1, numero2);
        
        do{
            System.out.print(numeroMenor + " ");
            numeroMenor+=7;           
        }while(numeroMenor<=numeroMayor);
    }
}
