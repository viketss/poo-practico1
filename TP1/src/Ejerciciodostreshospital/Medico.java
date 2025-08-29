package Ejerciciodostreshospital;

public class Medico {
    private String nombre;
    private String especialidad;
    private listaPaciente pacientes;


    public Medico(String nombre, String especialidad, listaPaciente pacientes) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public listaPaciente getPacientes() {
        return pacientes;
    }
}
