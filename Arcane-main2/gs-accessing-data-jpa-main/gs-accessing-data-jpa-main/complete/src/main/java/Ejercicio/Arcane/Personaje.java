package Ejercicio.Arcane;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Personaje {
    @Id
    private Long idPersonaje;
    private String nombre;
    private String origen;
    private String rol;
    private String alineacion;

    @OneToMany(mappedBy = "personaje")
    private List<Afiliacion> afiliaciones;

    @OneToMany(mappedBy = "personaje1")
    private List<Relacion> relacionesIniciadas;

    @OneToMany(mappedBy = "personaje2")
    private List<Relacion> relacionesRecibidas;

    @OneToMany(mappedBy = "personaje")
    private List<UsoTecnologia> tecnologiasUsadas;

    public Long getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Long idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getAlineacion() {
        return alineacion;
    }

    public void setAlineacion(String alineacion) {
        this.alineacion = alineacion;
    }

    public List<Afiliacion> getAfiliaciones() {
        return afiliaciones;
    }

    public void setAfiliaciones(List<Afiliacion> afiliaciones) {
        this.afiliaciones = afiliaciones;
    }

    public List<Relacion> getRelacionesIniciadas() {
        return relacionesIniciadas;
    }

    public void setRelacionesIniciadas(List<Relacion> relacionesIniciadas) {
        this.relacionesIniciadas = relacionesIniciadas;
    }

    public List<Relacion> getRelacionesRecibidas() {
        return relacionesRecibidas;
    }

    public void setRelacionesRecibidas(List<Relacion> relacionesRecibidas) {
        this.relacionesRecibidas = relacionesRecibidas;
    }

    public List<UsoTecnologia> getTecnologiasUsadas() {
        return tecnologiasUsadas;
    }

    public void setTecnologiasUsadas(List<UsoTecnologia> tecnologiasUsadas) {
        this.tecnologiasUsadas = tecnologiasUsadas;
    }
}
