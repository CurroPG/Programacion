public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de los calcetines: "));
        int base = 1;

        while(base <= altura){
            if(base > altura-2){
                System.out.println("******  ******");
                
            }else{
                System.out.println("***     ***");    
            }
            base++;
        }    
    }
}
