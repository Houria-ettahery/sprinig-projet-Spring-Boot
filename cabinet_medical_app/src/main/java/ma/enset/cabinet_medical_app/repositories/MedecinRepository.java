package ma.enset.cabinet_medical_app.repositories;

import ma.enset.cabinet_medical_app.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin , Long> {
}
