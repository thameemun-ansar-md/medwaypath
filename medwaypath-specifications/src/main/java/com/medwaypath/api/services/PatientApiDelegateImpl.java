package com.medwaypath.api.services;

import com.medwaypath.dal.dao.PatientDao;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.openapitools.api.PatientsApi;
import org.openapitools.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientApiDelegateImpl implements PatientsApi {
  @Autowired PatientDao patientDao;

  @Override
  public ResponseEntity<Patient> createPatient(@Valid Patient patient, @Valid String mode) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<List<Patient>> getAllPatients(
      @Min(1) @Valid Integer page, @Min(1) @Max(100) @Valid Integer pageSize) {
    return null;
  }

  @Override
  public ResponseEntity<Patient> getPatientById(String patientId) {
    return null;
  }
}
