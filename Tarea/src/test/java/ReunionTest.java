package org.example;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReunionTest {
    @Test
    public void testAgregarInvitado() {
        Empleado organizador = new Empleado(54321, "Ana", "García Morales", "ana.garciam@empresa.com", new Departamento("Recursos Humanos"));
        Reunion reunion = new Reunion(TipoReunion.OTRO, LocalDateTime.now(), organizador);

        Empleado invitado = new Empleado(48789, "Luis", "Martínez Gonzalez", "luis.martinezg@empresa.com", new Departamento("Marketing"));
        reunion.agregarInvitado(invitado);

        assertTrue(reunion.getInvitados().contains(invitado));
    }
}
