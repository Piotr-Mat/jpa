package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testFindPatientsByLastName() {
        // given
        final String lastName = "Doe";

        // when
        List<Patient> result = patientDao.findPatientsByLastName(lastName);

        // then
        assertThat(result).isNotNull();
        assertThat(result.size()).isGreaterThan(0);
        result.forEach(patient -> assertThat(patient.getLastName()).isEqualTo(lastName));
    }

    @Transactional
    @Test
    public void testFindPatientsWithMoreThanXVisits() {
        // given
        final int visitCount = 3;

        // when
        List<Patient> result = patientDao.findPatientsWithMoreThanXVisits(visitCount);

        // then
        assertThat(result).isNotNull();
        assertThat(result.size()).isGreaterThan(0);
        result.forEach(patient -> assertThat(patient.getVisits().size()).isGreaterThan(visitCount));
    }

    @Transactional
    @Test
    public void testFindPatientsByBirthDateBefore() {
        // given
        Date dateThreshold = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");

        // when
        List<Patient> result = patientDao.findPatientsByBirthDateBefore(dateThreshold);

        // then
        assertThat(result).isNotNull();
        assertThat(result.size()).isGreaterThan(0);
        result.forEach(patient -> assertThat(patient.getDateOfBirth()).isBefore(dateThreshold));
    }
}
