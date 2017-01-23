package com.mrvelibor.websistemi2.dao.impl;

import com.mrvelibor.websistemi2.dao.SobaDao;

public class SobaDaoImpl implements SobaDao {

	@Override
	public void addSoba() {
		System.out.println("Dodajem sobu");
	}

	@Override
	public String addSobaRet() {
		System.out.println("Dodajem sobu return.");
		return "Dodata";
	}

	
}
