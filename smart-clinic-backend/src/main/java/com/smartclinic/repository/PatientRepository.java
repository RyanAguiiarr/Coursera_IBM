package com.smartclinic.repository;
import com.smartclinic.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByEmail(String email);
    Patient findByEmailOrPhone(String email, String phone);
}