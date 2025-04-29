package Ejercicio.Arcane;

import jakarta.persistence.*;

@Entity
public class UsoTecnologia {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Personaje personaje;

    @ManyToOne
    private Tecnologia tecnologia;

    // Getters y setters omitidos por brevedad
}
