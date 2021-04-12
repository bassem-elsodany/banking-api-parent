package com.epam.boot.api.banking.domain.aggregate;

import java.util.Objects;
import com.epam.boot.api.banking.domain.aggregate.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-11T17:53:20.183537+01:00[Europe/London]")
public class Customer extends HashMap<String, Object>  {
  @JsonProperty("customerID")
  private String customerID;

  @JsonProperty("prefix")
  private String prefix;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("suffix")
  private String suffix;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("address")
  private Address address;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("ssn")
  private String ssn;

  @JsonProperty("dateOfBirth")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  public Customer customerID(String customerID) {
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

  public Customer prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
  */
  @ApiModelProperty(value = "")


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
  */
  @ApiModelProperty(value = "")


  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public Customer displayName(String displayName) {
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

  public Customer address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer ssn(String ssn) {
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

  public Customer dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerID, customer.customerID) &&
        Objects.equals(this.prefix, customer.prefix) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.suffix, customer.suffix) &&
        Objects.equals(this.displayName, customer.displayName) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.ssn, customer.ssn) &&
        Objects.equals(this.dateOfBirth, customer.dateOfBirth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerID, prefix, firstName, lastName, suffix, displayName, address, phone, email, ssn, dateOfBirth, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

