package Ejerciciodostreshospital;

public class HospitalApp {
    public static void main(String[] args) {
        // Crear pacientes
        Paciente paciente1 = new Paciente("Juan Pérez");
        Paciente paciente2 = new Paciente("Ana López");

        // Crear expedientes para cada paciente
        Expediente exp1 = new Expediente("Consulta general - Juan");
        Expediente exp2 = new Expediente("Electrocardiograma - Juan");
        ListaExpedientes listaExpedientesJuan = new ListaExpedientes(exp1, exp2);

        Expediente exp3 = new Expediente("Consulta pediátrica - Ana");
        Expediente exp4 = new Expediente("Vacunación - Ana");
        ListaExpedientes listaExpedientesAna = new ListaExpedientes(exp3, exp4);

        // Crear médicos
        ListaPaciente listaPacientes = new ListaPaciente(paciente1, paciente2);
        Medico medico1 = new Medico("Dr. Rodríguez", "Cardiología", listaPacientes);
        Medico medico2 = new Medico("Dra. Martínez", "Pediatría", listaPacientes);

        // Crear listas de médicos para los pacientes
        ListaMedicos listaMedicosJuan = new ListaMedicos(medico1, medico2); // Juan atendido por ambos
        ListaMedicos listaMedicosAna = new ListaMedicos(medico2, medico1); // Ana también atendida por ambos

        // Vincular médicos y expedientes a los pacientes
        paciente1.getMedicos().add(listaMedicosJuan);
        paciente1.getExpedientes().add(listaExpedientesJuan);

        paciente2.getMedicos().add(listaMedicosAna);
        paciente2.getExpedientes().add(listaExpedientesAna);

        // Crear equipos e inventario
        Equipo equipo1 = new Equipo(1001);
        Equipo equipo2 = new Equipo(1002);
        InventarioEquipos inventario = new InventarioEquipos();

        // Crear departamentos
        Departamento cardiologia = new Departamento("Cardiología", equipo1, inventario);
        Departamento pediatria = new Departamento("Pediatría", equipo2, inventario);

        // Crear hospital
        Hospital hospital = new Hospital("Hospital Central", inventario);

        // Mostrar relaciones
        System.out.println("Hospital: " + hospital.getNombre());
        System.out.println("Paciente 1: " + paciente1.getNombre());
        System.out.println("  Expedientes: " + exp1.getDescripcion() + ", " + exp2.getDescripcion());
        System.out.println("  Médicos: " + medico1.getNombre() + " (" + medico1.getEspecialidad() + "), "
                + medico2.getNombre() + " (" + medico2.getEspecialidad() + ")");
        System.out.println("Paciente 2: " + paciente2.getNombre());
        System.out.println("  Expedientes: " + exp3.getDescripcion() + ", " + exp4.getDescripcion());
        System.out.println("  Médicos: " + medico2.getNombre() + " (" + medico2.getEspecialidad() + "), "
                + medico1.getNombre() + " (" + medico1.getEspecialidad() + ")");
    }
}