package trabajoPractico11;

import java.util.ArrayList;

public class EquipoDeFutbol {
    //-----------------------------------------EJERCICIO 2---------------------------------------
    private ArrayList<String> plantilla;

    public EquipoDeFutbol() {
        // Constructor para inicializar la plantilla
        this.plantilla = new ArrayList<>();
    }

    // Método para agregar un nuevo jugador a la plantilla
    public void agregarJugador(String nombreJugador) {
        plantilla.add(nombreJugador);
        System.out.println(nombreJugador + " ha sido agregado a la plantilla.");
    }

    // Método para eliminar un jugador de la plantilla
    public void eliminarJugador(String nombreJugador) {
        if (plantilla.contains(nombreJugador)) {
            plantilla.remove(nombreJugador);
            System.out.println(nombreJugador + " ha sido eliminado de la plantilla.");
        } else {
            System.out.println(nombreJugador + " no se encuentra en la plantilla.");
        }
    }

    // Método para listar la plantilla
    public void listarPlantilla() {
        System.out.println("Plantilla del equipo:");
        for (String jugador : plantilla) {
            System.out.println(jugador);
        }
    }
}
