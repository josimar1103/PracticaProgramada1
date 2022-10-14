package practicaprogramada3;

import javax.swing.JOptionPane;

public class objectFactura {

    public String metodoPago;
    public String contado;
    public String credito;
    public int descuento;
    public int factura;
    public int beca;
    public int impuesto;
    public int total;
    public int subtotal;

    public void crearFactura() {
        String facturaLectura = JOptionPane.showInputDialog("Ingrese el numero de factura:");
        factura = Integer.parseInt(facturaLectura);

        metodoPago = JOptionPane.showInputDialog("Ingrese el metodo de pago:");

        contado = JOptionPane.showInputDialog("Paga de contado:");

        credito = JOptionPane.showInputDialog("Va requerir credito:");

        String descuentoLectura = JOptionPane.showInputDialog("Pocentaje de descuento:");
        descuento = Integer.parseInt(descuentoLectura);

        String becaLectura = JOptionPane.showInputDialog("Ingrese el porcentaje de la beca:");
        beca = Integer.parseInt(becaLectura);

    }

    public void mostrarFactura() {
        JOptionPane.showInternalMessageDialog(null, "Su numero de factura es:" + factura);
        JOptionPane.showInternalMessageDialog(null, "Su metodo de pago es:" + metodoPago);
        JOptionPane.showInternalMessageDialog(null, "Requiere credito:" + credito);
        JOptionPane.showInternalMessageDialog(null, "Realiza el pago de contado:" + contado);
        JOptionPane.showInternalMessageDialog(null, "Su porcentaje de descuento es:" + descuento);
        JOptionPane.showInternalMessageDialog(null, "Su porcentaje de beca es:" + beca);

    }

    public void descuento() {

    }

    public void montoMateriales() {

    }

}
