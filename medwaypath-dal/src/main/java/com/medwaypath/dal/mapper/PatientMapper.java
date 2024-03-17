package com.medwaypath.dal.mapper;

import com.medwaypath.dal.bo.PatientBO;
import com.medwaypath.dal.entities.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PatientMapper {
  PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

  Patient toPatientEntity(PatientBO patientBO);

  PatientBO toPatientBO(Patient patient);
}
