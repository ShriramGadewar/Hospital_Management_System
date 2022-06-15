package net.javag.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.javag.springboot.model.patient;

@Repository
public interface PatientRepository extends JpaRepository<patient, Long>{

}
