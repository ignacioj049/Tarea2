package org.example;
import java.time.LocalDateTime;

/**
 * La clase ReunionPresencial es una subclase de la clase Reunion, que representa una reunión que se lleva a cabo de manera presencial en una sala específica.
 */
public class ReunionPresencial extends Reunion {
    /** Sala donde se realiza la reunión*/
    private String sala;

    /**
     * Constructor de la clase ReunionPresencial.
     *
     * @param tipo El tipo de la reunión (presencial).
     * @param fecha La fecha en la que se llevará a cabo la reunión.
     * @param organizador El empleado que organiza la reunión.
     * @param sala La sala donde se llevará a cabo la reunión.
     */
    public ReunionPresencial(TipoReunion tipo, LocalDateTime fecha, Empleado organizador, String sala) {
        super(tipo, fecha, organizador);
        this.sala = sala;
    }

    /**
     * Devuelve el nombre de la sala donde se realiza la reunión presencial.
     *
     * @return El nombre de la sala.
     */
    public String getSala() {
        return sala;
    }

    /**
     * Establece el nombre de la sala donde se llevará a cabo la reunión.
     *
     * @param sala El nombre de la sala.
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * Devuelve una representación en formato de cadena de la reunión presencial, incluyendo detalles de la sala.
     *
     * @return Una cadena que describe la reunión, indicando que es presencial y especificando la sala.
     */
    @Override
    public String toString() {
        return super.toString() + " (presencial) en sala: " + sala;
    }
}