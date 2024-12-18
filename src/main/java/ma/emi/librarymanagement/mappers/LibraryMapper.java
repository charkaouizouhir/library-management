package ma.emi.librarymanagement.mappers;

import ma.emi.librarymanagement.dtos.AdherentDto;
import ma.emi.librarymanagement.dtos.LivreDto;
import ma.emi.librarymanagement.dtos.PretDto;
import ma.emi.librarymanagement.entities.Adherent;
import ma.emi.librarymanagement.entities.Livre;
import ma.emi.librarymanagement.entities.Pret;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class LibraryMapper {
    public  AdherentDto mapToAdherentDto(Adherent adherent){
        AdherentDto adherentDto=new AdherentDto();
        BeanUtils.copyProperties(adherent,adherentDto);
        return adherentDto;
    }
    public Adherent mapToAdherent(AdherentDto adherentDto){
        Adherent adherent=new Adherent();
        BeanUtils.copyProperties(adherentDto,adherent);
        return adherent;
    }
    public LivreDto mapToLivreDto(Livre livre){
        LivreDto livreDto=new LivreDto();
        BeanUtils.copyProperties(livre,livreDto);
        return livreDto;
    }
    public Livre mapToLivre(LivreDto livreDto){
        Livre livre =new Livre();
        BeanUtils.copyProperties(livreDto,livre);
        return livre;
    }
    public PretDto mapToPretDto(Pret pret){
        PretDto pretDto=new PretDto();
        BeanUtils.copyProperties(pret,pretDto);
        return pretDto;
    }
    public Pret mapToPret(PretDto pretDto){
        Pret pret=new Pret();
        BeanUtils.copyProperties(pretDto,pret);
        return pret;
    }
}
