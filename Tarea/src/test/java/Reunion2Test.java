package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class Reunion2Test {

    @Test
    public void testCalcularDuracionReunion() {
        Empleado organizador = new Empleado(85839, "Araceli", "Bustamante Ortiz", "a.bustamanteo@empresa.com", new Departamento("Operaciones"));
        Reunion reunion = new Reunion(TipoReunion.MARKETING, LocalDateTime.now(), organizador);


        reunion.iniciarReunion();

        reunion.setHoraFin(reunion.getHoraInicio().plusMinutes(1));


        assertEquals(1, reunion.calcularDuracionReunion());
    }
}