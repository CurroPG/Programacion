public class App {
    public static void main(String[] args) {
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String turno1 = System.console().readLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String turno2 = System.console().readLine();


        if (turno1.equals(turno2)){
            System.out.println("Empate");
        }   else{
                switch (turno1){
                    case "piedra" ->{
                        if (turno2.equals("papel"))
                            System.out.println("Gana el jugaador 2");
                            else
                                System.out.println("Gana el jugador 1");
                    break;
                    }
                    case "papel" ->{
                        if (turno2.equals("tijera"))
                            System.out.println("Gana el jugador 2");
                            else
                                System.out.println("Gana el jugador 1");
                    break;
                    }
                    case "tijera" ->{
                        if (turno2.equals("piedra"))
                            System.out.println("Gana el jugador 2");
                            else
                                System.out.println("Gana el jugador 1");
                    break;
                    }
                    default ->{
                        System.out.println("Introduzca piedra, papel o tijera.");
                    return;
                    }
                }
            }
    }
}
