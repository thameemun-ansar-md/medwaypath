package com.medwaypath.dal.entities;

import com.medwaypath.common.constants.MPWDalConstants;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Patients")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
  @Id
  @GeneratedValue(generator = "patientIdGenerator")
  @GenericGenerator(
      name = "patientIdGenerator",
      strategy = "com.medwaypath.dal.utils.PatientIdGenerator")
  private String patientId;

  @Transient private String prefix = MPWDalConstants.PATIENT_PREFIX;

  private String name;
  private Date dateOfBirth;
  private String gender;
  private String contactNumber;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address address;
}
