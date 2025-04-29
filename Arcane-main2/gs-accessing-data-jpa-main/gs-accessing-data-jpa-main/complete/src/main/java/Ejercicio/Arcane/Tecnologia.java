package Ejercicio.Arcane;

import jakarta.persistence.*;

@Entity
public class Tecnologia {
    @Id
    private Long idTecnologia;

    private String nombre;
    private String tipo;
    private String descripcion;

    // Getters y setters omitidos por brevedad
}
