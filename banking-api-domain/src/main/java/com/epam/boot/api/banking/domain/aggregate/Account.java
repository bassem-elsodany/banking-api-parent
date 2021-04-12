package com.epam.boot.api.banking.domain.aggregate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-11T17:53:20.183537+01:00[Europe/London]")
public class Account extends HashMap<String, Object>  {
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

  public Account accountID(String accountID) {
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

  public Account accountType(AccountTypeEnum accountType) {
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

  public Account accountNumber(String accountNumber) {
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

  public Account accountOwner(List<Items> accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

  public Account addAccountOwnerItem(Items accountOwnerItem) {
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

  public Account accountBalance(AccountBalance accountBalance) {
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

  public Account IBAN(String IBAN) {
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

  public Account bank(Bank bank) {
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

  public Account interestRate(Double interestRate) {
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

  public Account createdAt(OffsetDateTime createdAt) {
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

  public Account modifiedAt(OffsetDateTime modifiedAt) {
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
    Account account = (Account) o;
    return Objects.equals(this.accountID, account.accountID) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.accountOwner, account.accountOwner) &&
        Objects.equals(this.accountBalance, account.accountBalance) &&
        Objects.equals(this.IBAN, account.IBAN) &&
        Objects.equals(this.bank, account.bank) &&
        Objects.equals(this.interestRate, account.interestRate) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.modifiedAt, account.modifiedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountID, accountType, accountNumber, accountOwner, accountBalance, IBAN, bank, interestRate, createdAt, modifiedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
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

