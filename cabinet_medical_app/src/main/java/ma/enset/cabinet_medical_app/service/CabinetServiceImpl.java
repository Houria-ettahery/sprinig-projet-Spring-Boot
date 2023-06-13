package ma.enset.cabinet_medical_app.service;

import lombok.AllArgsConstructor;
import ma.enset.cabinet_medical_app.entities.Consultation;
import ma.enset.cabinet_medical_app.entities.Medecin;
import ma.enset.cabinet_medical_app.entities.Patient;
import ma.enset.cabinet_medical_app.repositories.ConsultationRepository;
import ma.enset.cabinet_medical_app.repositories.MedecinRepository;
import ma.enset.cabinet_medical_app.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service @Transactional
@AllArgsConstructor
public class CabinetServiceImpl implements  ICabinetService {
           @Autowired
          PatientRepository patientRepository;
           @Autowired
           ConsultationRepository consultationRepository;
           @Autowired
           MedecinRepository medecinRepository;

    @Override
    public List<Patient> getAllPatients() {

        return  patientRepository.findAll();
    }

    @Override
    public List<Patient> SearchPatientsByQuery(String query) {
     return null;//patientRepository.findPatientByNomContainsOrEmailContainsOrCinContains(query);
    }

    @Override
    public void addPatient(Patient patient) {

        patientRepository.save(patient);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);

    }

    @Override
    public List<Consultation> getConsultationsByPatient(Patient patient) {
        return null; //consultationRepository.findConsultationByPatient(patient);
    }




    @Override
    public void addMedecin(Medecin medecin) {
       medecinRepository.save(medecin);
    }

    @Override
    public List<Medecin> getAllMedecins() {
       return   medecinRepository.findAll();

    }

    @Override
    public void deleteMedecinBy(long id) {
        medecinRepository.deleteById(id);

    }




    public List<Consultation> getConsultationsByMedecin(Medecin medecin) {
        return null;// consultationRepository.findConsultationByMedecin(medecin);
    }

    @Override
    public void addConsultation(Consultation consultation) {
          consultationRepository.save(consultation);
    }

    @Override
    public List<Consultation> getAllConsultations() {

        return consultationRepository.findAll();
    }

    @Override
    public void DeleteConsultation(Consultation consultation) {
        consultationRepository.delete(consultation);

    }
}
