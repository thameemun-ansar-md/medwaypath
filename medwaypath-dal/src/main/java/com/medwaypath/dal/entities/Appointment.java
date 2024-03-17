package com.medwaypath.dal.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Appointments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
  @Id private String appointmentId;

  @ManyToOne
  @JoinColumn(name = "patient_id", referencedColumnName = "patientId")
  private Patient patient;

  @ManyToOne
  @JoinColumn(name = "doctor_id", referencedColumnName = "doctorId")
  private Doctor doctor;

  private Date appointmentDateTime;
  private String status;
  private String notes;
}
