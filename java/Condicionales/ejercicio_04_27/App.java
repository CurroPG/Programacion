public class App {
    public static void main(String[] args) {

        System.out.print("Elija un sabor (manzana, fresa o chocolate) ");
        String sabor = System.console().readLine();

        String tipoChoco = "";
        if (sabor.toLowerCase().equals("chocolate")){
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco) ");
            tipoChoco = System.console().readLine();
        }   else
                System.out.println("Introduzca un tipo de chocolate correcto.");
        
        System.out.print("¿Quiere nata? (si/no) ");
        String nata = System.console().readLine();
        
        System.out.print("¿Quiere ponerle un nombre? (si/no) ");
        String nombre = System.console().readLine();
       
        String nomTarta = "";
        double precioTarta;
        switch (sabor){
            case "manzana" ->{
                precioTarta = 18;
                nomTarta = "Tarta de manzana:";
            }
            case "fresa" ->{
                precioTarta = 16;
                nomTarta = "Tarta de fresa:";
            } 
            case "chocolate" ->{
                precioTarta = (tipoChoco.equals("negro"))? 14: 15;
                nomTarta = (tipoChoco.equals("negro"))? "Trata de chocolate negro:": "Tarta de chocolate blanco:";
            }
            default ->{
                System.out.println("Introduzca un sabor correcto.");
                return;
            }
        }

        double precioNata = (nata.equals("si")) ? 2.5 : 0;
        double precioNombre = (nombre.equals("si")) ? 2.75 : 0;
        double total = precioTarta + precioNata + precioNombre;

        System.out.printf("%-30s %6.2f %n", nomTarta, precioTarta);

        if (nata.equals("si"))
            System.out.printf("%-30s %6.2f %n", "Con nata:", precioNata);
        if (nombre.equals("si"))
            System.out.printf("%-30s %6.2f %n", "Con nombre:", precioNombre);

        System.out.printf("%-30s %6.2f %n", "Total:", total);
    }
}
