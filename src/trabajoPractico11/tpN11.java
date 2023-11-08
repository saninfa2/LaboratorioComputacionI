package trabajoPractico11;

import java.util.ArrayList;
import java.util.Scanner;

public class tpN11 {
    //-----------------------------------------EJERCICIO 1---------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //-----------------------------------------EJERCICIO 1---------------------------------------
        //Diseñar un programa que lea y guarde marcas de Autos en un ArrayList de tipo
        //String. El programa pedirá una marca de Auto en un bucle, el mismo se guardará
        //en la lista y después se le preguntará al usuario si quiere guardar otro Auto o si
        //quiere salir. Si decide salir, se mostrará todos los autos guardados en el ArrayList
        System.out.println("Bienvenido al registro de Marcas de auto ✨");

        //Inicializacion de variables
        String respuesta = "";
        ArrayList<String> arrayListMarcasAutos = new ArrayList<String>();
        String nuevaMarca;
        while (!respuesta.equals("2")) {
            System.out.println("Ingrese la operacion que desee realizar:");
            System.out.println("1) Ingresar una nueva marca     2)Salir");
            respuesta = sc.next();
            if (respuesta.equals("1")) {
                System.out.println("Ingrese una marca de auto: ");
                nuevaMarca = sc.next();
                arrayListMarcasAutos.add(nuevaMarca);
            } else if (respuesta.equals("2")) {
                break;
            } else {
                System.out.println("Opción inválida");
            }
        }
        System.out.println("Marcas ingresadas: " +  arrayListMarcasAutos);

        //-----------------------------------------EJERCICIO 2---------------------------------------
        //Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una lista de jugadores.
        //La clase debe permitir agregar nuevos jugadores, eliminar jugadores y listar la plantilla.
        // Ejemplo de uso de la clase EquipoDeFútbol
        EquipoDeFutbol futbol = new EquipoDeFutbol();

        // Agregar jugadores
        futbol.agregarJugador("Lionel Messi");
        futbol.agregarJugador("Cristiano Ronaldo");
        futbol.agregarJugador("Neymar");

        // Listar la plantilla
        futbol.listarPlantilla();

        // Eliminar un jugador
        futbol.eliminarJugador("Cristiano Ronaldo");

        // Listar la plantilla después de eliminar un jugador
        futbol.listarPlantilla();


    }





}
