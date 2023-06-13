package ma.enset.cabinet_medical_app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity @NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;

    private String tel;
    private String email;

    @OneToMany(mappedBy = "medecin")
    private Collection<Consultation> consultations;

}
