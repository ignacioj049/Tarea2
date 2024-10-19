package org.example;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleados() {
        return empleados.size();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }

    @Override
    public String toString() {
        return nombre + " (" + empleados.size() + " empleados)";
    }
}

