package com.medwaypath.dal.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Doctors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
  @Id private String doctorId;
  private String name;
  private String specialization;
  private String contactNumber;
  private String clinic;
}
