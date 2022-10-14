package practicaprogramada3;

import javax.swing.JOptionPane;

public class objectProfesores {

    public String nombreProf;
    public int edadProf = 0;
    public String especialidad;
    public String generoProf;
    public int cedulaProf = 0;
    public String direccionProf;
    public int salario;
    public int horario;
    public String nacionalidadProf;
    public int fechaNacimientoProf;
    public int telefonoProf;

    public void agregarProfesor() {

        nombreProf = JOptionPane.showInputDialog("Ingrese el nombre del profesor:");

        String cedulaProfLectura = JOptionPane.showInputDialog("Ingrese la cédula:");
        cedulaProf = Integer.parseInt(cedulaProfLectura);

        String edadProfLectura = JOptionPane.showInputDialog("Ingrese la edad:");
        edadProf = Integer.parseInt(edadProfLectura);

        generoProf = JOptionPane.showInputDialog("Ingrese el genero:");

        String fechaNacimientoProfLectura = JOptionPane.showInputDialog("Ingrese la fecha de nacimeinto:");
        fechaNacimientoProf = Integer.parseInt(fechaNacimientoProfLectura);

        nacionalidadProf = JOptionPane.showInputDialog("Ingrese la nacionalidad:");

        especialidad = JOptionPane.showInputDialog("Ingrese la especialidad:");

        direccionProf = JOptionPane.showInputDialog("Ingrese la dirección:");

        String telefonoProfLectura = JOptionPane.showInputDialog("Ingrese telefono:");
        telefonoProf = Integer.parseInt(telefonoProfLectura);

        String salarioLectura = JOptionPane.showInputDialog("Ingrese el Salario:");
        salario = Integer.parseInt(salarioLectura);

    }

    public void mostrarProfesor() {
        JOptionPane.showInternalMessageDialog(null, "Nombre del Profesor:" + nombreProf);
        JOptionPane.showInternalMessageDialog(null, "Cédula:" + cedulaProf);
        JOptionPane.showInternalMessageDialog(null, "Edad:" + edadProf);
        JOptionPane.showInternalMessageDialog(null, "Genero:" + generoProf);
        JOptionPane.showInternalMessageDialog(null, "Fecha de nacimiento:" + fechaNacimientoProf);
        JOptionPane.showInternalMessageDialog(null, "Nacionalidad:" + nacionalidadProf);
        JOptionPane.showInternalMessageDialog(null, "Especialidad:" + especialidad);
        JOptionPane.showInternalMessageDialog(null, "Dirección:" + direccionProf);
        JOptionPane.showInternalMessageDialog(null, "Telefono:" + telefonoProf);
        JOptionPane.showInternalMessageDialog(null, "Salario" + salario);

    }

    public void eliminarProfesor() {

    }

    public void asignarGrupo() {

    }

    public void agregarSalario() {

    }

    public void asignarHorario() {

    }

    public void asignarMateria() {

    }

}
