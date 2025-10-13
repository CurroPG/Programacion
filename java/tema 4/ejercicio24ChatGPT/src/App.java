public class App {
    public static void main(String[] args) throws Exception {
        final double SUELDO_BASE_JUNIOR = 950;
        final double SUELDO_BASE_SENIOR = 1200;
        final double SUELDO_BASE_JEFE   = 1600;
        final double DIETA_POR_DIA = 30;
        System.out.println("1 - Programador Junior");
        System.out.println("2 - Programador Senior");
        System.out.println("3 - Jefe de Proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int diasViaje = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = Integer.parseInt(System.console().readLine());
        double sueldoBase = switch (cargo) {
            case 1 -> SUELDO_BASE_JUNIOR;
            case 2 -> SUELDO_BASE_SENIOR;
            case 3 -> SUELDO_BASE_JEFE;
            default -> {
                System.out.println("Por favor, introduzca una opción válida.");
                yield 0;
            }
        };
        double sueldoExtra = diasViaje * DIETA_POR_DIA;
        double sueldoBruto = sueldoBase + sueldoExtra;
        double porcentajeIRPF = (estadoCivil == 1) ? 0.25 : 0.20;
        double retencion = sueldoBruto * porcentajeIRPF;
        double sueldoNeto = sueldoBruto - retencion;
        System.out.println("----------------------------------");
        System.out.printf("| Sueldo Base           %.2f  |%n", sueldoBase);
        System.out.printf("| Dietas (%d viajes)     %.2f   |%n", diasViaje, sueldoExtra);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo Bruto          %.2f  |%n", sueldoBruto);
        System.out.printf("| Retención IRPF (%.0f%%)  %.2f   |%n", porcentajeIRPF * 100, retencion);
        System.out.println("|--------------------------------|");
        System.out.printf("| Sueldo Neto           %.2f  |%n", sueldoNeto);
        System.out.println("----------------------------------");
    }
}