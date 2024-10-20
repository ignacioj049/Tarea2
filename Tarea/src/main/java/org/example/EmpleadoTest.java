package org.example;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    public void testCrearEmpleado() {
        Departamento depto = new Departamento("Marketing");
        Empleado empleado = new Empleado(123, "Juan", "Pérez", "juan.perez@empresa.com", depto);

        assertEquals(123, empleado.getId());
        assertEquals("Juan", empleado.getNombre());
        assertEquals("Pérez", empleado.getApellidos());
        assertEquals("juan.perez@empresa.com", empleado.getCorreo());
        assertEquals("Marketing", empleado.getDepartamento().getNombre());
    }
}

