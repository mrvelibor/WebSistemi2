package com.mrvelibor.websistemi2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mrvelibor.websistemi2.dao.KorisnikDao;
import com.mrvelibor.websistemi2.model.Korisnik;
import com.mrvelibor.websistemi2.model.KorisnikRola;

@RestController
public class KorisnikRestController {

	@Autowired
	private KorisnikDao korisnikDao;

	@RequestMapping(value = "/korisnici ", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Korisnik>> getKorisnici() {
		System.out.println("Fetching korisnici");
		List<Korisnik> sobe = korisnikDao.getAllKorisnik();
		if (sobe.size() == 0) {
			System.out.println("Korisnik list empty");
			return new ResponseEntity<List<Korisnik>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Korisnik>>(sobe, HttpStatus.OK);
	}

	@RequestMapping(value = "/korisnici ", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Korisnik>> getKorisnici(@RequestParam KorisnikRola rola) {
		System.out.println("Fetching korisnici with rola " + rola);
		List<Korisnik> sobe = korisnikDao.getKorisnikByRole(rola.getRoldeId());
		if (sobe.size() == 0) {
			System.out.println("Korisnik list empty");
			return new ResponseEntity<List<Korisnik>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Korisnik>>(sobe, HttpStatus.OK);
	}

	@RequestMapping(value = "/korisnik/", method = RequestMethod.POST)
	public ResponseEntity<Void> addSoba(@RequestBody Korisnik korisnik) {
		System.out.println("Adding korisnik " + korisnik.toString());
		korisnikDao.addKorisnik(korisnik);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/korisnikcount/", method = RequestMethod.POST)
	public ResponseEntity<Integer> countKorisnik() {
		System.out.println("Counting korisnici");
		int count = korisnikDao.getCount();
		return new ResponseEntity<Integer>(count, HttpStatus.CREATED);
	}

}
