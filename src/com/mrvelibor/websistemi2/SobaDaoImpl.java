package com.mrvelibor.websistemi2;

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
