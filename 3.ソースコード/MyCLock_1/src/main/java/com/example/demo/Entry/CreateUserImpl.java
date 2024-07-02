package com.example.demo.Entry;

import org.springframework.beans.factory.annotation.Autowired;

public class CreateUserImpl implements CreateUser {

	@Autowired
	private UserMapper usermapper;
	@Override
	public void creatUser(EntryModel entryModel){
		usermapper.insertOne(entryModel);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
