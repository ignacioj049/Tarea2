package org.example;
import java.time.LocalDateTime;
/**
 * La clase ReunionVirtual es una subclase de la clase Reunion que representa una reunión virtual con un enlace para acceder a la misma.
 */
public class ReunionVirtual extends Reunion {
    /** Enlace de acceso a la reunión virtual*/
    private String enlace;

    /**
     * Constructor de la clase ReunionVirtual.
     *
     * @param tipo El tipo de la reunión (virtual).
     * @param fecha La fecha en que se llevará a cabo la reunión.
     * @param organizador El empleado que organiza la reunión.
     * @param enlace El enlace para acceder a la reunión virtual.
     */
    public ReunionVirtual(TipoReunion tipo, LocalDateTime fecha, Empleado organizador, String enlace) {
        super(tipo, fecha, organizador);
        this.enlace = enlace;
    }

    /**
     * Devuelve el enlace de la reunión virtual.
     *
     * @return El enlace para acceder a la reunión virtual.
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Establece el enlace de la reunión virtual.
     *
     * @param enlace El enlace para acceder a la reunión virtual.
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    /**
     * Devuelve una representación en formato de cadena de la reunión virtual, incluyendo el enlace de acceso.
     *
     * @return Una cadena que describe la reunión, indicando que es virtual e incluyendo el enlace.
     */
    @Override
    public String toString() {
        return super.toString() + " (virtual) en enlace: " + enlace;
    }
}