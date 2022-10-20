package practicaprogramada4;

import javax.swing.JOptionPane;

public class objectCuentaBancaria {
    
    //Se asignan las variables
    public int numeroCuenta;
    public int cedula;
    public int deposito;
    public int saldo = 0;
    public int saldoActual = saldo + deposito;
    public int tasaInteres;
    public int retiro;
    public int interes;
    
    
    //Se crean el metodo de lectura de la cuenta
    public void leerCuenta() {
        String numeroCuentaLectura = JOptionPane.showInputDialog("Ingrese el numero de cuenta:");
        numeroCuenta = Integer.parseInt(numeroCuentaLectura);

        String cedulaLectura = JOptionPane.showInputDialog("Ingrese el numero de cédula:");
        cedula = Integer.parseInt(cedulaLectura);
    }
    
    //Se crea el metodo de llamado de la cuenta
    public void mostrarCuenta() {
        JOptionPane.showInternalMessageDialog(null, "El número de cuenta es:" + numeroCuenta);
        System.out.println("El número de cuenta es:" + numeroCuenta);
        JOptionPane.showInternalMessageDialog(null, "La cédula es:" + cedula);
        System.out.println("La cédula es:" + cedula);

    }
    
    //Se crea el metodo de lectura del deposito
    public void deposito() {
        String depositoLectura = JOptionPane.showInputDialog("Ingrese el monto a depositar:");
        deposito = Integer.parseInt(depositoLectura);

    }

    //Se crea el metodo de llamado del deposito
    public void mostrarDeposito() {
        JOptionPane.showInternalMessageDialog(null, "Su deposito fue de:" + deposito);
        System.out.println("Su deposito fue de:" + deposito);
    }

    //Se crea el metodo de lectura de retiros
    public void retiro() {
        String retiroLectura = JOptionPane.showInputDialog("Ingrese el monto a retirar:");
        retiro = Integer.parseInt(retiroLectura);

    }

    //Se crea el metodo de llamado de retiros
    public void mostrarRetiro() {
        if (retiro < saldoActual + deposito) {
            JOptionPane.showInternalMessageDialog(null, "El retiro fue de:" + retiro);
            System.out.println("El retiro fue de:" + retiro);
        }
    }

    //Se crea el metodo de llamado del saldo actual con y sin intereses
    public void mostrarSaldoActual() {
        saldoActual = deposito - retiro;
        tasaInteres = (int) ((saldoActual/100)*6);
        interes = tasaInteres + saldoActual;
        JOptionPane.showInternalMessageDialog(null, "Su saldo actual es de:" + saldoActual);
        System.out.println("Su saldo actual es de:" + saldoActual);
        JOptionPane.showInternalMessageDialog(null, "Su tasa de interes es de: 6%");
        System.out.println("Su tasa de interes es de: 6%");
        JOptionPane.showInternalMessageDialog(null, "Su saldo actual con intereses es de:" + interes);
        System.out.println("Su saldo actual con intereses es de:" + interes);
        
    }

}
