package com.example.demo.Entry;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	
	public int insertOne(EntryModel entryModel);
		
	
	
	
}
