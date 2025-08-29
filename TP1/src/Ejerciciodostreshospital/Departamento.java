package Ejerciciodostreshospital;

public class Departamento {
    private String nombre;
    private listaMedicos medicos;
    private Equipo equipo;


    public Departamento(String nombre, listaMedicos medicos, Equipo equipo) {
        this.nombre = nombre;
        this.medicos = medicos;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public listaMedicos getMedicos() {
        return medicos;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}



