package ma.enset.cabinet_medical_app.repositories;

import ma.enset.cabinet_medical_app.entities.Consultation;
import ma.enset.cabinet_medical_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface PatientRepository extends JpaRepository<Patient,Long> {

    //List<Patient> findPatientByNomContainsOrEmailContainsOrCinContains(String query);

}
