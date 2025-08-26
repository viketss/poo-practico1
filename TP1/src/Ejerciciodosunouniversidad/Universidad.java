package Ejerciciodosunouniversidad;
// SISTEMA GESTION DE BIBLIOTECA UNIVERSITARIA
public class Universidad {
    // ATRIBUTOS
    private String nombre; // nombre de la universidad
    private Facultad facultad; // composicion: se crea la facultad dentro de la universidad (clase Facultad)
    private int cantidadAlumnos;
    private Biblioteca biblioteca; // composicion: se crea la biblioteca dentro de la universidad

    // CONSTRUCTOR
    public Universidad(String nombre) {
        this.nombre = nombre;

        Departamento dpto = new Departamento("POO"); // crear departamento
        // la facultad se crea cuando se crea la universidad
        this.facultad = new Facultad("Ciencias Exactas", dpto);

        // la biblioteca se crea cuando se crea la universidad
        Libro librito = new Libro("Los juegos del hambre"); // crear libro
        EmpleadoBiblioteca empleadito = new EmpleadoBiblioteca("Simon", 26);
        this.biblioteca = new Biblioteca("Biblioteca UADE", 36000, librito, empleadito);
    }

}
