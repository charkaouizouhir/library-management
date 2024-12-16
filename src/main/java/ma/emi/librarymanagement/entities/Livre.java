package ma.emi.librarymanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Livre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ISBN;
    private String titre;
    private String auteur;
    private String description;
    @OneToOne(mappedBy = "livre")
    private Pret pret;

}
