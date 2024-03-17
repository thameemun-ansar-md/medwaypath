package com.medwaypath.dal.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressBO {
  private String street;
  private String city;
  private String state;
  private String postalCode;
}
