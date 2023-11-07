package trabajoPractico10;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    //Constructor Perro
    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }


    //Crea un método en la clase Perro llamado ladrar que imprima "Guau, guau" en la consola.
    public void ladrar(){
        System.out.println("Guau guau");
    }
}
