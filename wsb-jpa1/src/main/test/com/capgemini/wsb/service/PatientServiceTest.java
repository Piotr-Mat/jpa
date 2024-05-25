package com.capgemini.wsb.service;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Transactional
    @Test
    public void testDeletePatient_shouldCascadeDeleteVisits_notDeleteDoctors() {
        // given
        Long patientId = 1L;

        // when
        patientService.deletePatient(patientId);

        // then
        Optional<PatientTO> patient = patientService.getPatientWithVisits(patientId);
        assertThat(patient).isEmpty();

        List<VisitTO> visits = assertThat(visits).isEmpty();

        boolean doctorsExist = assertThat(doctorsExist).isTrue();
    }

    @Transactional
    @Test
    public void testGetPatientById_shouldReturnPatientTOWithCorrectData() {
        // given
        Long patientId = 1L;

        // when
        PatientTO patientTO = patientService.getPatientWithVisits(patientId)
                .orElseThrow(() -> new AssertionError("Patient should exist"));

        // then
        assertThat(patientTO.getId()).isEqualTo(patientId);
        assertThat(patientTO.getNewField()).isEqualTo(expectedValue);

        assertThat(patientTO.getVisits()).isNotEmpty();
    }

    @Transactional
    @Test
    public void testGetPatientWithVisits_shouldReturnVisitsForGivenPatientId() {
        // given
        Long patientId = 1L;

        // when
        PatientTO patientTO = patientService.getPatientWithVisits(patientId)
                .orElseThrow(() -> new AssertionError("Patient should exist"));

        // then
        assertThat(patientTO.getId()).isEqualTo(patientId);
        List<VisitTO> visits = patientTO.getVisits();
        assertThat(visits).isNotEmpty();
        assertThat(visits.size()).isGreaterThan(0);
        assertThat(visits).extracting("description").contains("Annual Checkup");
    }
}
