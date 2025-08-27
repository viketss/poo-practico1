package Ejerciciodosdoszoologico;

public class Zoologico {
    // Nombre del zoológico
    private String nombre;
    // Un zoológico tiene recintos
    private Recinto recinto;

    // Constructor del zoológico
    public Zoologico(String nombre, Recinto recinto) {
        this.nombre = nombre;
        this.recinto = recinto;
    }
}
