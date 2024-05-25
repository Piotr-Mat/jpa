package com.capgemini.wsb.dto;

import java.time.LocalDate;
import java.util.List;

public class PatientTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String patientNumber;
    private LocalDate dateOfBirth;
    private boolean isUnderTreatment;
    private List<VisitTO> visits;

    public PatientTO(Long id, String firstName, String lastName, String patientNumber, LocalDate dateOfBirth, boolean isUnderTreatment, List<VisitTO> visits) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientNumber = patientNumber;
        this.dateOfBirth = dateOfBirth;
        this.isUnderTreatment = isUnderTreatment;
        this.visits = visits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isUnderTreatment() {
        return isUnderTreatment;
    }

    public void setUnderTreatment(boolean underTreatment) {
        isUnderTreatment = underTreatment;
    }

    public List<VisitTO> getVisits() {
        return visits;
    }

    public void setVisits(List<VisitTO> visits) {
        this.visits = visits;
    }
}
