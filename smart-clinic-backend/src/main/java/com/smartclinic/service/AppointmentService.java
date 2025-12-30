package com.smartclinic.service;
import com.smartclinic.model.Appointment;
import com.smartclinic.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AppointmentService {
    @Autowired private AppointmentRepository repo;
    public Appointment bookAppointment(Appointment appt) { return repo.save(appt); }
}