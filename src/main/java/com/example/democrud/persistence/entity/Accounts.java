package com.example.democrud.persistence.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "ACCOUNTS")
public class Accounts extends BaseEntity {

	@Column(name = "account", nullable = false, unique = true)
	private String  account;
	
	@Column(name = "balance", nullable = true)
	private Integer balance;
	
	  @ManyToOne
	    @JoinColumn(name = "user_atm_id", nullable = false)
	    UserAtm userAtm;
	  
	  

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public UserAtm getUserAtm() {
		return userAtm;
	}

	public void setUserAtm(UserAtm userAtm) {
		this.userAtm = userAtm;
	}
	  
	  
	
}
