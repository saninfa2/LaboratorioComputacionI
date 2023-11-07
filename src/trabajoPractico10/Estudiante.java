package trabajoPractico10;

public class Estudiante {
    //Crea una clase Estudiante con atributos como nombre, edad y
    // número de identificación.
    private String nombre;
    private String nId;
    private int edad;

    public Estudiante() {

    }

    //Define un constructor para la clase Estudiante que permita inicializar sus atributos al crear un objeto.
    public Estudiante(String nombre, String nId, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.nId = nId;

    }
}
