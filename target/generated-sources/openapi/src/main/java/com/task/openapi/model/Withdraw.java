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
 * Withdraw
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-22T09:51:45.039893+01:00[Europe/Madrid]")
public class Withdraw   {
  @JsonProperty("atmId")
  private Long atmId;

  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("pin")
  private Integer pin;

  @JsonProperty("ammmount")
  private Integer ammmount;

  public Withdraw atmId(Long atmId) {
    this.atmId = atmId;
    return this;
  }

  /**
   * Get atmId
   * @return atmId
  */
  @ApiModelProperty(value = "")


  public Long getAtmId() {
    return atmId;
  }

  public void setAtmId(Long atmId) {
    this.atmId = atmId;
  }

  public Withdraw accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  @ApiModelProperty(value = "")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Withdraw id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Withdraw pin(Integer pin) {
    this.pin = pin;
    return this;
  }

  /**
   * Get pin
   * @return pin
  */
  @ApiModelProperty(value = "")


  public Integer getPin() {
    return pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }

  public Withdraw ammmount(Integer ammmount) {
    this.ammmount = ammmount;
    return this;
  }

  /**
   * Get ammmount
   * @return ammmount
  */
  @ApiModelProperty(value = "")


  public Integer getAmmmount() {
    return ammmount;
  }

  public void setAmmmount(Integer ammmount) {
    this.ammmount = ammmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Withdraw withdraw = (Withdraw) o;
    return Objects.equals(this.atmId, withdraw.atmId) &&
        Objects.equals(this.accountId, withdraw.accountId) &&
        Objects.equals(this.id, withdraw.id) &&
        Objects.equals(this.pin, withdraw.pin) &&
        Objects.equals(this.ammmount, withdraw.ammmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atmId, accountId, id, pin, ammmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Withdraw {\n");
    
    sb.append("    atmId: ").append(toIndentedString(atmId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    ammmount: ").append(toIndentedString(ammmount)).append("\n");
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

