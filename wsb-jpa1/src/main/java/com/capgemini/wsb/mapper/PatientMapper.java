package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.springframework.stereotype.Component;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PatientMapper {

    public static PatientTO mapToTO(PatientEntity patientEntity) {
        if (patientEntity == null) {
            return null;
        }
        List<VisitTO> visitTOs = patientEntity.getVisits().stream()
                .map(VisitMapper::mapToTO)
                .collect(Collectors.toList());

        return new PatientTO(
                patientEntity.getId(),
                patientEntity.getFirstName(),
                patientEntity.getLastName(),
                patientEntity.getPatientNumber(),
                patientEntity.getDateOfBirth(),
                patientEntity.isUnderTreatment(),
                visitTOs
        );
    }

    public static PatientEntity mapToEntity(PatientTO patientTO) {
        if (patientTO == null) {
            return null;
        }
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientTO.getId());
        patientEntity.setFirstName(patientTO.getFirstName());
        patientEntity.setLastName(patientTO.getLastName());
        patientEntity.setPatientNumber(patientTO.getPatientNumber());
        patientEntity.setDateOfBirth(patientTO.getDateOfBirth());
        patientEntity.setUnderTreatment(patientTO.isUnderTreatment());
        List<VisitEntity> visitEntities = patientTO.getVisits().stream()
                .map(VisitMapper::mapToEntity)
                .collect(Collectors.toList());
        patientEntity.setVisits(visitEntities);

        return patientEntity;
    }
}
