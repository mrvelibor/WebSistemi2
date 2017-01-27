package com.mrvelibor.websistemi2.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mrvelibor.websistemi2.dao.KorisnikRolaDao;
import com.mrvelibor.websistemi2.mapper.KorisnikRolaMapper;
import com.mrvelibor.websistemi2.model.KorisnikRola;

public class KorisnikRolaDaoImpl implements KorisnikRolaDao {
	
	private JdbcTemplate jdbcTemplate;
	@SuppressWarnings("unused")
	private DataSource dataSource;

	@Override
	public List<KorisnikRola> getAllRola() {
		String sql = "SELECT * FROM KORISNIK_ROLE";
		List<KorisnikRola> role = jdbcTemplate.query(sql, new KorisnikRolaMapper());
		return role;
	}

}
