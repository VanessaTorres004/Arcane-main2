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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }
}
