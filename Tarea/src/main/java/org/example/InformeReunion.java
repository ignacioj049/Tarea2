package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InformeReunion {
    public static void generarInforme(Reunion reunion) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("informe_reunion.txt"))) {
            writer.write("Fecha y hora de la reunión: " + reunion.getFecha().toString());
            writer.newLine();
            writer.write("Hora de inicio: " + reunion.getHoraInicio().toString());
            writer.newLine();
            writer.write("Hora de fin: " + reunion.getHoraFin().toString());
            writer.newLine();
            writer.write("Duración total: " + reunion.calcularDuracionReunion() + " minutos");
            writer.newLine();
            writer.write("Tipo de reunión: " + reunion.getTipo());
            writer.newLine();
            if (reunion instanceof ReunionVirtual) {
                writer.write("Enlace: " + ((ReunionVirtual) reunion).getEnlace());
            } else if (reunion instanceof ReunionPresencial) {
                writer.write("Sala: " + ((ReunionPresencial) reunion).getSala());
            }
            writer.newLine();

            writer.write("Participantes presentes: ");
            for (Empleado presente : reunion.getPresentes()) {
                writer.write(presente.getNombre() + " ");
            }
            writer.newLine();

            writer.write("Participantes ausentes: ");
            for (Empleado ausente : reunion.getAusentes()) {
                writer.write(ausente.getNombre() + " ");
            }
            writer.newLine();

            writer.write("Participantes que llegaron tarde: ");
            for (Empleado tarde : reunion.getTarde()) {
                writer.write(tarde.getNombre() + " ");
            }
            writer.newLine();

            writer.write("Porcentaje de asistentes: " + reunion.calcularPorcentajeAsistencia() + "%");
            writer.newLine();

            writer.write("Notas:");
            for (String nota : reunion.getNotas()) {
                writer.newLine();
                writer.write("- " + nota);
            }
        }
    }
}


