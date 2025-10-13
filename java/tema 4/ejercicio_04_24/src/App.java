public class App {
    public static void main(String[] args) throws Exception {
        final double SUELDOBASEJUNIOR = 950;
        final double SUELDOBASESENIOR = 1200;
        final double SUELDOBASEJEFE = 1600;
        System.out.println("1 - Programador Junior\n2 - Programador Senior\n3 - Jefe de Proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = Integer.parseInt(System.console().readLine());
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int viaje = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int estadoCivil = Integer.parseInt(System.console().readLine());
        double sueldoExtra = viaje*30;
        double brutoJunior = SUELDOBASEJUNIOR + sueldoExtra;
        double brutoSenior = SUELDOBASESENIOR + sueldoExtra;
        double brutoJefe = SUELDOBASEJEFE + sueldoExtra;
        double juniorCasado =  brutoJunior*0.2;
        double juniorNoCasado = brutoJunior*0.25;
        double seniorCasado = brutoSenior*0.2;
        double seniorNoCasado = brutoSenior*0.25;
        double jefeCasado = brutoJefe*0.2;
        double jefeNoCasado = brutoJefe*0.25; 
        switch (cargo){
            case 1:
                if (estadoCivil == 1){
                    System.out.println("----------------------------------");
                    System.out.printf("| Sueldo Base %.2f            |%n", SUELDOBASEJUNIOR);
                    System.out.printf("| Dietas ( %d viajes) %.2f      |%n", viaje, sueldoExtra);
                    System.out.println("|--------------------------------|");
                    System.out.printf("| Sueldo Bruto %.2f           |%n", brutoJunior);
                    System.out.printf("| Retención IRPF (25%%) %.2f    |%n", juniorNoCasado);
                    System.out.println("|--------------------------------|");
                    System.out.printf("| Sueldo neto %.2f            |%n", brutoJunior - juniorNoCasado);
                    System.out.println("----------------------------------");       
                }   else{
                        System.out.println("----------------------------------");
                        System.out.printf("| Sueldo Base %.2f            |%n", SUELDOBASEJUNIOR);
                        System.out.printf("| Dietas ( %d viajes) %.2f      |%n", viaje, sueldoExtra);
                        System.out.println("|--------------------------------|");
                        System.out.printf("| Sueldo Bruto %.2f           |%n", brutoJunior);
                        System.out.printf("| Retención IRPF (20%%) %.2f    |%n", juniorCasado);
                        System.out.println("|--------------------------------|");
                        System.out.printf("| Sueldo neto %.2f            |%n", brutoJunior - juniorCasado);
                        System.out.println("----------------------------------");
                }
            break;
            case 2:
                if (estadoCivil == 1){
                    System.out.println("----------------------------------");
                    System.out.printf("| Sueldo Base %.2f            |%n", SUELDOBASESENIOR);
                    System.out.printf("| Dietas ( %d viajes) %.2f      |%n", viaje, sueldoExtra);
                    System.out.println("|--------------------------------|");
                    System.out.printf("| Sueldo Bruto %.2f           |%n", brutoSenior);
                    System.out.printf("| Retención IRPF (25%%) %.2f    |%n", seniorNoCasado);
                    System.out.println("|--------------------------------|%n");
                    System.out.printf("| Sueldo neto %.2f            |%n", brutoSenior - seniorNoCasado);
                    System.out.println("----------------------------------");       
                }   else{
                        System.out.println("----------------------------------");
                        System.out.printf("| Sueldo Base %.2f            |%n", SUELDOBASESENIOR);
                        System.out.printf("| Dietas ( %d viajes) %.2f      |%n", viaje, sueldoExtra);
                        System.out.println("|--------------------------------|");
                        System.out.printf("| Sueldo Bruto %.2f           |%n", brutoSenior);
                        System.out.printf("| Retención IRPF (20%%) %.2f    |%n", seniorCasado);
                        System.out.println("|--------------------------------|");
                        System.out.printf("| Sueldo neto %.2f            |%n", brutoSenior - seniorCasado);
                        System.out.println("----------------------------------");        
                    }
            break;
            case 3:
                if (estadoCivil == 1){
                    System.out.println("----------------------------------");
                    System.out.printf("| Sueldo Base %.2f            |%n", SUELDOBASEJEFE);
                    System.out.printf("| Dietas ( %d viajes) %.2f      |%n", viaje, sueldoExtra);
                    System.out.println("|--------------------------------|");
                    System.out.printf("| Sueldo Bruto %.2f           |%n", brutoJefe);
                    System.out.printf("| Retención IRPF (25%%) %.2f    |%n", jefeNoCasado);
                    System.out.println("|--------------------------------|");
                    System.out.printf("| Sueldo neto %.2f            |%n", brutoJefe - jefeNoCasado);
                    System.out.println("----------------------------------");       
                }   else{
                        System.out.println("----------------------------------");
                        System.out.printf("| Sueldo Base %.2f            |%n", SUELDOBASEJEFE);
                        System.out.printf("| Dietas ( %d viajes) %.2f      |%n", viaje, sueldoExtra);
                        System.out.println("|--------------------------------|");
                        System.out.printf("| Sueldo Bruto %.2f           |%n", brutoJefe);
                        System.out.printf("| Retención IRPF (20%%) %.2f    |%n", jefeCasado);
                        System.out.println("|--------------------------------|");
                        System.out.printf("| Sueldo neto %.2f            |%n", brutoJefe - jefeCasado);
                        System.out.println("----------------------------------");        
                    }
            break;
            default:
                    System.out.println("Por favor, introduzca una opción válida.");
        }
    }
}
