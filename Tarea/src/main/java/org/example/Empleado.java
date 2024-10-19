package org.example;
public class Empleado {
    private String id;
    private String nombre;
    private String apellidos;
    private String correo;
    private Departamento departamento;

    public Empleado(String id, String nombre, String apellidos, String correo, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.departamento = departamento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + correo + ")";
    }
}
