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
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-11T17:53:20.183537+01:00[Europe/London]")
public class Address extends HashMap<String, Object>  {
  @JsonProperty("addressLine1")
  private String addressLine1;

  @JsonProperty("addressLine2")
  private String addressLine2;

  @JsonProperty("city")
  private String city;

  @JsonProperty("zipCode")
  private String zipCode;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Get addressLine1
   * @return addressLine1
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Get addressLine2
   * @return addressLine2
  */
  @ApiModelProperty(value = "")


  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.zipCode, address.zipCode) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, zipCode, state, country, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

