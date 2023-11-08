package trabajoPractico11;

import java.util.ArrayList;
import java.util.Scanner;

public class Factura {
    //-----------------------------------------EJERCICIO 3---------------------------------------
    private int numeroDeFactura;
    private String fechaDeEmision;
    private String cliente;
    private ArrayList<String> articulos;
    private float precioUnitario;
    private int cantidad;
    private float subtotal;
    private float iva;
    private float total;

    //La clase debe tener los siguientes métodos:
    //Constructor: Un constructor que inicializa los atributos de la factura.
    public Factura(int numeroDeFactura,String fechaDeEmision,String cliente, String articulos, float precioUnitario, int cantidad, float subtotal, float iva, float total){
        this.numeroDeFactura = numeroDeFactura;
        this.fechaDeEmision = fechaDeEmision;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;

    }
    //Agregar artículo: Un método que agrega un artículo a la factura.
    public void agregarArticulo(String articulo) {
        articulos.add(articulo);
        System.out.println(articulo + " ha sido agregado a la plantilla.");
    }
    
    //Calcular subtotal: Un método que calcula el subtotal de la factura.
    public float calcularSubtotal() {
        Scanner sc = new Scanner(System.in);
        float valor = 0;
        for (String h:this.articulos) {
            System.out.println("Ingrese el valor:");
            valor += sc.nextFloat();
            
        }
        return valor;
    }
    //Calcular IVA: Un método que calcula el IVA de la factura.
    public float calcularIva(){
        this.iva = this.subtotal * this.iva;
        return this.iva;
    }
    //Calcular total: Un método que calcula el total de la factura
    public float calcularTotal(){
        this.total = this.subtotal + this.iva;
        return this.total;
    }
}
