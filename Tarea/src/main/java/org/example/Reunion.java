package org.example;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * La clase Reunion representa una reunión que puede ser de distintos tipos (virtual o presencial).
 * Incluye detalles sobre la fecha, el organizador, los participantes (invitados, presentes, ausentes, y tarde),
 * y notas asociadas a la reunión. También permite calcular la duración y el porcentaje de asistencia.
 */
public class Reunion {

    /** Tipo de la reunión(virtual o presencial)*/
    private TipoReunion tipo;
    /** Fecha de la reunión*/
    private LocalDateTime fecha;
    /** Hora de inicio de la reunión*/
    private LocalDateTime horaInicio;
    /** Hora fin de la reunión*/
    private LocalDateTime horaFin;
    /** Lista de empleados invitados a la reunión*/
    private ArrayList<Empleado> invitados;
    /** Empleado que organiza la reunión*/
    private Empleado organizador;
    /** Lista de notas asociadas a la reunión*/
    private ArrayList<String> notas;
    /** Lista de empleados presentes en la reunión*/
    private ArrayList<Empleado> presentes;
    /** Lista de empleados ausentes en la reunión*/
    private ArrayList<Empleado> ausentes;
    /** Lista de empleados que llegaron tarde a la reunión*/
    private ArrayList<Empleado> tarde;

    /**  Constructor de la clase Reunion.
     *
     * @param tipo El tipo de la reunión (virtual o presencial).
     * @param fecha La fecha de la reunión.
     * @param organizador El organizador de la reunión.
     */
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

    /**
     * Agrega un empleado a la lista de invitados.
     *
     * @param invitado El empleado a invitar.
     */
    public void agregarInvitado(Empleado invitado) {
        if (!invitados.contains(invitado)) {
            invitados.add(invitado);
        }
    }

    /**
     * Agrega una nota a la reunión.
     *
     * @param nota La nota que se quiere agregar.
     */
    public void agregarNota(String nota) {
        notas.add(nota);
    }

    /**
     * Marca la asistencia de un empleado, indicando si llegó tarde o no.
     *
     * @param empleado El empleado que asistió.
     * @param llegaTarde Indica si el empleado llegó tarde.
     */
    public void marcarAsistencia(Empleado empleado, boolean llegaTarde) {
        if (invitados.contains(empleado) && !presentes.contains(empleado)) {
            presentes.add(empleado);
            if (llegaTarde) {
                tarde.add(empleado);
            }
        }
    }

    /**
     * Marca la ausencia de un empleado invitado.
     *
     * @param empleado El empleado que estuvo ausente.
     */
    public void marcarAusencia(Empleado empleado) {
        if (invitados.contains(empleado) && !ausentes.contains(empleado)) {
            ausentes.add(empleado);
        }
    }

    /**
     * Invita a todos los empleados de un departamento a la reunión.
     *
     * @param dept El departamento cuyos empleados serán invitados.
     */
    public void invitarDepartamento(Departamento dept) {
        invitados.addAll(dept.getEmpleados());
    }

    /**
     * Inicia la reunión, registrando la hora de inicio como el momento actual.
     */
    public void iniciarReunion() {
        this.horaInicio = LocalDateTime.now();
    }

    /**
     * Finaliza la reunión, registrando la hora de fin como el momento actual.
     */
    public void finalizarReunion() {
        this.horaFin = LocalDateTime.now();
    }

    /**
     * Calcula la duración de la reunión en minutos.
     *
     * @return La duración en minutos, o 0 si la reunión no ha iniciado o finalizado
     */
    public long calcularDuracionReunion() {
        if (horaInicio != null && horaFin != null) {
            return java.time.Duration.between(horaInicio, horaFin).toMinutes();
        }
        return 0;
    }

    /**
     * Calcula el porcentaje de asistencia a la reunión.
     *
     * @return El porcentaje de asistencia, o 0 si no hay invitados.
     */
    public double calcularPorcentajeAsistencia() {
        if (invitados.isEmpty()) {
            return 0.0;
        }
        return (double) presentes.size() / invitados.size() * 100;
    }

    //Métodos de acceso y modificacion (getters y setters)
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

    /**
     * Devuelve una representación en formato de cadena de la reunión, incluyendo
     * el tipo de reunión, el nombre del organizador y la fecha.
     *
     * @return Una cadena en formato "Reunion de tipo [tipo] organizada por [organizador] con fecha [fecha]".
     */
    @Override
    public String toString() {
        return "Reunion de tipo " + tipo + " organizada por " + organizador.getNombre() +
                " con fecha " + fecha.toString();
    }
}