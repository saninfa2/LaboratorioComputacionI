package trabajoPractico11;
import java.util.ArrayList;
import java.util.Random;

public class AnalisisNumeros {
    //-----------------------------------------EJERCICIO 5---------------------------------------
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar 20 números enteros positivos pares
        ArrayList<Integer> numeros = new ArrayList<>();

        // Generar aleatoriamente 20 números enteros positivos pares del 1 al 100
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(50) * 2 + 1; // Generar número impar inicial
            numeros.add(numero);
        }

        // Calcular el promedio aritmético
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        double promedio = (double) suma / numeros.size();

        // Contadores para las estadísticas
        int igualesAlPromedio = 0;
        int mayoresAlPromedio = 0;
        int menoresAlPromedio = 0;

        // Analizar cada número en la lista
        for (int numero : numeros) {
            if (numero == promedio) {
                igualesAlPromedio++;
            } else if (numero > promedio) {
                mayoresAlPromedio++;
            } else {
                menoresAlPromedio++;
            }
        }

        // Mostrar resultados
        System.out.println("Números generados: " + numeros);
        System.out.println("Promedio aritmético: " + promedio);
        System.out.println("Cantidad de números iguales al promedio: " + igualesAlPromedio);
        System.out.println("Cantidad de números mayores que el promedio: " + mayoresAlPromedio);
        System.out.println("Cantidad de números menores que el promedio: " + menoresAlPromedio);
    }
}

