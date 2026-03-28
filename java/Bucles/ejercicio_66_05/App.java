public class App {
    public static void main(String[] args) throws Exception {
        int altura;
        
        do{
            altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la figura: "));
            if(altura < 3 || altura % 2 == 0){
                System.out.println("La altura no es correcta, debe ser impar y mayor o igual que 3.");
            }
        }while(altura < 3 || altura % 2 == 0);

        int espacios = 0;
        int base = 0;

        while(base < altura){
            for(int i = 0; i < espacios; i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= 6; i++){
                System.out.print((i==1||i==6)?"*":" ");
            }
            System.out.println();
            base++;
            if(base <= altura/2)
                espacios++;
                else
                    espacios--;
        }
    }
}
