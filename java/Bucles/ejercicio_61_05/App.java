public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la V (mayor o igual a 3): ")); 
        int espacios = altura - 2;
        int huecos = espacios * 2 + 2;
        espacios = 0;
        int base = 0;

        while(base < altura){
            for(int i = 0; i < espacios; i++){
                System.out.print(" ");
            }
            if(huecos != 0)
                System.out.printf("%s%"+huecos+"s%s%n", "***"," ","***");
                else
                    System.out.print("******");
            espacios++;
            huecos-=2;
            base++;
        }
    }
}
