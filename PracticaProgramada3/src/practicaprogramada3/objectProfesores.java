package practicaprogramada3;

import javax.swing.JOptionPane;

public class objectProfesores {

    public String nombreProfesor;
    public int edadProfesor = 0;
    public String especialidad;
    public String genero;
    public int cedulaProfesor = 0;
    public String direccion;
    public int salario;
    public int horario;
    public String nacionalidad;
    public int fechaNacimiento;
    public int telefono;
    
    public void prueba(){
        
    }

    public static void agregarProfesor() {

        nombreProfesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor:");

        String edadProfesorLectura = JOptionPane.showInputDialog("Ingrese la edad:");
        edadProfesor = Integer.parseInt(edadProfesorLectura);

        especialidad = JOptionPane.showInputDialog("Ingrese la especialidad:");

        genero = JOptionPane.showInputDialog("Ingrese el genero:");

        String cedulaProfesorLectura = JOptionPane.showInputDialog("Ingrese la cédula:");
        cedulaProfesor = Integer.parseInt(cedulaProfesorLectura);

        direccion = JOptionPane.showInputDialog("Ingrese la dirección:");

        String salarioLectura = JOptionPane.showInputDialog("Ingrese el Salario:");
        salario = Integer.parseInt(salarioLectura);

        nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad:");

        String fechaNacimientoLectura = JOptionPane.showInputDialog("Ingrese la fecha de nacimeinto:");
        fechaNacimiento = Integer.parseInt(fechaNacimientoLectura);

        String telefonoLectura = JOptionPane.showInputDialog("Ingrese telefono:");
        telefono = Integer.parseInt(telefonoLectura);

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
