package ma.emi.librarymanagement.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdherentDto {
    private Long id;
    private String nom;
    private String prenom;
}
