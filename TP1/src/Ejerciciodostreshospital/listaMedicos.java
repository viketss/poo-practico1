package Ejerciciodostreshospital;

public class listaMedicos {
    private Medico medico1;
    private Medico medico2;

    public listaMedicos(Medico medico1, Medico medico2) {
        this.medico1 = medico1;
        this.medico2 = medico2;
    }

    public Medico getMedico1() {
        return medico1;
    }

    public Medico getMedico2() {
        return medico2;
    }
}
