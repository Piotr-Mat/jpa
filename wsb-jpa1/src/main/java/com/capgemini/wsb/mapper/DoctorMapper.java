package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.DoctorTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public class DoctorMapper {

    public static DoctorTO mapToTO(DoctorEntity doctorEntity) {
        if (doctorEntity == null) {
            return null;
        }

        return new DoctorTO(
                doctorEntity.getId(),
                doctorEntity.getFirstName(),
                doctorEntity.getLastName(),
                doctorEntity.getTelephoneNumber(),
                doctorEntity.getEmail(),
                doctorEntity.getDoctorNumber(),
                doctorEntity.getSpecialization()
        );
    }

    public static DoctorEntity mapToEntity(DoctorTO doctorTO) {
        if (doctorTO == null) {
            return null;
        }

        DoctorEntity doctorEntity = new DoctorEntity();
        doctorEntity.setId(doctorTO.getId());
        doctorEntity.setFirstName(doctorTO.getFirstName());
        doctorEntity.setLastName(doctorTO.getLastName());
        doctorEntity.setTelephoneNumber(doctorTO.getTelephoneNumber());
        doctorEntity.setEmail(doctorTO.getEmail());
        doctorEntity.setDoctorNumber(doctorTO.getDoctorNumber());
        doctorEntity.setSpecialization(doctorTO.getSpecialization());

        return doctorEntity;
    }
}
