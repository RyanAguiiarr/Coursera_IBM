package com.smartclinic.model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    // Correção: Adicionadas validações exigidas
    @NotNull(message = "O horário não pode ser nulo")
    @Future(message = "O agendamento deve ser para uma data futura")
    private LocalDateTime appointmentTime;

    public void setAppointmentTime(LocalDateTime appointmentTime) { this.appointmentTime = appointmentTime; }
    public LocalDateTime getAppointmentTime() { return appointmentTime; }
}