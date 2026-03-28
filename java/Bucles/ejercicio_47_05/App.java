public class App {
    public static void main(String[] args) throws Exception {
        int anchura = 6;
        int altura = 0;
        do{
            altura = Integer.parseInt(System.console().readLine("Por favor, introduzca la altura (número impar mayor o igual a 5): "));
            if(altura < 5 || altura % 2 == 0)
                System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo de la altura es un número impar mayor o igual a 5.");
        }while(altura < 5 || altura % 2 == 0);

        int base = 0;
        int numFila = 0;
        while(base < altura){
            numFila++;
            if (base <= (altura / 2)){
                if(numFila == 1 || numFila == altura)
                for(int i = 0; i < anchura; i++){
                    System.out.print("M");
                }
                else
                    for(int i = 1; i <= anchura; i++){
                        if(i == 1 || i == anchura)
                            System.out.print("M");
                            else
                                System.out.print(" ");
                    }
            System.out.println();
            if(numFila == (altura/2))
                numFila = 0;
            }else{
                numFila++;
                if(numFila == 1 || numFila == altura)
                for(int i = 0; i < anchura; i++){
                    System.out.print("M");
                }
                else
                    for(int i = 1; i <= anchura; i++){
                        if(i == 1 || i == anchura)
                            System.out.print("M");
                            else
                                System.out.print(" ");
                    }
            System.out.println();
            }
            base++;
        }
    }
}
