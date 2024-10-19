package org.example;
import java.time.LocalDateTime;

public class ReunionVirtual extends Reunion {
    private String enlace;

    public ReunionVirtual(TipoReunion tipo, LocalDateTime fecha, Empleado organizador, String enlace) {
        super(tipo, fecha, organizador);
        this.enlace = enlace;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return super.toString() + " (virtual) en enlace: " + enlace;
    }
}


