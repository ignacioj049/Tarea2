package org.example;

/**
 * La enumeración EstadoAsistencia representa los posibles estados de asistencia
 * de una persona en un evento o actividad.
 *
 * Los valores posibles son:
 * <ul>
 *   <li>{@code PRESENTE} - Indica que la persona está presente.</li>
 *   <li>{@code AUSENTE} - Indica que la persona está ausente.</li>
 *   <li>{@code TARDE} - Indica que la persona llegó tarde.</li>
 * </ul>
 */
public enum EstadoAsistencia {

    /** Estado que indica que la persona está presente. */
    PRESENTE,

    /** Estado que indica que la persona está ausente. */
    AUSENTE,

    /** Estado que indica que la persona llegó tarde. */
    TARDE;
}


