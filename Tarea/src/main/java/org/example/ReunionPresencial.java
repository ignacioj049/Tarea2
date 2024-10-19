package org.example;
import java.time.LocalDateTime;

public class ReunionPresencial extends Reunion {
    private String sala;

    public ReunionPresencial(TipoReunion tipo, LocalDateTime fecha, Empleado organizador, String sala) {
        super(tipo, fecha, organizador);
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return super.toString() + " (presencial) en sala: " + sala;
    }
}
