package trabajoPractico10;

public class Circulo {
    //Crea una clase Círculo con un atributo de radio y métodos para calcular su
    // área y circunferencia.
    private float radio;

    //Metodo constructor
    public Circulo(float radio){
        this.radio = radio;
    }

    public double calcular_area(){
        double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }

    public double calcular_circunferencia(){
        double circunferencia = (Math.PI * radio)/2;
        return circunferencia;
    }
}
