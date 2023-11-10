package segundoParcial;
import java.util.Objects;
import java.util.Scanner;

public class DetectorDeMutantes {
    public static void main(String[] args) {
        //Abrimos scanner
        Scanner sc = new Scanner(System.in);

        //Le damos la bienvenida al usuario
        System.out.println("Bienvenido a Mutant");

        //Inicializacion de variables
        String respuesta;

        //Presentación de menú: se presentan las opciones de verificar mutante (que llama a la función principal del programa)
        //y salir
        do{
            //Menú
            System.out.println("1) Verificar mutante  2) Salir");
            System.out.println("Ingresa el número de la operación que desea realizar: ");
            respuesta = sc.next();
            if (Objects.equals(respuesta, "2")){
                break;
            } else if (Objects.equals(respuesta, "1")){
                // Ingreso de la matriz de ADN
                String[] dna = new String[6];

                //Para cada fila del array se pide la cadena de ADN
                for (int j = 0; j < 6; j++) {
                    System.out.print("Ingrese la secuencia de ADN para la fila " + (j + 1) + ": ");
                    String entrada = sc.nextLine().toUpperCase();

                    //Validación de cadena:
                    while (!validarCadena(entrada)) {
                        System.out.println("Entrada o longitud de entrada inválida.");
                        System.out.println("Solo puede ingresar una secuencia que contenga A, T, C y/o G ");
                        System.out.println("La secuencia debe tener 6 letras");
                        System.out.print("Ingrese la secuencia de ADN para la fila " + (j + 1) + ": ");
                        entrada = sc.nextLine().toUpperCase();
                    }
                    //Una vez validada se asigna a la celda del array ADN
                    dna[j] = entrada;
                }

                //Llamamos al método principal pasandole como parametro el ADN ingresado anteriormente
                boolean esMutante = isMutant(dna);

                //Mostramos el resultado por pantalla
                if (esMutante) {
                    System.out.println("El humano es mutante.");
                } else {
                    System.out.println("El humano no es mutante.");
                }
            } else {
                //Si el usuario ingresa un número incorrecto se le devuelve al menú
                System.out.println("Opción inválida. Intente nuevamente");
            }
        } while(!Objects.equals(respuesta, "2"));

        //Despedimos al usuario
        System.out.println("Fin del programa. Adiós 🤠");
    }

    //Función de validación: a través de una expresión regular validamos que solo contenga ATCG y con length() validamos la longitud
    private static boolean validarCadena(String input) {
        return input.matches("[ATCG]+") && input.length() == 6;
    }


    // Función principal: verifica si el humano es mutante a través de un contador, en caso de encontrar 2 o más coincidencias
    //retorna true si no false
    private static boolean isMutant(String[] dna) {
        int contador = 0;
        //Búsqueda horizontal
        if (busquedaHorizontal(dna)) {
            contador += 1;
        }

        //Búsqueda vertical
        if (busquedaVertical(dna)) {
            contador += 1;
        }

        //Búsqueda diagonal
        if (busquedaDiagonal(dna)) {
            contador += 1;
        }

        if (contador >= 2){
            return true;
        }

        return false;
    }

    // Función para verificar secuencias horizontales: se busca como subcadena la secuencia de cada letra
    private static boolean busquedaHorizontal(String[] dna) {
        for (String fila : dna) {
            if (fila.contains("AAAA") || fila.contains("TTTT") || fila.contains("CCCC") || fila.contains("GGGG")) {
                return true;
            }
        }
        return false;
    }

    // Función para verificar secuencias verticales: se busca como subcadena la secuencia de cada letra
    private static boolean busquedaVertical(String[] dna) {
        for (int i = 0; i < dna[0].length(); i++) {
            StringBuilder columna = new StringBuilder();
            for (String fila : dna) {
                columna.append(fila.charAt(i));
            }
            if (columna.toString().contains("AAAA") || columna.toString().contains("TTTT") ||
                    columna.toString().contains("CCCC") || columna.toString().contains("GGGG")) {
                return true;
            }
        }
        return false;
    }

    // Función para verificar secuencias diagonales: se busca como subcadena la secuencia de cada letra
    private static boolean busquedaDiagonal(String[] dna) {
        int filas = dna.length;
        int columna = dna[0].length();

        // Verificar diagonales principales (de izquierda a derecha)
        for (int i = 0; i < filas - 3; i++) {
            for (int j = 0; j < columna - 3; j++) {
                if (dna[i].charAt(j) == dna[i + 1].charAt(j + 1) &&
                        dna[i + 1].charAt(j + 1) == dna[i + 2].charAt(j + 2) &&
                        dna[i + 2].charAt(j + 2) == dna[i + 3].charAt(j + 3)) {
                    return true;
                }
            }
        }

        // Verificar diagonales secundarias (de derecha a izquierda)
        for (int i = 0; i < filas - 3; i++) {
            for (int j = columna - 1; j >= 3; j--) {
                if (dna[i].charAt(j) == dna[i + 1].charAt(j - 1) &&
                        dna[i + 1].charAt(j - 1) == dna[i + 2].charAt(j - 2) &&
                        dna[i + 2].charAt(j - 2) == dna[i + 3].charAt(j - 3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
