package Ejerciciodosdoszoologico;

// Clase abstracta porque la dieta puede ser
// carnívora, herbívora u omnívora
public abstract class Dieta {
    private String tipo;

    public Dieta(String tipo) {
        this.tipo = tipo;
    }
}
