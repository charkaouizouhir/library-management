package ma.emi.librarymanagement.repositories;

import ma.emi.librarymanagement.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRespository extends JpaRepository<Livre,String> {
    List<Livre> findByAuteur(String auteur);
}
