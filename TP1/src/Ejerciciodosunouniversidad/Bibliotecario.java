package Ejerciciodosunouniversidad;
// hereda de la clase EmpleadoBiblioteca
public class Bibliotecario extends EmpleadoBiblioteca {

    public Bibliotecario(String nombre, int edad) { // hereda atributos de empleado
        super(nombre, edad); // atributos de la superclase Empleado
    }
}
