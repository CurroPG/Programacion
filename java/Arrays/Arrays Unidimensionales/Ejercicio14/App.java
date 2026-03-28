package Ejercicio14;

public class App {
    public static boolean contiene(String[] array, String palabra){
        for(int i = 0; i<array.length;i++){
            if(array[i].toLowerCase().equals(palabra.toLowerCase()))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int indice = 0;
        String palabraIntroducida = "";
        String colores[] = {"verde", "rojo", "azul", "gris", "naranja", "rosa", "negro", "blanco", "morado"};
        String palabras[] = new String[8];
        String palabrasOrdenadas[] = new String[8];
        
        for(int i = 0; i < 8; i++){
            palabraIntroducida = System.console().readLine();
            palabras[i] = palabraIntroducida;
        }

        for(int i = 0; i < 8; i++){
            System.out.print(palabras[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < 8; i++){
            if(contiene(colores, palabras[i]))
                palabrasOrdenadas[indice++] = palabras[i];
        }

        for(int i = 0; i < 8; i++){
            if(!contiene(colores, palabras[i]))
                palabrasOrdenadas[indice++] = palabras[i];
        }

        for(int i = 0; i < 8; i++){
            System.out.print(palabrasOrdenadas[i] + " ");
        }
    }
}
