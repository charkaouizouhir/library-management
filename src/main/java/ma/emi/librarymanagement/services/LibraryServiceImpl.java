package ma.emi.librarymanagement.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.emi.librarymanagement.dtos.AdherentDto;
import ma.emi.librarymanagement.dtos.LivreDto;
import ma.emi.librarymanagement.dtos.PretDto;
import ma.emi.librarymanagement.repositories.AdherentRepository;
import ma.emi.librarymanagement.repositories.PretRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class LibraryServiceImpl implements LibraryService {
    private AdherentRepository adherentRepository;
    private PretRepository pretRepository;
    private CatalogueService catalogueService;
    @Override
    public AdherentDto SaveAdherent(AdherentDto adherentDto) {
        return null;
    }

    @Override
    public AdherentDto updateAdherent(AdherentDto adherentDto) {
        return null;
    }

    @Override
    public List<AdherentDto> getAllAdherents() {
        return List.of();
    }

    @Override
    public AdherentDto getAdherent(int id) {
        return null;
    }

    @Override
    public AdherentDto getAdherentByName(String name) {
        return null;
    }

    @Override
    public void deleteAdherent(int id) {

    }

    @Override
    public LivreDto saveLivre(LivreDto livreDto) {
        return null;
    }

    @Override
    public LivreDto updateLivre(LivreDto livreDto) {
        return null;
    }

    @Override
    public List<LivreDto> getAllLivres() {
        return List.of();
    }

    @Override
    public LivreDto getLivreByTitre(String name) {
        return null;
    }

    @Override
    public List<LivreDto> getLivresByAuteur(String auteur) {
        return List.of();
    }

    @Override
    public void deleteLivre(String ISBN) {

    }

    @Override
    public PretDto SavePret(PretDto pretDto) {
        return null;
    }

    @Override
    public PretDto updatePret(PretDto pretDto) {
        return null;
    }

    @Override
    public List<PretDto> getAllPrets() {
        return List.of();
    }

    @Override
    public PretDto getPretId(Long id) {
        return null;
    }
}
