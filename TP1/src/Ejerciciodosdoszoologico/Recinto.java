package Ejerciciodosdoszoologico;

public class Recinto {
    // Nombre del recinto (ej: selva, sabana, etc.)
    private String nombre;
    // Cada recinto tiene animales
    private Animal animal;

    // Constructor del recinto
    public Recinto(String nombre, Animal animal) {
        this.nombre = nombre;
        this.animal = animal;
    }
}
