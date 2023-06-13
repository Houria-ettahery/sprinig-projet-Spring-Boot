package ma.enset.cabinet_medical_app.service;

import ma.enset.cabinet_medical_app.entities.Consultation;
import ma.enset.cabinet_medical_app.entities.Medecin;
import ma.enset.cabinet_medical_app.entities.Patient;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICabinetService {
    List<Patient> getAllPatients();
    List<Patient> SearchPatientsByQuery(String Query);
    void addPatient(Patient patient);
    void deletePatientById(Long id);
    List<Consultation> getConsultationsByPatient(Patient patient);
    //************************************************Gerer les medecins :
    void addMedecin(Medecin medecin);
    List<Medecin> getAllMedecins();
    void deleteMedecinBy(long id);
     List<Consultation> getConsultationsByMedecin(Medecin medecin);

     // gerer Consultations
     void addConsultation(Consultation consultation);
     List<Consultation> getAllConsultations();
     void DeleteConsultation(Consultation consultation);





}
