package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class Reunion3Test {

    @Test
    public void testReunionVirtual() {
        Empleado organizador = new Empleado(3, "Carlos", "Lopez", "carlos.lopez@empresa.com", new Departamento("IT"));
        ReunionVirtual reunionVirtual = new ReunionVirtual(TipoReunion.OTRO, LocalDateTime.now(), organizador, "www.reunion.com");

        // Verificar que el enlace es el correcto
        assertEquals("www.reunion.com", reunionVirtual.getEnlace());
    }

    @Test
    public void testReunionPresencial() {
        Empleado organizador = new Empleado(4, "Marta", "Sanchez", "marta.sanchez@empresa.com", new Departamento("RRHH"));
        ReunionPresencial reunionPresencial = new ReunionPresencial(TipoReunion.MARKETING, LocalDateTime.now(), organizador, "Sala 201");

        // Verificar que la sala es la correcta
        assertEquals("Sala 201", reunionPresencial.getSala());
    }
}
