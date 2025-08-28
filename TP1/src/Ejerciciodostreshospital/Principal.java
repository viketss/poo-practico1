package Ejerciciodostreshospital;

public class Principal {

    public static void main(String[] args) {
        Hospital elHospital = new Hospital();

        System.out.println("Nombre: " + elHospital.getNombre());
        System.out.println("Departamento: " + elHospital.getDepartamento());
        System.out.println("Medico: " + elHospital.getMedico());
        System.out.println("Paciente: " + elHospital.getPaciente());
        System.out.println("Equipo: " + elHospital.getEquipo());
        System.out.println("Expediente: " + elHospital.getExpediente());

    }


}
