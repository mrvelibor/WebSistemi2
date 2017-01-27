package com.mrvelibor.websistemi2.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mrvelibor.websistemi2.model.Korisnik;

public class KorisnikMapper implements RowMapper<Korisnik> {

	@Override
	public Korisnik mapRow(ResultSet rs, int rowNum) throws SQLException {
		Korisnik korisnik = new Korisnik();
		korisnik.setUsername(rs.getString("username"));
		korisnik.setPassword(rs.getString("password"));
		korisnik.setEnabled(rs.getBoolean("enabled"));
		return korisnik;
	}

}
