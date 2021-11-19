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
		this.fiftyNote = 10;
		this.twentyNote = 30;
		this.tenNote = 30;
		this.fiveNote = 20;
	}

	
	public Integer getBalanceAtm() {
		return this.fiftyNote *BillNoteEnum.FIFTY.getValue()*10+
		this.twentyNote* BillNoteEnum.TWENTY.getValue()*30+
		this.tenNote * BillNoteEnum.TEN.getValue()*30+
		this.fiveNote *BillNoteEnum.FIVE.getValue()*20;
	}


	public Integer getFiftyNote() {
		return fiftyNote;
	}


	public void setFiftyNote(Integer fiftyNote) {
		this.fiftyNote = fiftyNote;
	}


	public Integer getTwentyNote() {
		return twentyNote;
	}


	public void setTwentyNote(Integer twentyNote) {
		this.twentyNote = twentyNote;
	}


	public Integer getTenNote() {
		return tenNote;
	}


	public void setTenNote(Integer tenNote) {
		this.tenNote = tenNote;
	}


	public Integer getFiveNote() {
		return fiveNote;
	}


	public void setFiveNote(Integer fiveNote) {
		this.fiveNote = fiveNote;
	}
	
	
	
}
