package ma.enset.cabinet_medical_app.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity @NoArgsConstructor
@AllArgsConstructor @ToString @Data
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    @NonNull
    private String nom;

    private String prenom;
    @Column(length = 10)
    private String cin;
    private String tel;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date date_Naissance;
    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> consultations;



}
