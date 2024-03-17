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
@Table(name = "Slots")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Slot {
  @Id private String slotId;

  @ManyToOne
  @JoinColumn(name = "doctor_id", referencedColumnName = "doctorId")
  private Doctor doctor;

  private Date startTime;
  private Date endTime;
  private String status;
}
