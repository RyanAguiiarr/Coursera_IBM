package com.smartclinic.service;
import com.smartclinic.model.Doctor;
import com.smartclinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {
    @Autowired private DoctorRepository doctorRepository;
    public List<LocalDateTime> getAvailableTimes(Long id) {
        return doctorRepository.findById(id).map(Doctor::getAvailableTimes).orElse(List.of());
    }
}