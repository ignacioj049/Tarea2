package org.example;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reunion {
    private TipoReunion tipo;
    private LocalDateTime fecha;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private ArrayList<Empleado> invitados;
    private Empleado organizador;
    private ArrayList<String> notas;
    private ArrayList<Empleado> presentes;
    private ArrayList<Empleado> ausentes;
    private ArrayList<Empleado> tarde;

    public Reunion(TipoReunion tipo, LocalDateTime fecha, Empleado organizador) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.organizador = organizador;
        this.invitados = new ArrayList<>();
        this.notas = new ArrayList<>();
        this.presentes = new ArrayList<>();
        this.ausentes = new ArrayList<>();
        this.tarde = new ArrayList<>();
    }

    public void agregarInvitado(Empleado invitado) {
        invitados.add(invitado);
    }

    public void agregarNota(String nota) {
        notas.add(nota);
    }

    public void marcarAsistencia(Empleado empleado, boolean llegaTarde) {
        if (invitados.contains(empleado) && !presentes.contains(empleado)) {
            presentes.add(empleado);
            if (llegaTarde) {
                tarde.add(empleado);
            }
        }
    }

    public void marcarAusencia(Empleado empleado) {
        if (invitados.contains(empleado) && !ausentes.contains(empleado)) {
            ausentes.add(empleado);
        }
    }

    public void invitarDepartamento(Departamento dept) {
        invitados.addAll(dept.getEmpleados());
    }

    public void iniciarReunion() {
        this.horaInicio = LocalDateTime.now();
    }

    public void finalizarReunion() {
        this.horaFin = LocalDateTime.now();
    }

    public long calcularDuracionReunion() {
        if (horaInicio != null && horaFin != null) {
            return java.time.Duration.between(horaInicio, horaFin).toMinutes();
        }
        return 0;
    }

    public double calcularPorcentajeAsistencia() {
        if (invitados.isEmpty()) {
            return 0.0;
        }
        return (double) presentes.size() / invitados.size() * 100;
    }

    public TipoReunion getTipo() {
        return tipo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public ArrayList<Empleado> getInvitados() {
        return new ArrayList<>(invitados);
    }

    public Empleado getOrganizador() {
        return organizador;
    }

    public ArrayList<String> getNotas() {
        return new ArrayList<>(notas);
    }

    public ArrayList<Empleado> getPresentes() {
        return new ArrayList<>(presentes);
    }

    public ArrayList<Empleado> getAusentes() {
        return new ArrayList<>(ausentes);
    }

    public ArrayList<Empleado> getTarde() {
        return new ArrayList<>(tarde);
    }

    public void setTipo(TipoReunion tipo) {
        this.tipo = tipo;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public void setOrganizador(Empleado organizador) {
        this.organizador = organizador;
    }


    @Override
    public String toString() {
        return "Reunion de tipo " + tipo + " organizada por " + organizador.getNombre() +
                " con fecha " + fecha.toString();
    }
}

