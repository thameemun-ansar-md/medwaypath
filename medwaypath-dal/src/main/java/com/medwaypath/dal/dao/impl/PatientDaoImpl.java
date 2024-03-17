package com.medwaypath.dal.dao.impl;

import com.medwaypath.dal.bo.PatientBO;
import com.medwaypath.dal.dao.PatientDao;
import com.medwaypath.dal.entities.Patient;
import com.medwaypath.dal.jpa.PatientJPARepository;
import com.medwaypath.dal.mapper.PatientMapper;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PatientDaoImpl implements PatientDao {

  @Autowired PatientJPARepository patientJPARepository;

  @Override
  public PatientBO savePatients(PatientBO patientBO) {
    Patient patient = PatientMapper.INSTANCE.toPatientEntity(patientBO);
    patientJPARepository.save(patient);
    return patientBO;
  }

  @Override
  public Optional<PatientBO> getPatients(String id) {
    return Optional.empty();
  }
}
