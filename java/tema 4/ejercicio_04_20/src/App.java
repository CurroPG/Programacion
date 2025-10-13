public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        int numero = Integer.parseInt(System.console().readLine());
        
        if (numero < 0 || numero > 99999) 
            System.out.println("El número debe tener entre 1 y 5 cifras.");
            else{

        
                if (numero < 10)
                    System.out.println("El número introducido es capicúa.");
                    else if (numero < 100){
                        int a = numero / 10;
                        int b = numero % 10;
                        if (a == b)
                            System.out.println("El número introducido es capicúa.");
                            else 
                                System.out.println("El número introducido no es capicúa.");
                    }
                        else if (numero < 1000){
                            int a = numero / 100;
                            int b = numero % 10;
                            if (a == b)
                                System.out.println("El número introducido es capicúa.");
                                else
                                    System.out.println("El número introducido no es capicúa.");
                        }
                            else if (numero < 10000){
                                int a = (numero / 10) % 10;
                                int b = (numero / 100) % 10;
                                int c = (numero / 1000) % 10;
                                int d = numero % 10;
                                if (a == b && c == d)
                                System.out.println("El número introducido es capicúa.");
                                    else 
                                        System.out.println("El número introducido no es capicúa.");

                            }
                                else if (numero < 100000){
                                    int a = (numero / 10) % 10;
                                    int b = (numero / 1000) % 10;
                                    int c = (numero / 10000) % 10;
                                    int d = numero % 10;
                                    if (a == b && c == d)
                                      System.out.println("El número introducido es capicúa.");
                                        else
                                            System.out.println("El número introducido no es capicúa.");        
                                }
            }
            
    }
}
