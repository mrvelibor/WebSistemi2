package com.mrvelibor.websistemi2.dao;

import java.util.List;

import com.mrvelibor.websistemi2.model.Soba;

public interface SobaDao {

	int getCount();
	boolean addSoba(Soba soba);
	List<Soba> getAllSoba();
	
}
