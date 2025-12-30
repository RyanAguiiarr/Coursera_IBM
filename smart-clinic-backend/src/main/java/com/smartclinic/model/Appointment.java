package com.smartclinic.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name="doctor_id")
    private Doctor doctor;
    @ManyToOne @JoinColumn(name="patient_id")
    private Patient patient;
    private LocalDateTime appointmentTime;
    
    public void setAppointmentTime(LocalDateTime appointmentTime) { this.appointmentTime = appointmentTime; }
    public LocalDateTime getAppointmentTime() { return appointmentTime; }
}