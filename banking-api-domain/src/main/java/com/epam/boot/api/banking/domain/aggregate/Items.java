package com.epam.boot.api.banking.domain.aggregate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-11T17:53:20.183537+01:00[Europe/London]")
public class Items extends HashMap<String, Object>  {
  @JsonProperty("customerID")
  private String customerID;

  @JsonProperty("ssn")
  private String ssn;

  @JsonProperty("displayName")
  private String displayName;

  public Items customerID(String customerID) {
    this.customerID = customerID;
    return this;
  }

  /**
   * Get customerID
   * @return customerID
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public Items ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * Get ssn
   * @return ssn
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public Items displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Items items = (Items) o;
    return Objects.equals(this.customerID, items.customerID) &&
        Objects.equals(this.ssn, items.ssn) &&
        Objects.equals(this.displayName, items.displayName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerID, ssn, displayName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Items {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

