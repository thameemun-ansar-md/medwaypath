package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Patient
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-17T17:49:25.134+05:30[Asia/Calcutta]")
public class Patient {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("dob")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dob;

  /**
   * The gender of the patient
   */
  public enum GenderEnum {
    MALE("Male"),
    
    FEMALE("Female"),
    
    OTHER("Other");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("contact")
  private String contact;

  public Patient id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the patient
   * @return id
  */
  @Size(min = 12) 
  @Schema(name = "id", description = "The unique identifier for the patient", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Patient name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the patient
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the patient", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Patient dob(OffsetDateTime dob) {
    this.dob = dob;
    return this;
  }

  /**
   * The date of birth of the patient
   * @return dob
  */
  @NotNull @Valid 
  @Schema(name = "dob", description = "The date of birth of the patient", required = true)
  public OffsetDateTime getDob() {
    return dob;
  }

  public void setDob(OffsetDateTime dob) {
    this.dob = dob;
  }

  public Patient gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The gender of the patient
   * @return gender
  */
  
  @Schema(name = "gender", description = "The gender of the patient", required = false)
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Patient contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * The contact information of the patient
   * @return contact
  */
  
  @Schema(name = "contact", description = "The contact information of the patient", required = false)
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.id, patient.id) &&
        Objects.equals(this.name, patient.name) &&
        Objects.equals(this.dob, patient.dob) &&
        Objects.equals(this.gender, patient.gender) &&
        Objects.equals(this.contact, patient.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dob, gender, contact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

