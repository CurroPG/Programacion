public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa ordena tres números introducidos por teclado.\nPor favor, vaya introduciendo los tres números y pulsando INTRO: ");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int c = Integer.parseInt(System.console().readLine());
        int caso = 0;

        if (a > b && a > c && b >= c) caso = 1;
        else if ( a > b && a > c && c >= b) caso = 2;
        else if ( b > a && b > c && a >= c) caso = 3;
        else if ( b > a && b > c && c >= a) caso = 4;
        else if ( c > a && c > b && b >= a) caso = 5;
        else if ( c > b && c > a && a >= b) caso = 6;

        switch(caso) {
            case 1:
                System.out.printf("Los números introducidos ordenados de menor a mayor son %d, %d y %d.", c, b, a);
                break;
            case 2:
                System.out.printf("Los números introducidos ordenados de menor a mayor son %d, %d y %d.", b, c, a);
                break;
            case 3:
                System.out.printf("Los números introducidos ordenados de menor a mayor son %d, %d y %d.", c, a, b);
                break;
            case 4:
                System.out.printf("Los números introducidos ordenados de menor a mayor son %d, %d y %d.", a, c, b);
                break;
            case 5:
                System.out.printf("Los números introducidos ordenados de menor a mayor son %d, %d y %d.", a, b, c);
                break;
            case 6:
                System.out.printf("Los números introducidos ordenados de menor a mayor son %d, %d y %d.", b, a, c);
                break;
                default:
                    System.out.println("Has introducido 3 números iguales.");
        }       
    }
}
