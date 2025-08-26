package Ejerciciodosunouniversidad;
// COMPOSICION: la biblioteca no puede existir sin la universidad
public class Biblioteca {
    private String nombre;
    private int cantidadLibros;
    private Libro libro; // agregacion: libros de clase Libro
    private EmpleadoBiblioteca empleado; // agregacion: empleado de la biblioteca (clase EmpleadoBiblioteca)

    // CONSTRUCTOR
    public Biblioteca(String nombre, int cantidadLibros, Libro libro, EmpleadoBiblioteca empleado) {
        this.nombre = nombre;
        this.cantidadLibros = cantidadLibros;
        this.libro = libro;
        this.empleado = empleado;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }
    public int getCantidadLibros() {
        return cantidadLibros;
    }
    public Libro getLibro() {
        return libro;
    }
    public EmpleadoBiblioteca getEmpleado() {
        return empleado;
    }
}
