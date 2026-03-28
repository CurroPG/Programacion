package Ejercicio8;

public class App {
    public static void main(String[] args) {
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int temperaturas[] = new int[12];

        for(int i = 0; i < 12; i++){
            temperaturas[i] = Integer.parseInt(System.console().readLine("Introduzca la temperatura media de " + meses[i] + ": "));
        }

        for(int i = 0; i < 12; i++){
            System.out.printf("%10s |", meses[i]);
            for(int j = 0; j < temperaturas[i]; j++){
                System.out.print("*");
            }
            System.out.println(" " + temperaturas[i] + "ºC");
        }
    }
}
