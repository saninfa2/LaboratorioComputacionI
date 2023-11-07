package trabajoPractico10;

public class Pelicula {
    //Crea una clase Película con atributos como título, director y duración en minutos.
    //Implementa un método para mostrar la información de la película.
    private String titulo;
    private String director;
    private float duracion;

    public  Pelicula(String titulo, String director, float duracion){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + "\n" + "Director: " + this.director + "\n" +  "Duración en minutos: " + this.duracion;
    }
}
