package trabajoPractico9;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayListEjercicios {
    public static void main(String[] args) {
        //Crea un ArrayList de números enteros y agrega 5 números a la lista.
        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
        numerosEnteros.add(1);
        numerosEnteros.add(2);
        numerosEnteros.add(3);
        numerosEnteros.add(4);
        numerosEnteros.add(5);

        //Crea un ArrayList de cadenas y agrega 3 nombres a la lista.
        ArrayList<String> arrayListNombres = new ArrayList<String>();
        arrayListNombres.add("Oscaar");
        arrayListNombres.add("Maria");
        arrayListNombres.add("Lucrecia");

        //Imprime todos los elementos de un ArrayList de enteros.
        System.out.print("Elementos del arrayList de números enteros: ");
        for (Integer i : numerosEnteros) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");

        //Encuentra la longitud (número de elementos) de un ArrayList de caracteres.
        ArrayList<Character> arrayListCaracteres = new ArrayList<Character>();
        arrayListCaracteres.add('f');
        arrayListCaracteres.add('s');
        arrayListCaracteres.add('o');
        System.out.println("Longitud del arrayList de caracteres: " + arrayListCaracteres.size());

        //Elimina un elemento específico de un ArrayList de cadenas.
        arrayListCaracteres.remove(2);
        System.out.print("Elementos del arrayList de caracteres: ");
        for (Character i : arrayListCaracteres) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");


        //Comprueba si un ArrayList de números enteros está vacío
        if (numerosEnteros.isEmpty()) {
            System.out.println("El arrayList de números enteros está vacío");
        } else {
            System.out.println("El arrayList de números enteros no está vacío");
        }

        //Encuentra el elemento más grande en un ArrayList de números.
        Integer elMayor = 0;
        for (Integer i : numerosEnteros) {
            if (i > elMayor) {
                elMayor = i;
            }
        }
        System.out.println("El número mayor es: " + elMayor);

        //Copia todos los elementos de un ArrayList en otro ArrayList nuevo.
        ArrayList<Character> arrayListCaracteresCopia = new ArrayList<Character>();
        arrayListCaracteresCopia.addAll(arrayListCaracteres);
        System.out.print("Elementos del arrayList de caracteres copiado: ");
        for (Character i : arrayListCaracteresCopia) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");

        //Invierte un ArrayList de enteros (el primer elemento se convierte en el último y viceversa).
        ArrayList<Integer> numerosEnterosInvertidos = new ArrayList<Integer>();
        Integer p = (numerosEnteros.size() - 1);
        for (Integer i : numerosEnterosInvertidos) {
            numerosEnterosInvertidos.add(numerosEnteros.get(p));
            p -= 1;

        }
        System.out.print("ArrayList de números enteros invertido: " );
        for (Integer m : numerosEnterosInvertidos) {
            System.out.print(m + ", ");
        }
        System.out.println(" ");

        //
    }
}
