package trabajoPractico10;

public class mainTP10 {
    public static void main(String[] args) {
        //IMPLEMENTACIÓN DE CLASE PERRO
        //Crea un método en la clase Perro llamado ladrar que imprima "Guau, guau" en la consola.
        Perro perro1 = new Perro("Joji", "corgi", 5);
        perro1.ladrar();

        //IMPLEMENTACIÓN DE CLASE CIRCULO
        //Crea un objeto de la clase Círculo y calcula su área y circunferencia.
        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.calcular_area());
        System.out.println(circulo1.calcular_circunferencia());

        //IMPLEMENTACIÓN DE CLASE ESTUDIANTE
        Estudiante estudiante1 = new Estudiante("Oscar Rodriguez", "ID0012", 19);

        //IMPLEMENTACIÓN DE CLASE LIBRO
        //Implementa un método en la clase Libro que permita mostrar la información del libro en la consola.
        Libro libro = new Libro("Alicia en el país de las maravillas", "Jane Cruger", 1998);
        System.out.println(libro.toString());

        //IMPLEMENTACIÓN DE CLASE CUENTA BANCARIA
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(2000, 933234);
        cuentaBancaria1.retirar(120);
        cuentaBancaria1.depositar(230);

        //IMPLEMENTACIÓN DE CLASE RECTANGULO
        Rectangulo rectangulo1 = new Rectangulo(10, 11.2);
        System.out.println(rectangulo1.calcularArea());
        System.out.println(rectangulo1.calcularPer());

        //IMPLEMENTACIÓN DE CLASE COCHE
        Coche coche1 = new Coche("Max Stells", "MS1212", 2002);
        double velocidad = 100;
        coche1.acelerar(velocidad);
        coche1.frenar(velocidad);

        //IMPLEMENTACIÓN DE CLASE PELÍCULA
        Pelicula pelicula1 = new Pelicula("Alicia a través del espejo", "Steve Universe", 320);
        System.out.println(pelicula1.toString());

    }
}
