package Ejerciciodostreshospital;

// Clase principal Hospital
public class Hospital {


    // Atributos universales
    private String nombre;
    private String departamento;
    private String medico;
    private String paciente;
    private String equipo;
    private String expediente;

    // Constructor
    public Hospital() {
        this.nombre = nombre;
        this.departamento = "Cardiologia";
        this.medico = "Dr. Perez";
        this.paciente = "Juan Lopez";
        this.equipo = "Electrocardiografo";
        this.expediente = "Historia clínica #001";
    }



    // Uso los metodos get y set para los diferentes atributos.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento; }

    public void setMedico(String medico) {
        this.medico = medico; }

    public String getMedico() {
        return medico; }

    public void setPaciente(String paciente) {
        this.paciente = paciente; }


    public String getPaciente() {
        return paciente; }

    public void setEquipo(String equipo) {
        this.equipo = equipo; }

    public String getEquipo() {
        return equipo; }

    public void setExpediente(String expediente) {
        this.expediente = expediente; }


    public String getExpediente() {
        return expediente; }
}
