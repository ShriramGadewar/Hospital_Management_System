package net.javag.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javag.springboot.model.doctor;

@Repository
public interface DoctorRepository extends JpaRepository<doctor, Long>{

}
