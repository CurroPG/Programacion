public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cálculo de una potencia.");
        int base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
        int exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente: "));
        int contador = 0;
        double resultado = 1;
        if (exponente < 0){
            for(int i=0; i<-exponente;i++)
            resultado*=base;
            resultado = 1/resultado;
        }else if (exponente == 0)
            resultado = 1;
            else
                do {
                resultado*=base;
                contador++;
                }while(contador < exponente);       
        System.out.printf("%d^%d = %.2f", base, exponente, resultado);
    }
}
