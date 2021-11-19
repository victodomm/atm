package com.example.democrud.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.democrud.mapper.AtmMapper;
import com.example.democrud.persistence.entity.Accounts;
import com.example.democrud.persistence.entity.Atm;
import com.example.democrud.persistence.entity.UserAtm;
import com.example.democrud.persistence.repository.AtmRepo;
import com.example.democrud.persistence.repository.UserAtmRepo;
import com.example.democrud.service.AtmService;
import com.example.democrud.utils.BillNoteEnum;
import com.task.openapi.model.Account;
import com.task.openapi.model.Ammmount;
import com.task.openapi.model.Withdraw;

@Service
public class AtmServiceImpl implements AtmService{
	
	private final UserAtmRepo userAtmRepo;
	
	private final AtmMapper atmMapper;
	
	private final AtmRepo atmRepo;

	public AtmServiceImpl(UserAtmRepo userAtmRepo,
			AtmMapper atmMapper, AtmRepo atmRepo){
        this.userAtmRepo = userAtmRepo;
        this.atmMapper = atmMapper;
        this.atmRepo = atmRepo;
        
    }
	
	@Override
	public ResponseEntity<Void> createAtm() {
		return null;
	}

	@Override
	public ResponseEntity<Account> getBalance(@NotNull @Valid Long id, @NotNull @Valid Integer pin,
			@NotNull @Valid String account) throws Exception {
		
		UserAtm userAtm =  findUser(id);
		if(!pin(userAtm,pin)) throw new Exception();
		return new ResponseEntity<Account>(atmMapper.EntityAccountToEntityModelDto(userAtm.getAccounts().stream().filter(item -> 
		!account.equals(item.getAccount())).findAny().orElseThrow(Exception::new)), HttpStatus.OK);
		
	}

	@Override
	public ResponseEntity<List<Account>> getBalanceAccounts(@NotNull @Valid Long id, @NotNull @Valid Integer pin) throws Exception{
		UserAtm userAtm =  findUser(id);
		if(pin(userAtm,pin)) throw new Exception();
		return new ResponseEntity<List<Account>>(atmMapper.EntityAccountListToEntityModelListDto(userAtm.getAccounts()), 
				HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Ammmount>> withdrawMoney(@Valid Withdraw withdraw) throws Exception {
		
		Atm atm = atmRepo.findById(withdraw.getAtmId()).orElseThrow(Exception::new);
		List<Ammmount> ret = new ArrayList<>();
		
		UserAtm userAtm =  findUser(withdraw.getId());
		if(!pin( userAtm,withdraw.getPin()))throw new Exception();
		Accounts userAccount = userAtm.getAccounts().stream().filter(item -> 
		!withdraw.getAccountId().equals(item.getAccount())).findAny().orElseThrow(Exception::new);
		if(userAccount.getBalance()<withdraw.getAmmmount()|| withdraw.getAmmmount()>atm.getBalanceAtm())throw new Exception();
		int ammount= withdraw.getAmmmount();
		while (ammount>0) {
			
			if(ammount>=BillNoteEnum.FIFTY.value && atm.getFiftyNote()>0) {
				ammount-=BillNoteEnum.FIFTY.value;
				atm.setFiftyNote(atm.getFiftyNote()-1);
				ret.add(Ammmount.NUMBER_50);
				
			}else if(ammount>=BillNoteEnum.TWENTY.value && atm.getTwentyNote()>0) {
				ammount-=BillNoteEnum.TWENTY.value;
				atm.setFiftyNote(atm.getTwentyNote()-1);
				ret.add(Ammmount.NUMBER_20);
			}else if(ammount>=BillNoteEnum.TEN.value && atm.getTenNote()>0) {
				ammount-=BillNoteEnum.TEN.value;
				atm.setFiftyNote(atm.getTenNote()-1);
				ret.add(Ammmount.NUMBER_10);
			}else if(ammount>=BillNoteEnum.FIVE.value && atm.getFiveNote()>0) {
				ammount-=BillNoteEnum.FIVE.value;
				atm.setFiftyNote(atm.getFiveNote()-1);
				ret.add(Ammmount.NUMBER_5);
			}
		}
		return new ResponseEntity<List<Ammmount>>(ret, HttpStatus.OK);
		
	}
	
	private boolean pin(UserAtm userAtm,Integer pin) {
		return userAtm.getPin().equals(pin);
	}
	
	private UserAtm findUser(Long id) throws Exception{
		return userAtmRepo.findById(id).orElseThrow(Exception::new);
			
	}

	

}
