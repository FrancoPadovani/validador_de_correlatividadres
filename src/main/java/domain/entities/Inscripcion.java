package domain.entities;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Inscripcion {
    List<Materia> asignaturas;
    Alumno alumno;

    public boolean aprobada() {
     return asignaturas.stream().allMatch(
             materia ->
                     alumno.materiasAprobadas.containsAll(
                             materia.materiasCorrelativas
                     )
     );
    }
}
