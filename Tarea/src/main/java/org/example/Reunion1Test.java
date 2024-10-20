package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class Reunion1Test {
    @Test
    public void testMarcarAsistencia() {
        Empleado organizador = new Empleado(77685, "Alejandro", "Figueroa Castillo", "al.figueroac@empresa.com", new Departamento("Informática"));
        Reunion reunion = new Reunion(TipoReunion.TECNICA, LocalDateTime.now(), organizador);

        Empleado invitado = new Empleado(46738, "Claudia", "Osorio Fernandez", "claudia.osoriof@empresa.com", new Departamento("Marketing"));
        reunion.agregarInvitado(invitado);
        reunion.marcarAsistencia(invitado, false);

        assertTrue(reunion.getPresentes().contains(invitado));
        assertFalse(reunion.getTarde().contains(invitado)); // No llegó tarde
    }

}
