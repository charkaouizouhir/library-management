package ma.emi.librarymanagement.dtos;

import jakarta.persistence.Embedded;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emi.librarymanagement.entities.Adherent;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PretDto {
    private Long id;
    private LocalDate datePret;
    private LivreDto livredto;
    private AdherentDto adherentdto;
}
