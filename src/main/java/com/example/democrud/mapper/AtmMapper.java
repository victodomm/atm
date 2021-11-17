package com.example.democrud.mapper;

import org.mapstruct.Mapper;

import com.example.democrud.persistence.entity.UserAtm;

@Mapper(componentModel = "spring")
public interface AtmMapper {

	
	com.task.openapi.model.Account EntityAccountToEntityModel(UserAtm userAtm);
	
}
