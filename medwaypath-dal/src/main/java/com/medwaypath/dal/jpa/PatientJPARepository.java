package com.medwaypath.dal.jpa;

import com.medwaypath.dal.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientJPARepository extends JpaRepository<Patient, String> {}
