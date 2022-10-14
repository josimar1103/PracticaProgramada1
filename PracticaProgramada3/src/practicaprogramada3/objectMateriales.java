package practicaprogramada3;

import javax.swing.JOptionPane;

public class objectMateriales {

    public String libros;
    public int cantidadLapices;
    public String tipoLapices;
    public String tipoCuaderno;
    public String programas;

    public void agregarMateriales() {
        libros = JOptionPane.showInputDialog("Ingrese el nombre del libro:");

        String cantidadLapicesLectura = JOptionPane.showInputDialog("Ingrese la cantidad de lapices:");
        cantidadLapices = Integer.parseInt(cantidadLapicesLectura);

        tipoLapices = JOptionPane.showInputDialog("Ingrese el tipo de lapices:");

        tipoCuaderno = JOptionPane.showInputDialog("Ingrese el tipo de cuaderno:");

        programas = JOptionPane.showInputDialog("Ingrese el programa a utilizar:");

    }

    public void mostrarMateriales() {
        JOptionPane.showInternalMessageDialog(null, "El libro a utilizar es:" + libros);
        JOptionPane.showInternalMessageDialog(null, "El tipo de lapices a utilizar son:" + tipoLapices);
        JOptionPane.showInternalMessageDialog(null, "El tipo de cuaderno a utilizar es:" + tipoCuaderno);
        JOptionPane.showInternalMessageDialog(null, "El programa a utilizar es:" + programas);
    }

    public void materialEscritura() {

    }

    public void tipoCuadernos() {

    }

    public void programas() {

    }

}
