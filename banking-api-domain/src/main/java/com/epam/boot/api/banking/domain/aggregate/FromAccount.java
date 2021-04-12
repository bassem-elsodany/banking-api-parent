package com.epam.boot.api.banking.domain.aggregate;

import java.util.Objects;
import com.epam.boot.api.banking.domain.aggregate.AccountBalance;
import com.epam.boot.api.banking.domain.aggregate.Bank;
import com.epam.boot.api.banking.domain.aggregate.Items;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FromAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-11T17:53:20.183537+01:00[Europe/London]")
public class FromAccount extends HashMap<String, Object>  {
  @JsonProperty("accountID")
  private String accountID;

  /**
   * Gets or Sets accountType
   */
  public enum AccountTypeEnum {
    CHECKING("Checking"),
    
    SAVINGS("Savings"),
    
    OVERDRAFT_SAVINGS("Overdraft Savings"),
    
    CREDIT_CARD("Credit Card");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("accountType")
  private AccountTypeEnum accountType;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("accountOwner")
  @Valid
  private List<Items> accountOwner = new ArrayList<>();

  @JsonProperty("accountBalance")
  private AccountBalance accountBalance;

  @JsonProperty("IBAN")
  private String IBAN;

  @JsonProperty("bank")
  private Bank bank;

  @JsonProperty("interestRate")
  private Double interestRate;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("modifiedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedAt;

  public FromAccount accountID(String accountID) {
    this.accountID = accountID;
    return this;
  }

  /**
   * Get accountID
   * @return accountID
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountID() {
    return accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }

  public FromAccount accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public FromAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public FromAccount accountOwner(List<Items> accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

  public FromAccount addAccountOwnerItem(Items accountOwnerItem) {
    this.accountOwner.add(accountOwnerItem);
    return this;
  }

  /**
   * Get accountOwner
   * @return accountOwner
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Items> getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(List<Items> accountOwner) {
    this.accountOwner = accountOwner;
  }

  public FromAccount accountBalance(AccountBalance accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * Get accountBalance
   * @return accountBalance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountBalance getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(AccountBalance accountBalance) {
    this.accountBalance = accountBalance;
  }

  public FromAccount IBAN(String IBAN) {
    this.IBAN = IBAN;
    return this;
  }

  /**
   * Get IBAN
   * @return IBAN
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Pattern(regexp="^[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}$") 
  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  public FromAccount bank(Bank bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Get bank
   * @return bank
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public FromAccount interestRate(Double interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * Get interestRate
   * @return interestRate
  */
  @ApiModelProperty(value = "")


  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public FromAccount createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FromAccount modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Get modifiedAt
   * @return modifiedAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FromAccount fromAccount = (FromAccount) o;
    return Objects.equals(this.accountID, fromAccount.accountID) &&
        Objects.equals(this.accountType, fromAccount.accountType) &&
        Objects.equals(this.accountNumber, fromAccount.accountNumber) &&
        Objects.equals(this.accountOwner, fromAccount.accountOwner) &&
        Objects.equals(this.accountBalance, fromAccount.accountBalance) &&
        Objects.equals(this.IBAN, fromAccount.IBAN) &&
        Objects.equals(this.bank, fromAccount.bank) &&
        Objects.equals(this.interestRate, fromAccount.interestRate) &&
        Objects.equals(this.createdAt, fromAccount.createdAt) &&
        Objects.equals(this.modifiedAt, fromAccount.modifiedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, accountType, accountNumber, accountOwner, accountBalance, IBAN, bank, interestRate, createdAt, modifiedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FromAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

