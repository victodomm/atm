package com.example.democrud.controller.rest;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrud.service.AtmService;
import com.task.openapi.api.AtmApi;
import com.task.openapi.model.Account;
import com.task.openapi.model.Ammmount;
import com.task.openapi.model.Withdraw;

@RestController
public class AtmController implements AtmApi {
	
	AtmService atmService;
	
	public AtmController(AtmService atmService){
		this.atmService = atmService;
	}
	
	
	@Override
	public ResponseEntity<Void> createAtm() {
		return atmService.createAtm();
	}

	@Override
	public ResponseEntity<Account> getBalance(@NotNull @Valid Long id, @NotNull @Valid Integer pin,
			@NotNull @Valid String account) {
		try {
			return atmService.getBalance(id, pin, account);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public ResponseEntity<List<Account>> getBalanceAccounts(@NotNull @Valid Long id, @NotNull @Valid Integer pin) {
		// TODO Auto-generated method stub
		try {
			return atmService.getBalanceAccounts(id, pin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public ResponseEntity<List<Ammmount>> withdrawMoney(@Valid Withdraw withdraw) {
		// TODO Auto-generated method stub
		try {
			return atmService.withdrawMoney(withdraw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}
