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
 * Bank
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-11T17:53:20.183537+01:00[Europe/London]")
public class Bank extends HashMap<String, Object>  {
  @JsonProperty("bankCode")
  private String bankCode;

  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("routingNumber")
  private String routingNumber;

  @JsonProperty("swiftBIC")
  private String swiftBIC;

  public Bank bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Get bankCode
   * @return bankCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public Bank bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Bank routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

  /**
   * Get routingNumber
   * @return routingNumber
  */
  @ApiModelProperty(value = "")


  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public Bank swiftBIC(String swiftBIC) {
    this.swiftBIC = swiftBIC;
    return this;
  }

  /**
   * Get swiftBIC
   * @return swiftBIC
  */
  @ApiModelProperty(value = "")


  public String getSwiftBIC() {
    return swiftBIC;
  }

  public void setSwiftBIC(String swiftBIC) {
    this.swiftBIC = swiftBIC;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bank bank = (Bank) o;
    return Objects.equals(this.bankCode, bank.bankCode) &&
        Objects.equals(this.bankName, bank.bankName) &&
        Objects.equals(this.routingNumber, bank.routingNumber) &&
        Objects.equals(this.swiftBIC, bank.swiftBIC) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, bankName, routingNumber, swiftBIC, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bank {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    swiftBIC: ").append(toIndentedString(swiftBIC)).append("\n");
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

