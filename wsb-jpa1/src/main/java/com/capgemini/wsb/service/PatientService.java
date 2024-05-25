package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;

public interface PatientService {
    public PatientTO getPatientWithVisits(final Long patientId);
}
