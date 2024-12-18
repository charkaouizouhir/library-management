package ma.emi.librarymanagement.services;


import ma.emi.librarymanagement.dtos.LivreDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CatalogueService {
    List<LivreDto> chercherLivreByISBN(String ISBN);
    List<LivreDto> chercherLivreByTitre(String titre);
    List<LivreDto> chercherLivreByAuteur(String auteur);
    LivreDto createLivre(LivreDto livreDto);
    LivreDto updateLivre(LivreDto livreDto);
    void deleteLivre(String ISBN);



}
