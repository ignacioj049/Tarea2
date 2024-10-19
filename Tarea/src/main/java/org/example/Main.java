package org.example;

import java.time.LocalDateTime;
import java.io.IOException;  // Importar IOException

public class Main {
    public static void main(String[] args) {

        Departamento it = new Departamento("IT");
        Departamento marketing = new Departamento("Marketing");

        Empleado juan = new Empleado(1, "Juan", "Perez", "juan@empresa.com", it);
        Empleado maria = new Empleado(2, "Maria", "Gonzalez", "maria@empresa.com", marketing);

        it.agregarEmpleado(juan);
        marketing.agregarEmpleado(maria);

        Reunion reunionPresencial = new ReunionPresencial(TipoReunion.TECNICA, LocalDateTime.now(), juan, "Sala 101");
        reunionPresencial.agregarInvitado(juan);
        reunionPresencial.agregarInvitado(maria);
        reunionPresencial.agregarNota("Revisión del proyecto.");

        reunionPresencial.iniciarReunion();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reunionPresencial.finalizarReunion();

        try {
            InformeReunion.generarInforme(reunionPresencial);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(reunionPresencial);
    }
}


