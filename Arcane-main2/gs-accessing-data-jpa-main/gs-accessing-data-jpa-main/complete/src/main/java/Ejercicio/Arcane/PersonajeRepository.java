package Ejercicio.Arcane;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

    // Buscar personajes por nombre (ignorando mayúsculas/minúsculas)
    List<Personaje> findByNombreContainingIgnoreCase(String nombre);
}
