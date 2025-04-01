package domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Materia {
    String nombre;
    List<Materia> materiasCorrelativas;
}
