package com.smartclinic.model;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;
    @ElementCollection
    private List<LocalDateTime> availableTimes;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public List<LocalDateTime> getAvailableTimes() { return availableTimes; }
}