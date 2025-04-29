package Ejercicio.Arcane;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Organizacion {
    @Id
    private Long idOrganizacion;

    private String nombre;
    private String ciudadBase;
    private String tipo;

    @OneToMany(mappedBy = "organizacion")
    private List<Afiliacion> afiliaciones;

    // Getters y setters omitidos por brevedad
}
