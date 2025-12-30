package com.smartclinic.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entidade que representa um Médico no sistema.
 */
@Entity
public class Doctor {
    
    // Identificador único do médico (Chave Primária)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String specialization;

    // Lista de horários disponíveis para consultas
    @ElementCollection
    private List<LocalDateTime> availableTimes;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<LocalDateTime> getAvailableTimes() { return availableTimes; }
}