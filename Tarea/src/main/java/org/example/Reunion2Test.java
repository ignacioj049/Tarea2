package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class Reunion2Test {

    @Test
    public void testCalcularDuracionReunion() throws InterruptedException {
        Empleado organizador = new Empleado(85839, "Araceli", "Bustamante Ortiz", "a.bustamanteo@empresa.com", new Departamento("Operaciones"));
        Reunion reunion = new Reunion(TipoReunion.MARKETING, LocalDateTime.now(), organizador);

        reunion.iniciarReunion();
        Thread.sleep(1000); // Simula un tiempo de espera de 1 segundo
        reunion.finalizarReunion();

        assertEquals(1, reunion.calcularDuracionReunion());

    }
}