package Ejerciciodostreshospital;

public class Hospital {

    private String nombre;
    private Departamento departamento;
    private inventarioEquipos inventario;


    public Hospital(String nombre, Departamento departamento, inventarioEquipos inventario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public inventarioEquipos getInventario() {
        return inventario;
    }
}

