public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(""" 
                1. Programador Junior
                2. Programador Senior
                3. Jefe de Proyectos
                """);
        System.out.print("Introduzca el cargo del empleado (1-3) ");
        int cargo = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuántos días estuvo de viaje? ");
        int diasViaje = Integer.parseInt(System.console().readLine());
        double dietas = diasViaje*30;
        System.out.print("Introduzca su estado civil (1. Soltero - 2. Casado) ");
        int estadoCivil = Integer.parseInt(System.console().readLine());
        double sueldoBase = switch (cargo){
            case 1 -> sueldoBase = 950;
            case 2 -> sueldoBase = 1200;
            case 3 -> sueldoBase = 1600;
            default ->{
                System.out.println("Introduzca un número del 1 al 3.");
                yield 0;        
            }
        };
        double sueldoBruto = sueldoBase + dietas;
        double retencion = switch (estadoCivil){
            case 1 -> retencion = sueldoBruto*0.25;
            case 2 -> retencion = sueldoBruto*0.2;
            default -> {
                System.out.println("Introduce un estado civil correcto");
                yield 0;
            }
        };
        double sueldoNeto = sueldoBruto - retencion;
        System.out.println("----------------------------------");
        System.out.printf("| Sueldo Base           %.2f  |%n", sueldoBase);
        System.out.printf("| Dietas (%d viajes)     %.2f   |%n", diasViaje, dietas);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo Bruto          %.2f  |%n", sueldoBruto);
        System.out.printf("| Retención IRPF (20%%)  %.2f   |%n", retencion);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo Neto           %.2f  |%n", sueldoNeto);
        System.out.println("----------------------------------");
    }
}
