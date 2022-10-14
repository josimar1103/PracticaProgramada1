package practicaprogramada3;

import javax.swing.JOptionPane;

public class objectAlumnos {

    public String nombreAlu;
    public int edadAlu;
    public int grado;
    public String generoAlu;
    public int cedulaAlu;
    public String direccionAlu;
    public int telefonoAlu;
    public int horario;
    public String nacionalidadAlu;
    public int nacimientoAlu;

    public void agregarAlumno() {
        nombreAlu = JOptionPane.showInputDialog("Ingrese el nombre del alumno:");

        String cedulaAluLectura = JOptionPane.showInputDialog("Ingrese la cédula:");
        cedulaAlu = Integer.parseInt(cedulaAluLectura);

        String edadAluLectura = JOptionPane.showInputDialog("Ingrese la edad:");
        edadAlu = Integer.parseInt(edadAluLectura);

        generoAlu = JOptionPane.showInputDialog("Ingrese el genero:");

        String nacimientoAluLectura = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento:");
        nacimientoAlu = Integer.parseInt(nacimientoAluLectura);

        nacionalidadAlu = JOptionPane.showInputDialog("Ingrese la nacionalidad:");

        direccionAlu = JOptionPane.showInputDialog("Ingrese la dirección:");

        String telefonoAluLectura = JOptionPane.showInputDialog("Ingrese telefono:");
        telefonoAlu = Integer.parseInt(telefonoAluLectura);

        String gradoLectura = JOptionPane.showInputDialog("Ingrese grado a cursar:");
        grado = Integer.parseInt(gradoLectura);

    }

    public void mostrarAlumno() {
        JOptionPane.showInternalMessageDialog(null, "Nombre:" + nombreAlu);
        JOptionPane.showInternalMessageDialog(null, "Cédula:" + cedulaAlu);
        JOptionPane.showInternalMessageDialog(null, "Edad:" + edadAlu);
        JOptionPane.showInternalMessageDialog(null, "Genero:" + generoAlu);
        JOptionPane.showInternalMessageDialog(null, "Fecha de nacimiento" + nacimientoAlu);
        JOptionPane.showInternalMessageDialog(null, "Nacionalidad:" + nacionalidadAlu);
        JOptionPane.showInternalMessageDialog(null, "Direccion:" + direccionAlu);
        JOptionPane.showInternalMessageDialog(null, "Numero de teléfono:" + telefonoAlu);
        JOptionPane.showInternalMessageDialog(null, "Grado a matricular:" + grado);

    }

    public void eliminarAlumno() {

    }

    public static void asignarGrupo() {

    }

    public static void agregarHorario() {

    }

    public static void asignarAnno() {

    }

    public static void asignarMateria() {

    }

}
