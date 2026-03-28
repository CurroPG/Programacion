public class App {
    public static void main(String[] args) throws Exception {
        boolean salir = false;
        int altura = 3;
        int anchura = 6;


        do{
            for(int i = 1; i <= altura; i++){
                for(int j = 1; j <= anchura; j++){
                    if(i == 1 || i == altura)
                        System.out.print("*");
                        else if(j == 1 || j == anchura)
                            System.out.print("*");
                            else
                                System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiarlo de orientación");
            System.out.println("4. Salir");
            int opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    altura++;
                    break;
                case 2:
                        altura--;
                        if(altura < 2){
                            System.out.println("No se puede achicar más.");
                            salir = true;    
                        }
                    break;
                case 3:
                    altura = anchura;
                    anchura = altura;
                    break;
                case 4:
                    salir = true;
                    break;
            
                default:
                    break;
            }
       }while(!salir);
    }
}
