package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MedwaypathException
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-17T17:49:25.134+05:30[Asia/Calcutta]")
public class MedwaypathException {

  @JsonProperty("message")
  private String message;

  @JsonProperty("code")
  private String code;

  @JsonProperty("details")
  private Object details;

  public MedwaypathException message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable message describing the error.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "A human-readable message describing the error.", required = true)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MedwaypathException code(String code) {
    this.code = code;
    return this;
  }

  /**
   * An error code indicating the type of error.
   * @return code
  */
  @NotNull 
  @Schema(name = "code", description = "An error code indicating the type of error.", required = true)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public MedwaypathException details(Object details) {
    this.details = details;
    return this;
  }

  /**
   * Additional details about the error (optional).
   * @return details
  */
  
  @Schema(name = "details", description = "Additional details about the error (optional).", required = false)
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MedwaypathException medwaypathException = (MedwaypathException) o;
    return Objects.equals(this.message, medwaypathException.message) &&
        Objects.equals(this.code, medwaypathException.code) &&
        Objects.equals(this.details, medwaypathException.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedwaypathException {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

