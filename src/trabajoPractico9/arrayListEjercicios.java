package trabajoPractico9;

import com.sun.source.tree.ArrayAccessTree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class arrayListEjercicios {
    public static void main(String[] args) {
        //-----------------------------------------EJERCICIO 1---------------------------------------
        //Crea un ArrayList de números enteros y agrega 5 números a la lista.
        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
        numerosEnteros.add(1);
        numerosEnteros.add(2);
        numerosEnteros.add(3);
        numerosEnteros.add(4);
        numerosEnteros.add(5);

        //-----------------------------------------EJERCICIO 2---------------------------------------
        //Crea un ArrayList de cadenas y agrega 3 nombres a la lista.
        ArrayList<String> arrayListNombres = new ArrayList<String>();
        arrayListNombres.add("Oscaar");
        arrayListNombres.add("Maria");
        arrayListNombres.add("Lucrecia");

        //-----------------------------------------EJERCICIO 3---------------------------------------
        //Imprime todos los elementos de un ArrayList de enteros.
        System.out.print("Elementos del arrayList de números enteros: ");
        for (Integer i : numerosEnteros) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");

        //-----------------------------------------EJERCICIO 4---------------------------------------
        //Encuentra la longitud (número de elementos) de un ArrayList de caracteres.
        ArrayList<Character> arrayListCaracteres = new ArrayList<Character>();
        arrayListCaracteres.add('f');
        arrayListCaracteres.add('s');
        arrayListCaracteres.add('o');
        System.out.println("Longitud del arrayList de caracteres: " + arrayListCaracteres.size());

        //-----------------------------------------EJERCICIO 5---------------------------------------
        //Elimina un elemento específico de un ArrayList de cadenas.
        arrayListCaracteres.remove(2);
        System.out.print("Elementos del arrayList de caracteres: ");
        for (Character i : arrayListCaracteres) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");

        //-----------------------------------------EJERCICIO 6---------------------------------------
        //Comprueba si un ArrayList de números enteros está vacío
        if (numerosEnteros.isEmpty()) {
            System.out.println("El arrayList de números enteros está vacío");
        } else {
            System.out.println("El arrayList de números enteros no está vacío");
        }

        //-----------------------------------------EJERCICIO 7---------------------------------------
        //Encuentra el elemento más grande en un ArrayList de números.
        Integer elMayor = 0;
        for (Integer i : numerosEnteros) {
            if (i > elMayor) {
                elMayor = i;
            }
        }
        System.out.println("El número mayor es: " + elMayor);

        //-----------------------------------------EJERCICIO 8---------------------------------------
        //Copia todos los elementos de un ArrayList en otro ArrayList nuevo.
        ArrayList<Character> arrayListCaracteresCopia = new ArrayList<Character>();
        arrayListCaracteresCopia.addAll(arrayListCaracteres);
        System.out.print("Elementos del arrayList de caracteres copiado: ");
        for (Character i : arrayListCaracteresCopia) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");

        //-----------------------------------------EJERCICIO 9---------------------------------------
        //Invierte un ArrayList de enteros (el primer elemento se convierte en el último y viceversa).
        ArrayList<Integer> numerosEnteros2 = new ArrayList<Integer>();

        numerosEnteros2.add(1);
        numerosEnteros2.add(2);
        numerosEnteros2.add(3);
        System.out.println("ArrayList: " + numerosEnteros2);
        Collections.reverse(numerosEnteros2);
        System.out.println("ArayList invertida: " + numerosEnteros2);

        //-----------------------------------------EJERCICIO 10---------------------------------------
        //Combina dos ArrayLists de enteros en uno solo.
        ArrayList<Integer> numerosEnteros3 = new ArrayList<Integer>();
        ArrayList<Integer> numeroEnterosResultantes = new ArrayList<Integer>();
        numerosEnteros3.add(4);
        numerosEnteros3.add(5);
        numerosEnteros3.add(6);
        Collections.reverse(numerosEnteros2);
        numeroEnterosResultantes.addAll(numerosEnteros2);
        numeroEnterosResultantes.addAll(numerosEnteros3);
        System.out.println("ArrayList resultante: " + numeroEnterosResultantes);

        //-----------------------------------------EJERCICIO 11---------------------------------------
        //Crea un ArrayList de números enteros y elimina todos los elementos pares
        numeroEnterosResultantes.removeIf(b -> b % 2 == 0);
        System.out.println("arrayList sin numeros pares: " + numeroEnterosResultantes);

        //-----------------------------------------EJERCICIO 12---------------------------------------
        //Busca un elemento específico en un ArrayList de cadenas y devuelve su índice.
        if (arrayListNombres.contains("Oscaar")){
            System.out.println("El elemento se encuentra en el arrayList");
        }else {
            System.out.println("El elemento no se encuentra en el arrayList");
        }

        //-----------------------------------------EJERCICIO 13---------------------------------------
        //Comprueba si dos ArrayLists son iguales (tienen los mismos elementos en el mismo orden)
        ArrayList<Integer> numerosEnteros5 = new ArrayList<Integer>();
        numerosEnteros5.add(1);
        numerosEnteros5.add(3);
        numerosEnteros5.add(5);
        int contador = 0;
        for (Integer x:numeroEnterosResultantes) {
            if (numerosEnteros5.contains(x)){
                contador+=1;
            }
        }
        if (contador == (numeroEnterosResultantes.size())){
            System.out.println("El segundo arrayList está contenido dentro del primero");
        } else {
            System.out.println("El segundo arrayList no está contenido dentro del primero");

        }

        //-----------------------------------------EJERCICIO 14---------------------------------------
        //Encuentra el elemento más pequeño en un ArrayList de números.
        Integer elMenor = 10;
        for (Integer y: numerosEnteros2){
            if(y < elMenor){
                elMenor = y;
            }
        }
        System.out.println("ArrayList: "+ numerosEnteros2);
        System.out.println("El elemento más pequeño es: " + elMenor);

        //-----------------------------------------EJERCICIO 15---------------------------------------
        //Crea un ArrayList de números enteros y suma todos los elementos
        Integer suma = 0;
        for(Integer r: numerosEnteros2){
            suma+= r;
        }
        System.out.println("ArrayList: " + numerosEnteros2);
        System.out.println("Suma de sus números: " + suma);

        //-----------------------------------------EJERCICIO 16---------------------------------------
        //Crea un ArrayList de cadenas y concatena todas las cadenas en una sola.
        String concatenacionCadena = "";
        for (String t: arrayListNombres){
            concatenacionCadena+=t;
        }
        System.out.println("ArrayList: " + arrayListNombres);
        System.out.println("Concatenación: " + concatenacionCadena);

        //-----------------------------------------EJERCICIO 17---------------------------------------
        //Elimina todos los elementos duplicados de un ArrayList de cadenas.

        ArrayList<String> palabrasSinDuplicados = new ArrayList<>();
        arrayListNombres.add("Lucrecia");
        arrayListNombres.add("Lucrecia");

        // Iterar sobre el ArrayList original para eliminar duplicados
        for (String palabra : arrayListNombres) {
            if (!palabrasSinDuplicados.contains(palabra)) {
                palabrasSinDuplicados.add(palabra);
            }
        }

        // Imprimir el ArrayList original y el ArrayList sin duplicados
        System.out.println("ArrayList original: " + arrayListNombres);
        System.out.println("ArrayList sin duplicados: " + palabrasSinDuplicados);
        //-----------------------------------------EJERCICIO 18---------------------------------------
        //Crea un ArrayList de enteros y encuentra la suma de los elementos en índices pares.
        Integer sumaDeNumerosPares = 0;
        numeroEnterosResultantes.add(8);
        numeroEnterosResultantes.add(2);
        numeroEnterosResultantes.add(4);
        for (Integer q: numeroEnterosResultantes) {
            if(q%2==0){
                sumaDeNumerosPares += q;
            }
        }

        System.out.println("ArrayList:" + numeroEnterosResultantes);
        System.out.println("Suma de los números pares: " + sumaDeNumerosPares);

        //-----------------------------------------EJERCICIO 19---------------------------------------
        //Comprueba si un ArrayList de enteros contiene un número específico
        System.out.println(numerosEnteros2.contains(1));

        //-----------------------------------------EJERCICIO 20---------------------------------------
        //Encuentra el elemento en un ArrayList de cadenas que tiene la longitud más larga.
        ArrayList<String> arrayListLargo = new ArrayList<String>();
        arrayListLargo.add("elementos");
        arrayListLargo.add("oftanmología");
        arrayListLargo.add("ensalada de fruta");
        String mayorLongitud = "";
        for(String t: arrayListLargo){
            if (t.length() > mayorLongitud.length() ){
                mayorLongitud = t;
            }
        }

        System.out.println("Elemento de mayor longitud: " + mayorLongitud);

        //-----------------------------------------EJERCICIO 21---------------------------------------
        //Encuentra el promedio de todos los elementos en un ArrayList de números enteros.
        Integer total = 0;

        for(Integer r: numerosEnteros5){
            total+= r;
        }

        Float promedio = (float) (total/numerosEnteros5.size());

        System.out.println("ArrayList: " + numerosEnteros5);
        System.out.println("Suma de sus números: " + promedio);

        //-----------------------------------------EJERCICIO 22---------------------------------------
        //Crea un ArrayList de enteros y ordénalo de forma ascendente.
        numerosEnteros5.add(2);
        System.out.println("ArrayList:" + numerosEnteros5);
        Collections.sort(numerosEnteros5);
        System.out.println("ArrayList ordenado:" + numerosEnteros5);

        //-----------------------------------------EJERCICIO 23---------------------------------------
        //Crea un ArrayList de números enteros y elimina todos los elementos mayores que un valor específico.
        System.out.println("ArrayList:" + numerosEnteros5);
        numerosEnteros5.removeIf(b -> b > 2);
        System.out.println("ArrayList:" + numerosEnteros5);

        //-----------------------------------------EJERCICIO 24---------------------------------------
        //Encuentra la cantidad de veces que un elemento específico aparece en un ArrayList de cadenas.
        System.out.println("ArrayList: " + arrayListLargo);
        String elementoBuscado = "elementos";

        // Contar la cantidad de veces que aparece el elemento
        int cantidad = Collections.frequency(arrayListLargo, elementoBuscado);

        // Imprimir el resultado
        System.out.println("La palabra '" + elementoBuscado + "' aparece " + cantidad + " veces en el ArrayList.");

        //-----------------------------------------EJERCICIO 25---------------------------------------
        //Crea un ArrayList de cadenas y ordena las cadenas alfabéticamente.
        System.out.println("ArrayList: " + arrayListLargo);
        Collections.sort(arrayListLargo);
        System.out.println("ArrayList: " + arrayListLargo);

    }

}
