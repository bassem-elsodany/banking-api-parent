package com.epam.boot.api.banking.domain.aggregate;

import java.util.Objects;
import com.epam.boot.api.banking.domain.aggregate.AccountBalance;
import com.epam.boot.api.banking.domain.aggregate.FromAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-11T17:53:20.183537+01:00[Europe/London]")
public class Transaction extends HashMap<String, Object>  {
  @JsonProperty("transactionID")
  private String transactionID;

  @JsonProperty("fromAccount")
  private FromAccount fromAccount;

  @JsonProperty("toAccount")
  private FromAccount toAccount;

  /**
   * Gets or Sets transactionType
   */
  public enum TransactionTypeEnum {
    ATM("atm"),
    
    DEPOSIT("deposit"),
    
    CASHWITHDRAWAL("cashWithdrawal"),
    
    SEPA("sepa"),
    
    ONLINE("online");

    private String value;

    TransactionTypeEnum(String value) {
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
    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("transactionType")
  private TransactionTypeEnum transactionType;

  @JsonProperty("transactionName")
  private String transactionName;

  @JsonProperty("transactionAmount")
  private AccountBalance transactionAmount;

  @JsonProperty("newAccountBalance")
  private AccountBalance newAccountBalance;

  @JsonProperty("postedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime postedAt;

  @JsonProperty("completedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  public Transaction transactionID(String transactionID) {
    this.transactionID = transactionID;
    return this;
  }

  /**
   * Get transactionID
   * @return transactionID
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }

  public Transaction fromAccount(FromAccount fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

  /**
   * Get fromAccount
   * @return fromAccount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public FromAccount getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(FromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }

  public Transaction toAccount(FromAccount toAccount) {
    this.toAccount = toAccount;
    return this;
  }

  /**
   * Get toAccount
   * @return toAccount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public FromAccount getToAccount() {
    return toAccount;
  }

  public void setToAccount(FromAccount toAccount) {
    this.toAccount = toAccount;
  }

  public Transaction transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction transactionName(String transactionName) {
    this.transactionName = transactionName;
    return this;
  }

  /**
   * Get transactionName
   * @return transactionName
  */
  @ApiModelProperty(value = "")


  public String getTransactionName() {
    return transactionName;
  }

  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }

  public Transaction transactionAmount(AccountBalance transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  /**
   * Get transactionAmount
   * @return transactionAmount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountBalance getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(AccountBalance transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public Transaction newAccountBalance(AccountBalance newAccountBalance) {
    this.newAccountBalance = newAccountBalance;
    return this;
  }

  /**
   * Get newAccountBalance
   * @return newAccountBalance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountBalance getNewAccountBalance() {
    return newAccountBalance;
  }

  public void setNewAccountBalance(AccountBalance newAccountBalance) {
    this.newAccountBalance = newAccountBalance;
  }

  public Transaction postedAt(OffsetDateTime postedAt) {
    this.postedAt = postedAt;
    return this;
  }

  /**
   * Get postedAt
   * @return postedAt
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getPostedAt() {
    return postedAt;
  }

  public void setPostedAt(OffsetDateTime postedAt) {
    this.postedAt = postedAt;
  }

  public Transaction completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionID, transaction.transactionID) &&
        Objects.equals(this.fromAccount, transaction.fromAccount) &&
        Objects.equals(this.toAccount, transaction.toAccount) &&
        Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.transactionName, transaction.transactionName) &&
        Objects.equals(this.transactionAmount, transaction.transactionAmount) &&
        Objects.equals(this.newAccountBalance, transaction.newAccountBalance) &&
        Objects.equals(this.postedAt, transaction.postedAt) &&
        Objects.equals(this.completedAt, transaction.completedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, fromAccount, toAccount, transactionType, transactionName, transactionAmount, newAccountBalance, postedAt, completedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionName: ").append(toIndentedString(transactionName)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    newAccountBalance: ").append(toIndentedString(newAccountBalance)).append("\n");
    sb.append("    postedAt: ").append(toIndentedString(postedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
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

