package Ejerciciodosunouniversidad;

public class EmpleadoBiblioteca {
    private String nombre;
    private int edad;

    // CONSTRUCTOR
    public EmpleadoBiblioteca(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTER
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
