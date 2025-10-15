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

        double precioNata = (nata.toLowerCase().equals("si"))? 2.5: 0;
        double precioNombre = (nombre.toLowerCase().equals("si"))? 2.75: 0;

        String conSinNata = "";
        String conSinNombre = "";
        double total = 0;
        if (nata.toLowerCase().equals("si") && nombre.toLowerCase().equals("si")){
            conSinNata = "Con nata:";
            conSinNombre = "Con nombre:";
            total = precioTarta + precioNata + precioNombre;
        }
        if (nombre.toLowerCase().equals("si") && nombre.toLowerCase().equals("no")){
            conSinNata = "Con nata:";
            total = precioTarta + precioNata;
        }
        if (nombre.toLowerCase().equals("no") && nombre.toLowerCase().equals("si")){
            conSinNombre = "Con nombre:";
            total = precioTarta + precioNombre;
        }   else{
                total = precioTarta;
        }
        
        System.out.printf("""
                %-10s%10.2f
                %-10s%10.2f
                %-10s%10.2f
                %-10s%10.2f
                """,
                nomTarta, precioTarta,
                conSinNata, precioNata,
                conSinNombre, precioNombre,
                "Total:", total);
    }
}
