package com.medwaypath.dal.dao;

import com.medwaypath.dal.bo.PatientBO;
import java.util.Optional;

public interface PatientDao {
  PatientBO savePatients(PatientBO user);

  Optional<PatientBO> getPatients(String id);
}
