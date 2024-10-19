package org.example;

import java.time.LocalDateTime;
import java.io.IOException;  // Importar IOException

public class Main {
    public static void main(String[] args) {
        // Crear departamentos
        Departamento it = new Departamento("IT");
        Departamento marketing = new Departamento("Marketing");

        // Crear empleados
        Empleado juan = new Empleado("1", "Juan", "Perez", "juan@empresa.com", it);
        Empleado maria = new Empleado("2", "Maria", "Gonzalez", "maria@empresa.com", marketing);

        // Agregar empleados a departamentos
        it.agregarEmpleado(juan);
        marketing.agregarEmpleado(maria);

        // Crear una reunión presencial
        Reunion reunionPresencial = new ReunionPresencial("Tecnica", LocalDateTime.now(), juan, "Sala 101");
        reunionPresencial.agregarInvitado(juan);
        reunionPresencial.agregarInvitado(maria);
        reunionPresencial.agregarNota("Revisión del proyecto.");

        // Iniciar y finalizar reunión
        reunionPresencial.iniciarReunion();
        try {
            Thread.sleep(2000); // Simular duración de la reunión
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reunionPresencial.finalizarReunion();

        // Generar informe
        try {
            InformeReunion.generarInforme(reunionPresencial);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mostrar resumen de la reunión
        System.out.println(reunionPresencial);
    }
}
