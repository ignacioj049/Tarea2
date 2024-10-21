package org.example;
/**
 * La clase Empleado representa un empleado dentro de una organización.
 * Incluye información básica como id, nombre, apellidos, correo y departamento.
 */
public class Empleado {
    /** Identificador único del empleado. */
    private int id;
    /** Nombre del empleado. */
    private String nombre;
    /** Apellidos del empleado*/
    private String apellidos;
    /** Correo electrónico del empleado*/
    private String correo;
    /** Departamento al que pertenece el empleado*/
    private Departamento departamento;

    /**
     * Constructor para crear un nuevo empleado.
     *
     * @param id El identificador único del empleado.
     * @param nombre El nombre del empleado.
     * @param apellidos Los apellidos del empleado.
     * @param correo El correo electrónico del empleado.
     * @param departamento El departamento al que pertenece el empleado.
     */
    public Empleado(int id, String nombre, String apellidos, String correo, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.departamento = departamento;
    }

    /**
     * Devuelve el identificador único del empleado.
     *
     * @return El id del empleado.
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve los apellidos del empleado.
     *
     * @return Los apellidos del empleado.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Devuelve el correo electrónico del empleado.
     *
     * @return El correo del empleado.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Devuelve el departamento al que pertenece el empleado.
     *
     * @return El departamento del empleado.
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Establece el identificador único del empleado.
     *
     * @param id El nuevo id del empleado.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece los apellidos del empleado.
     *
     * @param apellidos Los nuevos apellidos del empleado.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Establece el correo electrónico del empleado.
     *
     * @param correo El nuevo correo del empleado.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Establece el departamento al que pertenece el empleado.
     *
     * @param departamento El nuevo departamento del empleado.
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Devuelve una representación en formato de cadena del empleado.
     * Incluye el nombre, apellidos y el correo electrónico.
     *
     * @return Una cadena en formato "nombre apellidos (correo)".
     */
    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + correo + ")";
    }
}