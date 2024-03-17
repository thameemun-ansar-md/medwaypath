package com.medwaypath.dal.bo;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PatientBO {
  private String name;
  private Date dateOfBirth;
  private String gender;
  private String contactNumber;
  private AddressBO address;
}
