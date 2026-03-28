package Ejercicio15;

public class App {
    public static void main(String[] args) {
        int clientes = 0;
        int sentados = 0;
        boolean lleno = false;
        int mesas[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 5);
            mesas[i] = random;
        }

        while (clientes != -1) {
            for (int i = 0; i < 10; i++) {
                System.out.print(mesas[i] + " ");
            }
            System.out.println();
            clientes = Integer
                    .parseInt(System.console().readLine("¿Cuantos son? (Introduzca -1 para salir del programa): "));

            if (clientes > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + clientes
                        + ", haga grupos de 4 personas como máximo e intentelo de nuevo;");
                clientes = -1;
            } else {
                for (int i = 0; i < 10; i++) {
                    if (mesas[i] == 4)
                        lleno = true;
                    if ((!lleno && clientes <= 4) && (mesas[i] + clientes <= 4)) {
                        if (sentados == 0) {
                            System.out.println("Por favor sientese en la mesa " + (i + 1));
                            sentados++;
                            mesas[i] = mesas[i] + clientes;
                        }
                    }
                    lleno = false;
                }
            }
            sentados = 0;
        }
    }
}
