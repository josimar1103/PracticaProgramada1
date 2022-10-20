package practicaprogramada4;

public class Practicaprogramada4 {

    public static void main(String[] args) {

        System.out.println("Bienvenido a su Banco El Cinquito");

        objectCuentaBancaria cliente1 = new objectCuentaBancaria();

        cliente1.leerCuenta();
        cliente1.mostrarCuenta();
        cliente1.deposito();
        cliente1.mostrarDeposito();
        cliente1.retiro();
        cliente1.mostrarSaldoActual();

    }

}
