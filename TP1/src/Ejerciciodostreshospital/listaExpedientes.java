package Ejerciciodostreshospital;

public class listaExpedientes {
    private Expediente expediente1;
    private Expediente expediente2;


    public listaExpedientes(Expediente expediente1, Expediente expediente2) {
        this.expediente1 = expediente1;
        this.expediente2 = expediente2;
    }

    public Expediente getExpediente1() {
        return expediente1;
    }

    public Expediente getExpediente2() {
        return expediente2;
    }
}
