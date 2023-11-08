package trabajoPracticoN8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tpn8 {
    //------------------------------------CLASES DE EJERCICIOS-----------------------------------
    //-----------------------------------------EJERCICIO 1---------------------------------------
    //Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
    public static int[][] sumarDosMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];
        if (matrizA.length == matrizB.length) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            return matrizC;
        }
        return matrizC;
    }

    //-----------------------------------------EJERCICIO 2---------------------------------------
    //Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.
    public static int[][] multiplicarMatrices(int[][] m1, int[][] m2) {
        int[][] producto = new int[2][3];
        for (int i = 0; i < 2; i++) {
            int suma = 0;
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    suma += m1[i][k] * m2[k][j];
                }
                producto[i][j] = suma;
            }
        }
        return producto;
    }

    //-----------------------------------------EJERCICIO 3---------------------------------------
    //Crear una función que calcule la transpuesta de una matriz.
    public static int[][] matrizTranspuesta(int[][] matriz, int filas, int columnas) {
        int i, j;
        int[][] matrizT = new int[filas][columnas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        return matrizT;
    }

    //-----------------------------------------EJERCICIO 4---------------------------------------
    //Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta)
    public static boolean matrizProductoSimetrica(int[][] matriz, int filas, int columnas) {
        if (filas != columnas) {
            return false;
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //-----------------------------------------EJERCICIO 5---------------------------------------
    //Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.
    public static double[] productoEscalar(int[] vector, double escalar) {
        int n = vector.length;
        double[] producto = new double[n];
        for (int i = 0; i < n; i++) {
            producto[i] = vector[i] * escalar;
        }
        return producto;
    }

    //-----------------------------------------EJERCICIO 6---------------------------------------
    //Implementar una función que calcule la suma de todos los elementos de una matriz.
    public static int sumaDeUnaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma = suma + matriz[i][j];
            }
        }
        return suma;
    }

    //-----------------------------------------EJERCICIO 7---------------------------------------
    //Desarrollar un método para encontrar el elemento máximo en una matriz y su posición.
    public static void maximoDeUnaMatriz(int[][] matriz) {
        int maximo = matriz[0][0];
        int indice = 0;
        int indice2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    indice2 = indice;
                }
                indice = indice + 1;
            }
        }
        System.out.println("El elemento máximo de la matriz es:  " + maximo);
        System.out.println("Y la posición del elemento es: " + indice2);
    }

    //-----------------------------------------EJERCICIO 8---------------------------------------
    //Crear una función que devuelva la suma de una fila específica de una matriz.
    public static int sumaDeUnaFila(int fila, int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[fila][i];
        }
        return suma;
    }

    //-----------------------------------------EJERCICIO 9---------------------------------------
    //Implementar una función que determine si una matriz es diagonal (todos los elementos fuera de la diagonal
    //principal son cero).
    public static boolean matrizDiagonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar si la matriz no es cuadrada
        if (filas != columnas) {
            return false;
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Los elementos fuera de la diagonal principal deben ser cero
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        // Si no se encontraron elementos distintos de cero fuera de la diagonal principal, es una matriz diagonal
        return true;
    }

    //-----------------------------------------EJERCICIO 10---------------------------------------
    //Crear una función que genere una matriz identidad de tamaño n.
    public static int[][] identidadDeUnaMatriz(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    //-----------------------------------------EJERCICIO 11---------------------------------------
    //Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
    public static int[] contadorParesEImparesDeUnaMatriz(int[][] matriz) {
        int pares = 0, impares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        return new int[]{pares, impares};
    }

    //-----------------------------------------EJERCICIO 12---------------------------------------
    //Implementar una función que rote una matriz 90 grados en sentido horario.
    public static int[][] girarMatriz90Grados(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizGirada = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                matrizGirada[j][filas - 1 - i] = matriz[i][j];
            }
        }
        return matrizGirada;
    }

    //-----------------------------------------EJERCICIO 13---------------------------------------
    //Desarrollar un método para encontrar el número de veces que aparece un valor específico en una matriz.
    public static int encontrarOcurrenciasEnUnaMatriz(int[][] matriz, int numero) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == numero) {
                    contador += 1;
                }
            }
        }
        return contador;
    }

    //-----------------------------------------EJERCICIO 14---------------------------------------
    //Crear una función que invierta el orden de las filas en una matriz.
    public static Integer[][] invertirFilasDeUnaMatriz(Integer[][] matrizAInvertida) {
        for (int i = 0; i < matrizAInvertida.length; i++) {
            int izquierda = 0;
            int derecha = matrizAInvertida[i].length - 1;
            while (izquierda < derecha) {
                Integer temp = matrizAInvertida[i][izquierda];
                matrizAInvertida[i][izquierda] = matrizAInvertida[i][derecha];
                matrizAInvertida[i][derecha] = temp;
                izquierda++;
                derecha--;
            }
        }
        return matrizAInvertida;
    }

    //-----------------------------------------EJERCICIO 15---------------------------------------
    //Escribir un método para sumar todas las diagonales de una matriz cuadrada.
    public static int diagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int diagonalInv(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }

    //-----------------------------------------EJERCICIO 16---------------------------------------
    //Implementar una función que verifique si una matriz es ortogonal (su transpuesta es igual a su inversa).
    public static boolean esMatrizOrtogonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar si la matriz no es cuadrada
        if (filas != columnas) {
            return false;
        }

        // Calcular la transpuesta de la matriz
        int[][] transpuesta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        // Calcular la inversa de la matriz
        int[][] inversa = new int[filas][columnas];
        // Puedes implementar la lógica para calcular la inversa aquí, o utilizar una librería de álgebra lineal si es necesario

        // Verificar si la transpuesta es igual a la inversa
        if (Arrays.deepEquals(transpuesta, inversa)) {
            return true;
        }

        return false;
    }

    //-----------------------------------------EJERCICIO 17---------------------------------------
    //Desarrollar un método para encontrar el valor mínimo en cada fila de una matriz y devolverlos en un arreglo.
    public static ArrayList<Integer> obtenerMaximosPorFila(int[][] matriz) {
        ArrayList<Integer> maximos = new ArrayList<>();
        for (int i = 0; i < matriz.length; i++) {
            int maximoFila = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximoFila) {
                    maximoFila = matriz[i][j];
                }
            }
            maximos.add(maximoFila);
        }
        return maximos;
    }

    //-----------------------------------------EJERCICIO 18---------------------------------------
    //Crear una función que calcule el producto de matrices de diferentes tamaños, si es posible; de lo contrario,
    //devolver una matriz nula.
    public static int[][] productoDeMatricesIrregulares(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        // Verificar si las dimensiones son compatibles para la multiplicación
        if (columnasA != filasB) {
            System.out.println("No se puede calcular el producto de matrices. Dimensiones incompatibles.");
            return null; // Devuelve una matriz nula
        }

        // Crear la matriz resultante
        int[][] resultado = new int[filasA][columnasB];

        // Calcular el producto de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int producto = 0;
                for (int k = 0; k < columnasA; k++) {
                    producto += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = producto;
            }
        }

        return resultado;
    }

    //-----------------------------------------------CLASE PRINCIPAL---------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //-----------------------------------------EJERCICIO 1---------------------------------------
        //Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
        int[][] matrizA = {{1, 2, 3}, {1, 2, 3,}};
        int[][] matrizB = {{1, 2, 3}, {1, 2, 3,}};
        int[][] resultado = sumarDosMatrices(matrizA, matrizB);
        System.out.println("Resultado de la suma de dos matrices: ");
        System.out.println(Arrays.deepToString(resultado));

        //-----------------------------------------EJERCICIO 2---------------------------------------
        //Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.
        int[][] firstMatriz = {{5, 6, 8}, {9, 7, 3}};
        int[][] secondMatriz = {{5, 3}, {2, 1}, {5, 8}};
        int[][] result = multiplicarMatrices(firstMatriz, secondMatriz);
        System.out.println("Matriz producto resultante de dos matrices:  ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j] + " ");
            }
        }

        //-----------------------------------------EJERCICIO 3---------------------------------------
        //Crear una función que calcule la transpuesta de una matriz.
        int filas = 3;
        int columnas = 3;
        int[][] matriz = new int[filas][columnas];
        int i, j;
        System.out.println("Obtener la matriz transpuesta:  ");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.println("Ingresar el valor en la posicion " + i + "," + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIZ ORIGINAL: ");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int transpuesta[][] = matrizTranspuesta(matriz, filas, columnas);
        System.out.println("MATRIZ TRANSPUESTA: ");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

        //-----------------------------------------EJERCICIO 4---------------------------------------
        //Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta)
        filas = 3;
        columnas = 3;
        matriz = new int[][]{{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        if (matrizProductoSimetrica(matriz, filas, columnas)) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }

        //-----------------------------------------EJERCICIO 5---------------------------------------
        //Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.
        int[] vector = {1, 2, 3, 4};
        System.out.println("Calcular el producto escalar: ");
        System.out.println("Ingresa un valor:");
        double number = sc.nextDouble();

        double[] result2 = productoEscalar(vector, number);

        //Mostramos por pantalla el resultado
        for (i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

        //-----------------------------------------EJERCICIO 6---------------------------------------
        //Implementar una función que calcule la suma de todos los elementos de una matriz.
        matriz = new int[3][3];
        int total = 0;
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        System.out.println("Suma total de los elementos de la matriz: " + sumaDeUnaMatriz(matriz));

        //-----------------------------------------EJERCICIO 7---------------------------------------
        //Desarrollar un método para encontrar el elemento máximo en una matriz y su posición.
        matriz = new int[3][3];

        total = 0;

        matriz[0][0] = 9;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 11;
        maximoDeUnaMatriz(matriz);

        //-----------------------------------------EJERCICIO 8---------------------------------------
        //Crear una función que devuelva la suma de una fila específica de una matriz.
        matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row, suma;
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("¿Que fila de números desea sumar?(1, 2 o 3)");
        row = sc.nextInt() - 1;
        suma = sumaDeUnaFila(row, matriz);

        System.out.println("Resultado de la suma de la fila elegida: " + suma);

        //-----------------------------------------EJERCICIO 9---------------------------------------
        //Implementar una función que determine si una matriz es diagonal (todos los elementos fuera de la diagonal
        //principal son cero).
        int[][] matrizDiagonal = {
                {2, 0, 0},
                {0, 5, 0},
                {0, 0, 9}
        };

        int[][] matrizNoDiagonal = {
                {2, 0, 1},
                {0, 5, 0},
                {0, 0, 9}
        };

        boolean esDiagonal1 = matrizDiagonal(matrizDiagonal);
        boolean esDiagonal2 = matrizDiagonal(matrizNoDiagonal);

        System.out.println("La primera matriz es diagonal: " + esDiagonal1);
        System.out.println("La segunda matriz es diagonal: " + esDiagonal2);


        //-----------------------------------------EJERCICIO 10---------------------------------------
        //Crear una función que genere una matriz identidad de tamaño n.

        int n = 3;
        int[][] matrix = identidadDeUnaMatriz(n);
        System.out.println("Matriz obtenida: ");
        for (int m = 0; m < 3; m++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matrix[m][j]);
            }
            System.out.println();
        }

        //-----------------------------------------EJERCICIO 11---------------------------------------
        //Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
        matriz = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };

        int[] counts = contadorParesEImparesDeUnaMatriz(matriz);

        System.out.println("Números pares: " + counts[0] + " Números impares: " + counts[1]);

        //-----------------------------------------EJERCICIO 12---------------------------------------
        //Implementar una función que rote una matriz 90 grados en sentido horario.
        matriz = new int[][]{{1, 2, 3}, {4, 5, 5}, {9, 8, 6}};
        filas = matriz.length;
        columnas = matriz[0].length;

        System.out.println("Matriz original: ");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < filas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz girada 90 grados: ");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < filas; j++) {
                System.out.print(girarMatriz90Grados(matriz)[i][j] + " ");
            }
            System.out.println();
        }

        //-----------------------------------------EJERCICIO 13---------------------------------------
        //Desarrollar un método para encontrar el número de veces que aparece un valor específico en una matriz.
        matriz = new int[][]{{1, 2, 3}, {4, 5, 5}, {9, 8, 6}};
        int encontrar = 5;
        System.out.println("El numero " + encontrar + " aparece " + encontrarOcurrenciasEnUnaMatriz(matriz, encontrar) + " veces en la matriz");

        //-----------------------------------------EJERCICIO 14---------------------------------------
        //Crear una función que invierta el orden de las filas en una matriz.
        Integer[][] matrizNoInv = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Integer[][] matrizInv = new Integer[3][3];
        matrizInv = invertirFilasDeUnaMatriz(matrizNoInv);
        System.out.println(Arrays.deepToString(matrizInv));

        //-----------------------------------------EJERCICIO 15---------------------------------------
        //Escribir un método para sumar todas las diagonales de una matriz cuadrada.
        int[][] matrizNormal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumaDiagonal = diagonal(matrizNormal), sumaDiagonalInv = diagonalInv(matrizNormal);
        int totalSum = sumaDiagonal + sumaDiagonalInv;
        System.out.println("La suma de la diagonal es: " + sumaDiagonal);
        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInv);
        System.out.println("La suma de las 2 diagonales es: " + totalSum);

        //-----------------------------------------EJERCICIO 16---------------------------------------
        //Implementar una función que verifique si una matriz es ortogonal (su transpuesta es igual a su inversa).
        int[][] matrizOrtogonal = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] matrizNoOrtogonal = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        };

        boolean esOrtogonal1 = esMatrizOrtogonal(matrizOrtogonal);
        boolean esOrtogonal2 = esMatrizOrtogonal(matrizNoOrtogonal);

        System.out.println("La primera matriz es ortogonal: " + esOrtogonal1);
        System.out.println("La segunda matriz es ortogonal: " + esOrtogonal2);
        //-----------------------------------------EJERCICIO 17---------------------------------------
        //Desarrollar un método para encontrar el valor mínimo en cada fila de una matriz y devolverlos en un arreglo.
        matriz = new int[][]{
                {1, 2, 3},
                {4, 5, 6}};

        ArrayList<Integer> maximosPorFila = obtenerMaximosPorFila(matriz);

        //Mostramos el resultado por pantalla

        System.out.println("Maximo por fila: " + maximosPorFila);

        //-----------------------------------------EJERCICIO 18---------------------------------------
        //Crear una función que calcule el producto de matrices de diferentes tamaños, si es posible; de lo contrario,
        //devolver una matriz nula.
        matrizA = new int[][]{
                {2, 3},
                {4, 5}
        };

        matrizB = new int[][]{
                {6, 7},
                {8, 9}
        };

        resultado = productoDeMatricesIrregulares(matrizA, matrizB);

        if (resultado != null) {
            System.out.println("Resultado del producto de matrices:");
            System.out.println(Arrays.deepToString(resultado));
        }
    }

}

