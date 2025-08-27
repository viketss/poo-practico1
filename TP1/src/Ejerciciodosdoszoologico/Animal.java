package Ejerciciodosdoszoologico;

// Clase abstracta porque no existe "un animal" genérico
// Siempre va a ser mamífero, ave o reptil
public abstract class Animal {
    // Nombre del animal
    private String nombre;
    // Cada animal tiene una dieta
    private Dieta dieta;

    // Constructor del animal
    public Animal(String nombre, Dieta dieta) {
        this.nombre = nombre;
        this.dieta = dieta;
    }
}
