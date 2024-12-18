package ma.emi.librarymanagement.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.emi.librarymanagement.dtos.LivreDto;
import ma.emi.librarymanagement.repositories.LivreRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CatalogueServiceImpl implements CatalogueService {
    private LivreRespository livreRespository;

    @Override
    public List<LivreDto> chercherLivreByISBN(String ISBN) {
        return List.of();
    }

    @Override
    public List<LivreDto> chercherLivreByTitre(String titre) {
        return List.of();
    }

    @Override
    public List<LivreDto> chercherLivreByAuteur(String auteur) {
        return List.of();
    }

    @Override
    public LivreDto createLivre(LivreDto livreDto) {
        return null;
    }

    @Override
    public LivreDto updateLivre(LivreDto livreDto) {
        return null;
    }

    @Override
    public void deleteLivre(String ISBN) {

    }
}
