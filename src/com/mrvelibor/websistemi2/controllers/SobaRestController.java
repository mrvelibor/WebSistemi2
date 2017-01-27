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
import org.springframework.web.bind.annotation.RestController;

import com.mrvelibor.websistemi2.dao.SobaDao;
import com.mrvelibor.websistemi2.model.Soba;

@RestController
public class SobaRestController {

	@Autowired
	private SobaDao sobaDao;

	@RequestMapping(value = "/sobe ", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Soba>> getProducts() {
		System.out.println("Fetching sobe");
		List<Soba> sobe = sobaDao.getAllSoba();
		if (sobe.size() == 0) {
			System.out.println("Soba list empty");
			return new ResponseEntity<List<Soba>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Soba>>(sobe, HttpStatus.OK);
	}

	@RequestMapping(value = "/soba/", method = RequestMethod.POST)
	public ResponseEntity<Void> addSoba(@RequestBody Soba soba) {
		System.out.println("Adding soba " + soba.toString());
		sobaDao.addSoba(soba);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/sobacount/", method = RequestMethod.POST)
	public ResponseEntity<Integer> countSoba() {
		System.out.println("Counting sobe");
		int count = sobaDao.getCount();
		return new ResponseEntity<Integer>(count, HttpStatus.CREATED);
	}

}
