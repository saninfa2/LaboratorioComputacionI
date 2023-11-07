package trabajoPractico10;

public class Rectangulo {
    //Crea una clase Rectángulo con atributos de ancho y alto y métodos para
    //calcular su área y perímetro.
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto){
        this.alto = alto;
        this.ancho = ancho;
    }

    public double calcularArea(){
        double area = this.ancho * this.alto;
        return area;
    }

    public double calcularPer(){
        double per = (this.alto + this.ancho)*2;
        return per;
    }
}
