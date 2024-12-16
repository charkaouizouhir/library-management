package ma.emi.librarymanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pret {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datePret;
    @ManyToOne
    private Adherent adherent;
    @OneToOne
    private Livre livre;
    public LocalDate getDateRetour(){
        return datePret.plusDays(14);
    }
}
