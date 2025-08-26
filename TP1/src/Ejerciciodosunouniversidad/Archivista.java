package Ejerciciodosunouniversidad;
// hereda de la clase EmpleadoBiblioteca
public class Archivista extends EmpleadoBiblioteca {
    public Archivista(String nombre, int edad) { // hereda atributos de empleado
        super(nombre, edad);  // atributos de la superclase Empleado
    }
}
