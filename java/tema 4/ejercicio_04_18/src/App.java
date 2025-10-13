public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca un número entero positivo (de 5 cifras como máximo):");
        int numero = Integer.parseInt(System.console().readLine());
        int primeraCifra = 0;
        if (numero < 0 || numero > 99999)
            System.out.println("Introduce un número de 5 cifras o menos.");
            else if (numero < 10) primeraCifra = numero;
            else if (numero < 100) primeraCifra = numero/10;
            else if (numero < 1000) primeraCifra = numero/100;
            else if (numero < 10000) primeraCifra = numero/1000;
            else if (numero < 100000) primeraCifra = numero/10000;
                
        System.out.printf("La primera cifra del número introducido es el %d", primeraCifra);
    }
}
