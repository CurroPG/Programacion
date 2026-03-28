package ScriptEjercicios29a34;
import Ejercicios29a34.FuncionesBidimensionales;
public class App {
    public static void main(String[] args) {

        int array[][] = FuncionesBidimensionales.generaArrayBiInt(8, 5);
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================");

        FuncionesBidimensionales.filaDeArrayBiInt(2, array);
        System.out.println();
        System.out.println("==========================");

        FuncionesBidimensionales.columnaDeArrayBiInt(6, array);
        System.out.println();
        System.out.println("==========================");

        FuncionesBidimensionales.coordenadasEnArrayBiInt(24, array);
        System.out.println();
        System.out.println("==========================");

        FuncionesBidimensionales.minimoYmaximo(array);
        System.out.println();
        System.out.println("==========================");

        FuncionesBidimensionales.diagonal(3, 4, "neso", array);
    }
}
