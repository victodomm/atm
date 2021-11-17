package com.example.democrud.service.imp;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.democrud.mapper.AtmMapper;
import com.example.democrud.persistence.entity.UserAtm;
import com.example.democrud.persistence.repository.UserAtmRepo;
import com.example.democrud.service.AtmService;
import com.task.openapi.model.Account;
import com.task.openapi.model.Ammmount;
import com.task.openapi.model.Withdraw;

@Service
public class AtmServiceImpl implements AtmService{
	
	private final UserAtmRepo userAtmRepo;
	
	private final AtmMapper atmMapper;

	public AtmServiceImpl(UserAtmRepo userAtmRepo,
			AtmMapper atmMapper){
        this.userAtmRepo = userAtmRepo;
        this.atmMapper = atmMapper;
        
    }
	
	@Override
	public ResponseEntity<Void> createAtm() {
		return null;
	}

	@Override
	public ResponseEntity<List<Account>> getBalance(@NotNull @Valid Long id, @NotNull @Valid Integer pin,
			@NotNull @Valid String account) throws Exception {
		
		return null;
	}

	@Override
	public ResponseEntity<List<Account>> getBalanceAccounts(@NotNull @Valid Long id, @NotNull @Valid Integer pin) throws Exception{
		UserAtm userAtm =  userAtmRepo.findById(id).orElseThrow(Exception::new);
		if(userAtm.getPin().equals(pin)) {
			
		}else throw new Exception();
		return null;
		
	}

	@Override
	public ResponseEntity<List<Ammmount>> withdrawMoney(@Valid Withdraw withdraw) {
		return null;
	}

}
