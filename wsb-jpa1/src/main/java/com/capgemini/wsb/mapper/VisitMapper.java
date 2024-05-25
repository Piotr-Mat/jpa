package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.persistence.entity.VisitEntity;

public class VisitMapper {

    public static VisitTO mapToTO(VisitEntity visitEntity) {
        if (visitEntity == null) {
            return null;
        }
        return new VisitTO(
                visitEntity.getId(),
                visitEntity.getTime(),
                visitEntity.getDescription(),
                DoctorMapper.mapToTO(visitEntity.getDoctor()),
                PatientMapper.mapToTO(visitEntity.getPatient())
        );
    }

    public static VisitEntity mapToEntity(VisitTO visitTO) {
        if (visitTO == null) {
            return null;
        }
        VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitTO.getId());
        visitEntity.setTime(visitTO.getTime());
        visitEntity.setDescription(visitTO.getDescription());
        visitEntity.setDoctor(DoctorMapper.mapToEntity(visitTO.getDoctor()));
        visitEntity.setPatient(PatientMapper.mapToEntity(visitTO.getPatient()));

        return visitEntity;
    }
}
