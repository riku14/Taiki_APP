package com.example.demo.Entry;

import java.util.Date;

import lombok.Data;

@Data
public class EntryForm {

	private String USER_ID;
	private String USER_PASS;
	private String USER_FIRSTNAME;
	private String USER_LASTNAME;
	private int USER_YUKYUBI;
	private Date UPDATE_DAY;
	private Date CREATE_DAY;
	private int IS_DLTFLG;
	private int IS_ADMINISTRATOR;
	
}
