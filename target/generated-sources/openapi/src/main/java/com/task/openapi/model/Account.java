package com.task.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T09:40:08.717170+01:00[Europe/Madrid]")
public class Account   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("balance")
  private Float balance;

  @JsonProperty("maxWithdrawal")
  private Integer maxWithdrawal;

  public Account accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @ApiModelProperty(value = "")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Account balance(Float balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  */
  @ApiModelProperty(value = "")


  public Float getBalance() {
    return balance;
  }

  public void setBalance(Float balance) {
    this.balance = balance;
  }

  public Account maxWithdrawal(Integer maxWithdrawal) {
    this.maxWithdrawal = maxWithdrawal;
    return this;
  }

  /**
   * Get maxWithdrawal
   * @return maxWithdrawal
  */
  @ApiModelProperty(value = "")


  public Integer getMaxWithdrawal() {
    return maxWithdrawal;
  }

  public void setMaxWithdrawal(Integer maxWithdrawal) {
    this.maxWithdrawal = maxWithdrawal;
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
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.maxWithdrawal, account.maxWithdrawal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, balance, maxWithdrawal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    maxWithdrawal: ").append(toIndentedString(maxWithdrawal)).append("\n");
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

