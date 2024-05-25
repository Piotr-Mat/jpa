package com.capgemini.wsb.dto;

import java.time.LocalDateTime;

public class VisitTO {

    private Long id;
    private LocalDateTime time;
    private String description;
    private DoctorTO doctor;
    private PatientTO patient;

    public VisitTO(Long id, LocalDateTime time, String description, DoctorTO doctor, PatientTO patient) {
        this.id = id;
        this.time = time;
        this.description = description;
        this.doctor = doctor;
        this.patient = patient;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DoctorTO getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorTO doctor) {
        this.doctor = doctor;
    }

    public PatientTO getPatient() {
        return patient;
    }

    public void setPatient(PatientTO patient) {
        this.patient = patient;
    }

}
