package ma.emi.librarymanagement.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivreDto {
    private String ISBN;
    private String titre;
    private String auteur;
    private String description;
}
