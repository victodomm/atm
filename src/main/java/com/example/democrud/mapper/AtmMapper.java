package com.example.democrud.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.http.ResponseEntity;

import com.example.democrud.persistence.entity.Accounts;
import com.task.openapi.model.Account;

@Mapper(componentModel = "spring")
public interface AtmMapper {

	@IterableMapping(qualifiedByName = "EntityAccountToEntityModel")
	List<Account> EntityAccountListToEntityModelListDto(List<Accounts> list);
	
	@Named("EntityAccountToEntityModel")
	@Mapping(target="accountId", source="account.account")
	com.task.openapi.model.Account EntityAccountToEntityModelDto(Accounts account);
	
}
