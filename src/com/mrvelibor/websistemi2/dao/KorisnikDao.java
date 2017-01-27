package com.mrvelibor.websistemi2.dao;

import java.util.List;

import com.mrvelibor.websistemi2.model.Korisnik;

public interface KorisnikDao {
	
	int getCount();	
	List<Korisnik> getAllKorisnik();	
	boolean addKorisnik(Korisnik korisnik);	
	List<Korisnik> getKorisnikByRole(int roleId);

}
