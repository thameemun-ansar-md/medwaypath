package com.medwaypath.dal.mapper;

import com.medwaypath.dal.bo.PatientBO;
import com.medwaypath.dal.entities.Patient;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-17T17:49:22+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient toPatientEntity(PatientBO patientBO) {
        if ( patientBO == null ) {
            return null;
        }

        Patient patient = new Patient();

        return patient;
    }

    @Override
    public PatientBO toPatientBO(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientBO patientBO = new PatientBO();

        return patientBO;
    }
}
