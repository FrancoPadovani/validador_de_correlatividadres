package domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Alumno {
    String nombre;
    List<Materia> materiasAprobadas;
}
