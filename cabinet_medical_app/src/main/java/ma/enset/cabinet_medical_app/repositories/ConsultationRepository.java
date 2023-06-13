package ma.enset.cabinet_medical_app.repositories;

import ma.enset.cabinet_medical_app.entities.Consultation;
import ma.enset.cabinet_medical_app.entities.Medecin;
import ma.enset.cabinet_medical_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation ,Long> {

    List<Consultation> findConsultationByPatient(Patient patient);
    List<Consultation> findConsultationByMedecin(Medecin medecin);
}
