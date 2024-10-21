package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * La clase InformeReunion se encarga de generar un informe detallado de una reunión.
 * El informe se guarda en un archivo de texto con el nombre "informe_reunion.txt".
 */
public class InformeReunion {

    /**
     * Genera un informe de la reunión proporcionada y lo guarda en un archivo de texto.
     *
     * @param reunion La reunión de la que se generará el informe.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    public static void generarInforme(Reunion reunion) throws IOException {
        // Utiliza try-with-resources para asegurar que el BufferedWriter se cierre correctamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("informe_reunion.txt"))) {
            //Escribe la fecha y hora de la reunión
            writer.write("Fecha y hora de la reunión: " + reunion.getFecha().toString());
            writer.newLine();
            //Escribe la hora de inicio de la reunión
            writer.write("Hora de inicio: " + reunion.getHoraInicio().toString());
            writer.newLine();
            //Escribe la hora de término de la reunión
            writer.write("Hora de fin: " + reunion.getHoraFin().toString());
            writer.newLine();
            //Escribe la duración total de la reunión
            writer.write("Duración total: " + reunion.calcularDuracionReunion() + " minutos");
            writer.newLine();
            //Escribe el tipo de reunión(virtual o presencial)
            writer.write("Tipo de reunión: " + reunion.getTipo());
            writer.newLine();
            //Si la reunión es virtual, escribe el enlace, si es presencial escribe la sala
            if (reunion instanceof ReunionVirtual) {
                writer.write("Enlace: " + ((ReunionVirtual) reunion).getEnlace());
            } else if (reunion instanceof ReunionPresencial) {
                writer.write("Sala: " + ((ReunionPresencial) reunion).getSala());
            }
            writer.newLine();

            //Escribe la lista de participantes presentes
            writer.write("Participantes presentes: ");
            for (Empleado presente : reunion.getPresentes()) {
                writer.write(presente.getNombre() + " ");
            }
            writer.newLine();

            //Escribe la lista de participantes ausentes
            writer.write("Participantes ausentes: ");
            for (Empleado ausente : reunion.getAusentes()) {
                writer.write(ausente.getNombre() + " ");
            }
            writer.newLine();

            //Escribe la lista de participantes que llegaron tarde a la reunión
            writer.write("Participantes que llegaron tarde: ");
            for (Empleado tarde : reunion.getTarde()) {
                writer.write(tarde.getNombre() + " ");
            }
            writer.newLine();

            //Escribe el porcentaje de asistentes a la reunión
            writer.write("Porcentaje de asistentes: " + reunion.calcularPorcentajeAsistencia() + "%");
            writer.newLine();

            //Escribe las notas asociadas a la reunión
            writer.write("Notas:");
            for (String nota : reunion.getNotas()) {
                writer.newLine();
                writer.write("- " + nota);
            }
        }
    }
}