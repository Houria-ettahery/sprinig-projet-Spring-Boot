package ma.enset.cabinet_medical_app;

import ma.enset.cabinet_medical_app.entities.Consultation;
import ma.enset.cabinet_medical_app.entities.Medecin;
import ma.enset.cabinet_medical_app.entities.Patient;
import ma.enset.cabinet_medical_app.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ma.enset.cabinet_medical_app.service.ICabinetService;


import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CabinetMedicalAppApplication  implements CommandLineRunner {

    @Autowired


    //private PatientRepository patientRepository;
    private ICabinetService cabinetService;
	public static void main(String[] args) {

		SpringApplication.run(CabinetMedicalAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//****************** Ajouter une patient************************/
		//Patient p1=new Patient(null,"alami","ali","t3543","0646743435","ealamiali.*@gmail.com",new Date(),null);
		//patientRepository.save(p1);
		//Medecin m1=new Medecin("")
		//****************** selectioner une patient ************************/
        /* List<Patient> patients= patientRepository.findAll();
		 for(Patient p:patients){
			 System.out.printf(p.getNom()+" "+p.getPrenom()+" "+p.getEmail()+" --");
		 }*/
		//******************Modifier le nom d'une patient************************/
		/*Patient p=patientRepository.findById(3l).get();
		p.setPrenom("Ahmad");
		patientRepository.save(p);*/
		//suprimer une patient
		//patientRepository.deleteById(2l);
        Patient p1=new Patient(null,"alami","hajar","T3424","07533354","alamiHajar@gmail.com",new Date(),null);
        cabinetService.addPatient(p1);
        Patient p2=new Patient(null,"alami","ali","t3543","0646743435","ealamiali.*@gmail.com",new Date(),null);
        cabinetService.addPatient(p2);

        Patient p3=new Patient(null,"ettahery","saad","t7743","066555555","ettaherysaad.*@gmail.com",new Date(),null);
        cabinetService.addPatient(p3);

        //System.out.printf(p3.getNom()+" et "+p3.getPrenom());

        //cabinetService.SearchPatientsByQuery("t7743");

        cabinetService.deletePatientById(2l);

        //cabinetService.getAllPatients();


        Medecin m1=new  Medecin(null,"aloui","ahmad","065431313","alaouiahmad@gmail",null);
        cabinetService.addMedecin(m1);
        Consultation c1=new Consultation(null,new Date(+1),"premier description",p1,m1);
        cabinetService.addConsultation(c1);









	}
}