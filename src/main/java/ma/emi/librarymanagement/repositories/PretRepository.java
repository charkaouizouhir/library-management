package ma.emi.librarymanagement.repositories;

import ma.emi.librarymanagement.entities.Pret;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PretRepository extends JpaRepository<Pret, Long> {
    List<Pret> findAllByAdherentId(Long id);
}
