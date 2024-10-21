package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class ReunionInvitadosTest {

    @Test
    public void testAgregarInvitadoDuplicado() {
        Empleado organizador = new Empleado(123, "Juan", "Perez", "juan.perez@empresa.com", new Departamento("IT"));
        Reunion reunion = new Reunion(TipoReunion.TECNICA, LocalDateTime.now(), organizador);

        Empleado invitado = new Empleado(456, "Ana", "Garcia", "ana.garcia@empresa.com", new Departamento("Marketing"));
        reunion.agregarInvitado(invitado);

        reunion.agregarInvitado(invitado);


        assertEquals(1, reunion.getInvitados().size());
    }

    @Test
    public void testMarcarAsistenciaNoInvitado() {
        Empleado organizador = new Empleado(1, "Juan", "Perez", "juan.perez@empresa.com", new Departamento("IT"));
        Reunion reunion = new Reunion(TipoReunion.TECNICA, LocalDateTime.now(), organizador);

        Empleado noInvitado = new Empleado(2, "Carlos", "Ramirez", "carlos.ramirez@empresa.com", new Departamento("Ventas"));


        reunion.marcarAsistencia(noInvitado, false);


        assertFalse(reunion.getPresentes().contains(noInvitado));
    }
}
