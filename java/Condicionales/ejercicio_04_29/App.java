public class App {
    public static void main(String[] args) {
        
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo) ");
        String comida = System.console().readLine();
        String pitufo = "";
        if (comida.toLowerCase().equals("pitufo")){
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla) ");
            pitufo = System.console().readLine();
        }else{
            System.out.print("Por favor, introduce una opcion correcta.");
        }

        System.out.print("¿Qué ha tomado de beber? (zumo o café) ");
        String bebida = System.console().readLine();

        String com;
        double precioComida;
        switch(comida.toLowerCase()){
            case "palmera" -> {
                precioComida = 1.4;
                com = "Palmera:";
            break;
            }
            case "donut" -> {
                precioComida = 1;
                com = "donut:";
            break;
            }
            case "pitufo" -> {
                precioComida = ((pitufo.toLowerCase().equals("aceite"))? 1.2: 1.6);
                com = ((pitufo.toLowerCase().equals("aceite"))? "Pitufo con aceite:": "Pitufo con tortilla:");
            break;
            }
            default -> {
                System.out.print("Por favor, introduce una opcion correcta.");
                return;
            }
        };
        System.out.printf("%-20s%10.2f%n", com, precioComida);
        
        double precioBebida;
        String beb;
        switch(bebida.toLowerCase()){
            case "zumo" -> {
                precioBebida = 1.5;
                beb = "Palmera:";
            break;
            }
            case "café" -> {
                precioBebida = 1.2;
                beb = "Café:";
                
            break;
            }
            default -> {
                System.out.print("Por favor, introduce una opcion correcta.");
                return;
            }
        };
        System.out.printf("%-20s%10.2f%n", beb, precioBebida);
        double total = precioBebida + precioComida;
        System.out.printf("%-20s%10.2f", "Total desayuno", total);

    }   
}
