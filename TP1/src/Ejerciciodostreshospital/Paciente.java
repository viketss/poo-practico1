package Ejerciciodostreshospital;

public class Paciente {
    private String nombre;
    private listaExpedientes expedientes;


    public Paciente(String nombre, listaExpedientes expedientes) {
        this.nombre = nombre;
        this.expedientes = expedientes;
    }

    public String getNombre() {
        return nombre;
    }

    public listaExpedientes getExpedientes() {
        return expedientes;
    }
}
