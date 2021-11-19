package com.example.democrud.persistence.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("balance")
  private Float balance;

  @JsonProperty("maxWithdrawal")
  private Integer maxWithdrawal;

public Long getAccountId() {
	return accountId;
}

public void setAccountId(Long accountId) {
	this.accountId = accountId;
}

public Float getBalance() {
	return balance;
}

public void setBalance(Float balance) {
	this.balance = balance;
}

public Integer getMaxWithdrawal() {
	return maxWithdrawal;
}

public void setMaxWithdrawal(Integer maxWithdrawal) {
	this.maxWithdrawal = maxWithdrawal;
}


}

