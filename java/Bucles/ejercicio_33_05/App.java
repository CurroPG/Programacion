public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la U: "));
        int longitudLinea = 1;
        int base = 1;
        System.out.println();
        while(base<altura){
            for(int i = 0; i<=altura; i++){
                if(i == 0){
                    System.out.print(" ");
                    i++;
                }
                if(i == 1 || i == altura){
                    System.out.print("* ");
                    longitudLinea++;
                }else
                        System.out.print("  ");
            }
            System.out.println();
            base++;
        }
        for(int i = 0; i<=longitudLinea; i++){
            if(i == 0){
                System.out.print(" ");
                i++;
            }
            if(i%2 == 0 || i == 1 || i == longitudLinea)
                System.out.print(" ");
                else
                    System.out.print("*");
        }
    }
}
