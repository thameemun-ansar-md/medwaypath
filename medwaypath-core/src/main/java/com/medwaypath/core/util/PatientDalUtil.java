package com.medwaypath.core.util;

import com.medwaypath.dal.entities.Patient;
import org.springframework.stereotype.Component;

@Component
public interface PatientDalUtil {
  Patient create(Patient patient);
}
