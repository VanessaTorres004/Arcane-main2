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

    public Long getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Long idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadBase() {
        return ciudadBase;
    }

    public void setCiudadBase(String ciudadBase) {
        this.ciudadBase = ciudadBase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Afiliacion> getAfiliaciones() {
        return afiliaciones;
    }

    public void setAfiliaciones(List<Afiliacion> afiliaciones) {
        this.afiliaciones = afiliaciones;
    }
}
