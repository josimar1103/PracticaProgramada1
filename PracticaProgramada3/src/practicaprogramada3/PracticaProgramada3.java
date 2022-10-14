package practicaprogramada3;

public class PracticaProgramada3 {

    public static void main(String[] args) {
        objectProfesores profesor1 = new objectProfesores();

        profesor1.agregarProfesor();
        profesor1.mostrarProfesor();
        
        objectAlumnos alumno1 = new objectAlumnos();
        
        alumno1.agregarAlumno();
        alumno1.mostrarAlumno();
        
        objectCursos curso1 = new objectCursos();
        
        curso1.agregarCurso();
        curso1.mostrarCurso();
        
        objectMateriales materiales1 = new objectMateriales();
        
        materiales1.agregarMateriales();
        materiales1.mostrarMateriales();
        
        objectFactura factura1 = new objectFactura();
        
        factura1.crearFactura();
        factura1.mostrarFactura();

    }

}
