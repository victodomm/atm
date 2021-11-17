package com.example.democrud.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.democrud.utils.BillNoteEnum;

@Entity
@Table(name = "ATM")
public class Atm extends BaseEntity {

	@Column(name = "fifty_note", nullable = false, unique = true)
	private Integer fiftyNote;
	
	@Column(name = "twenty_note", nullable = false, unique = true)
	private Integer twentyNote;
	
	@Column(name = "ten_note", nullable = false, unique = true)
	private Integer tenNote;
	
	@Column(name = "five_note", nullable = false, unique = true)
	private Integer fiveNote;
	
	public Atm() {
		super();
		this.fiftyNote = BillNoteEnum.FIFTY.getValue()*10;
		this.twentyNote = BillNoteEnum.TWENTY.getValue()*30;
		this.tenNote = BillNoteEnum.TEN.getValue()*30;
		this.fiveNote = BillNoteEnum.FIVE.getValue()*20;
	}

	
	
}
