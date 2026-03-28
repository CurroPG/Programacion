public class App {
    public static void main(String[] args) throws Exception {
        final int CLAVE_CORRECTA = 8888;
        int contador = 0;
        int clave = 0;
        do{
            clave = Integer.parseInt(System.console().readLine("Introduzca la clave de la caja fuerte: "));
            if (clave == CLAVE_CORRECTA)
                System.out.println("Ha abierto la caja fuerte.");
                else
                    System.out.println("Clave incorrecta.");
            contador++;                
        }while(contador<4 && !(clave==CLAVE_CORRECTA));
        
        if (!(clave == CLAVE_CORRECTA))
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");

    }
}
