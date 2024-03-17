package com.medwaypath.dal.utils;

import java.io.Serializable;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PatientIdGenerator implements IdentifierGenerator {
  @Override
  public Serializable generate(SharedSessionContractImplementor session, Object object) {
    // Generate 10 random digits
    String randomDigits = String.valueOf((long) (Math.random() * 10000000000L));

    // Get the prefix from the object
    //  String prefix = ((Patient) object).getPrefix();

    // Concatenate the prefix with the random digits
    return "MPW" + randomDigits;
  }
}
