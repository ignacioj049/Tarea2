package org.example;
import java.util.ArrayList;
/** Esta clase representa el departamento al que
 *  pertenece cada empleado de la empresa*/
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;

    /** Constructor de la clase Departamento
     * @param nombre empleado*/
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    /** Obtiene el nombre del empleado
     * @return nombre*/
    public String getNombre() {
        return nombre;
    }

    /** Método que obtiene la cantidad de empleados
     * @return el numero de empleados*/
    public int getNumeroEmpleados() {
        return empleados.size();
    }

    /** Método para añadir empleados a la reunión*/
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Devuelve una lista de empleados.
     * Crea y retorna una nueva lista que contiene los empleados actuales.
     *
     * @return Una nueva lista con los empleados.
     */
    public ArrayList<Empleado> getEmpleados() {
        // Retorna una nueva instancia de ArrayList con los empleados actuales
        return new ArrayList<>(empleados);
    }

    /**
     * Establece el nombre del objeto.
     *
     * @param nombre El nuevo nombre que se asignará.
     */
    public void setNombre(String nombre) {
        // Asigna el valor de 'nombre' al atributo de la clase
        this.nombre = nombre;
    }

    /**
     * Retorna una representación en formato de cadena del objeto.
     * La cadena incluye el nombre y el número de empleados.
     *
     * @return Una cadena en formato "nombre (n empleados)".
     */
    @Override
    public String toString() {
        // Retorna una cadena que concatena el nombre y el tamaño de la lista de empleados
        return nombre + " (" + empleados.size() + " empleados)";
    }
}