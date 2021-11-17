package com.example.democrud.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;

import com.task.openapi.model.Account;
import com.task.openapi.model.Ammmount;
import com.task.openapi.model.Withdraw;

public interface AtmService {

	ResponseEntity<Void> createAtm();

	ResponseEntity<List<Account>> getBalance(@NotNull @Valid Long id, @NotNull @Valid Integer pin,
			@NotNull @Valid String account) throws Exception;

	ResponseEntity<List<Account>> getBalanceAccounts(@NotNull @Valid Long id, @NotNull @Valid Integer pin) throws Exception;

	ResponseEntity<List<Ammmount>> withdrawMoney(@Valid Withdraw withdraw);

}
