package trabajoPractico11;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalisisNumerosDecimales {
    //-----------------------------------------EJERCICIO 4---------------------------------------
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar 20 números decimales ingresados por el usuario
        ArrayList<Double> numeros = new ArrayList<>();

        // Leer 20 números decimales ingresados por el usuario
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número decimal #" + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }

        // Determinar y mostrar el mayor de los números en el arreglo
        double maximo = numeros.get(0);
        for (double numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El mayor número es: " + maximo);

        // Determinar y mostrar el menor de los números en el arreglo
        double minimo = numeros.get(0);
        for (double numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("El menor número es: " + minimo);

        // Calcular y mostrar el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo
        double rango = maximo - minimo;
        System.out.println("El rango de los números es: " + rango);
    }
}
