package trabajoPractico10;

public class Libro {
    //Crea una clase Libro con atributos como título, autor y año de publicación.
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //Implementa un método en la clase Libro que permita mostrar la información del
    //libro en la consola.

    @Override
    public String toString() {
        return "Titulo del libro: " + this.titulo + "\n" + "Autor: " + this.autor + "\n" + "Año de publicación: " + this.anioPublicacion;
    }
}
