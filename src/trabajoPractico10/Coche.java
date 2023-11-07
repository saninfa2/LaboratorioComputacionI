package trabajoPractico10;

public class Coche {
    //Crea una clase Coche con atributos como marca, modelo y año de fabricación.
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Coche(String marca, String modelo, int anioFabricacion){
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
        this.modelo = modelo;
    }
    //Define un método en la clase Coche que permita acelerar el coche y otro para frenar.
    public void frenar(double velocidad){
        String respuesta;
        if (velocidad > 0){
            System.out.println("El coche se detuvo");
        } else {
            System.out.println("El coche ya esta detenido");
        }
    }

    public void acelerar(double velocidad){
        velocidad += 10;
        System.out.println(velocidad);
    }
}
