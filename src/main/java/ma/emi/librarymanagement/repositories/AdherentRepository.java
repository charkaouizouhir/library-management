package ma.emi.librarymanagement.repositories;

import ma.emi.librarymanagement.entities.Adherent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdherentRepository extends JpaRepository<Adherent, Long> {
    List<Adherent> findAdherentByNom(String nom);
}
