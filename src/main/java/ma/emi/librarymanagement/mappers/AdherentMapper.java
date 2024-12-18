package ma.emi.librarymanagement.mappers;

import ma.emi.librarymanagement.dtos.AdherentDto;
import ma.emi.librarymanagement.entities.Adherent;

public class AdherentMapper {
    public AdherentDto mapToAdherentDto(Adherent adherent){
        AdherentDto adherentDto=new AdherentDto(adherent.getId(),adherent.getNom(),adherent.getPrenom());
        return adherentDto;
    }
}
