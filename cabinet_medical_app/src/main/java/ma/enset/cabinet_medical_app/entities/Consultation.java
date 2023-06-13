package ma.enset.cabinet_medical_app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity @NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date_consultation;
    private  String description;
   @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;

}
