package com.medwaypath.api.util;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(
    componentModel = "spring",
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PatientMapperBO {
  PatientMapperBO INSTANCE = Mappers.getMapper(PatientMapperBO.class);

  // PatientBO toPatientEntity(Patient patient);
}
