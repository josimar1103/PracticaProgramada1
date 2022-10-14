package practicaprogramada3;

import javax.swing.JOptionPane;

public class objectCursos {

    public String nombreCurso;
    public int grupo;
    public int horarios;
    public int codigoCurso;
    public int cantidadAlumnos;
    public int aula;
    public String modalidad;

    public void agregarCurso() {
        nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso");

        String grupoLectura = JOptionPane.showInputDialog("Ingrese número del grupo:");
        grupo = Integer.parseInt(grupoLectura);

        String horariosLectura = JOptionPane.showInputDialog("Ingrese el horario:");
        horarios = Integer.parseInt(horariosLectura);

        String codigoCursoLectura = JOptionPane.showInputDialog("Ingrese el código");
        codigoCurso = Integer.parseInt(codigoCursoLectura);

        String cantidadAlumnosLectura = JOptionPane.showInputDialog("Ingrese cantidad alumnos");
        cantidadAlumnos = Integer.parseInt(cantidadAlumnosLectura);

        String aulaLectura = JOptionPane.showInputDialog("Ingrese el número de aula:");
        aula = Integer.parseInt(aulaLectura);

        modalidad = JOptionPane.showInputDialog("Ingrese la modalidad del curso:");

    }

    public void mostrarCurso() {
        JOptionPane.showInternalMessageDialog(null, "Nombre del curso:"+ nombreCurso);
        JOptionPane.showInternalMessageDialog(null, "Grupo asignado:"+ grupo);
        JOptionPane.showInternalMessageDialog(null, "Horarios disponibles:"+ horarios);
        JOptionPane.showInternalMessageDialog(null, "Codigo del curso:"+ codigoCurso);
        JOptionPane.showInternalMessageDialog(null, "Cantidad de alumnos:"+ cantidadAlumnos);
        JOptionPane.showInternalMessageDialog(null, "Aula asignada:"+ aula);
        JOptionPane.showInternalMessageDialog(null, "Modalidad disponible:"+ modalidad);

    }

    public void agregarHorario() {

    }

    public void asignarAula() {

    }

    public void asignarModalidad() {

    }

    public void asignarGrupo() {

    }

    public void eliminarCurso() {

    }
}
