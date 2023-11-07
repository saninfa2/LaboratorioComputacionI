package trabajoPractico10;

public class CuentaBancaria {
    private float saldo;
    private int nCuenta;

    //Crea una clase CuentaBancaria con atributos como saldo y número de cuenta
    public CuentaBancaria(float saldo, int nCuenta){
        this.saldo = saldo;
        this.nCuenta = nCuenta;
    }

    //Define métodos para depositar y retirar dinero de la cuenta.
    public void depositar(float saldo){
        this.saldo += saldo;
        System.out.println("Deposito realizado");
    }

    public void retirar(float saldo){
        String respuesta;
        if (saldo < this.saldo){
            this.saldo -= saldo;
            System.out.println("Retiro exitoso");
        }else {
            System.out.println("Retido denegado, no puedes retirar más de tu saldo actual");
        }
    }
}
