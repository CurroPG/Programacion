public class App {
    public static void main(String[] args) throws Exception {
        long numero = Long.parseLong(System.console().readLine("Introduzca un número entero: "));
        boolean esta;
        int digito = 0;
        long aux = numero;
        long invertido = 0;
        aux = aux * 10 + 1;
        
        do{
            digito = (int)aux % 10;
            invertido = invertido * 10 + digito;
            aux /= 10;
        }while(aux != 0);

        System.out.print("Dígitos que aparecen en el número: ");

        for(int i = 0; i < 9; i++){
            aux = invertido;
            digito = 0;
            esta = false;
            do{
                if(aux != 1){
                    digito = (int)aux % 10;
                    if(digito == i)
                        esta = true;
                    aux /= 10;
                }
            }while(aux != 1);
            if(esta)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Dígitos que no aparecen en el número: ");

        for(int i = 0; i < 9; i++){
            aux = invertido;
            digito = 0;
            esta = false;
            do{
                if(aux != 1){
                    digito = (int)aux % 10;
                    if(digito == i)
                        esta = true;
                    aux /= 10;
                }
            }while(aux != 1);
            if(!esta)
                System.out.print(i + " ");
        }

    }
}
