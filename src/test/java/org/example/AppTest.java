package org.example;

import domain.entities.Alumno;
import domain.entities.Inscripcion;
import domain.entities.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class InscripcionTest {

    @Test
    @DisplayName("Test cumple con correlativas")
    public void testInscripcionAprobada() {
        Materia algoritmos = new Materia();
        algoritmos.setNombre("Algoritmos y Estructuras de Datos");
        algoritmos.setMateriasCorrelativas(Arrays.asList());

        Materia paradigmas = new Materia();
        paradigmas.setNombre("Paradigmas de Programación");
        paradigmas.setMateriasCorrelativas(Arrays.asList(algoritmos));

        Materia disenoSistemas = new Materia();
        disenoSistemas.setNombre("Diseño de Sistemas");
        disenoSistemas.setMateriasCorrelativas(Arrays.asList(paradigmas));

        Alumno alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setMateriasAprobadas(Arrays.asList(algoritmos, paradigmas));

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAsignaturas(Arrays.asList(disenoSistemas));
        inscripcion.setAlumno(alumno);

        Assertions.assertTrue(inscripcion.aprobada(), "La inscripción debería ser aprobada.");
    }

    @Test
    @DisplayName("Test no cumple con correlativas")
    public void testInscripcionRechazada() {
        Materia algoritmos = new Materia();
        algoritmos.setNombre("Algoritmos y Estructuras de Datos");
        algoritmos.setMateriasCorrelativas(Arrays.asList());

        Materia paradigmas = new Materia();
        paradigmas.setNombre("Paradigmas de Programación");
        paradigmas.setMateriasCorrelativas(Arrays.asList(algoritmos));

        Materia disenoSistemas = new Materia();
        disenoSistemas.setNombre("Diseño de Sistemas");
        disenoSistemas.setMateriasCorrelativas(Arrays.asList(paradigmas));

        Alumno alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setMateriasAprobadas(Arrays.asList(algoritmos));

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAsignaturas(Arrays.asList(disenoSistemas));
        inscripcion.setAlumno(alumno);

        Assertions.assertFalse(inscripcion.aprobada(), "La inscripción debería ser rechazada.");
    }
}
