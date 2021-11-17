package com.example.democrud.utils;

import java.util.HashMap;
import java.util.Map;

public enum BillNoteEnum {
    FIFTY(50),
    TWENTY(20),
    TEN(10),
	FIVE(5);

    private static final Map<Integer, BillNoteEnum> VALUE = new HashMap<>();
    
    static {
        for (BillNoteEnum e : values()) {
        	VALUE.put(e.value, e);
        }
    }

    public final int value;

    private BillNoteEnum( int value) {
        this.value = value;
    }


    public static BillNoteEnum valueOfBillNote(int value) {
        return VALUE.get(value);
    }


	public int getValue() {
		return value;
	}
    
     

  
}