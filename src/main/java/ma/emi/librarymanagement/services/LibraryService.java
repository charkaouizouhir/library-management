package ma.emi.librarymanagement.services;

import ma.emi.librarymanagement.dtos.AdherentDto;
import ma.emi.librarymanagement.dtos.LivreDto;
import ma.emi.librarymanagement.dtos.PretDto;
import org.springframework.stereotype.Service;

import java.util.List;
public interface LibraryService {
    AdherentDto SaveAdherent(AdherentDto adherentDto);
    AdherentDto updateAdherent(AdherentDto adherentDto);
    List<AdherentDto> getAllAdherents();
    AdherentDto getAdherent(int id);
    AdherentDto getAdherentByName(String name);
    void deleteAdherent(int id);

    LivreDto saveLivre(LivreDto livreDto);
    LivreDto updateLivre(LivreDto livreDto);
    List<LivreDto> getAllLivres();
    LivreDto getLivreByTitre(String name);
    List<LivreDto> getLivresByAuteur(String auteur);
    void deleteLivre(String ISBN);

    PretDto SavePret(PretDto pretDto);
    PretDto updatePret(PretDto pretDto);
    List<PretDto> getAllPrets();
    PretDto getPretId(Long id);


}
