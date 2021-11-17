package com.example.democrud.persistence.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ATM")
public class UserAtm extends BaseEntity {

	@Column(name = "max_withdrawal", nullable = false)
	private Integer maxWithdrawal;
	
	
	@Column(name = "pin", nullable = false)
	private Integer pin;
	
	@OneToMany(mappedBy = "userAtm", cascade = CascadeType.ALL)
    Set<Accounts> accounts;

	public Integer getMaxWithdrawal() {
		return maxWithdrawal;
	}

	public void setMaxWithdrawal(Integer maxWithdrawal) {
		this.maxWithdrawal = maxWithdrawal;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public Set<Accounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Accounts> accounts) {
		this.accounts = accounts;
	}
	
	
	
}