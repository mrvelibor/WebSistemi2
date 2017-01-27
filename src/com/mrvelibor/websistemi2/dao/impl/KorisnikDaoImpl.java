package com.mrvelibor.websistemi2.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mrvelibor.websistemi2.dao.KorisnikDao;
import com.mrvelibor.websistemi2.mapper.KorisnikMapper;
import com.mrvelibor.websistemi2.model.Korisnik;

public class KorisnikDaoImpl implements KorisnikDao {
	
	private JdbcTemplate jdbcTemplate;
	@SuppressWarnings("unused")
	private DataSource dataSource;

	@Override
	public int getCount() {
		String sql = "SELECT COUNT(*) FROM KORISNICI";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<Korisnik> getAllKorisnik() {
		String sql = "SELECT * FROM KORISNICI";
		List<Korisnik> korisnici = jdbcTemplate.query(sql, new KorisnikMapper());
		return korisnici;
	}

	@Override
	public boolean addKorisnik(Korisnik korisnik) {
		String sql = "INSERT INTO KORISNICI(username, password, enabled)"
				+ "VALUES(?,?,?)";
		jdbcTemplate.update(sql, new Object[] {korisnik.getUsername(), korisnik.getPassword(), korisnik.getEnabled()});
		return true;
	}

	@Override
	public List<Korisnik> getKorisnikByRole(int roleId) {
		String sql = "SELECT * FROM KORISNICI LEFT JOIN KORISNICI_ROLE ON KORISNICI.username = KORISNICI_ROLE.username"
				+ "WHERE user_role = ?";
		List<Korisnik> korisnici = jdbcTemplate.query(sql, new Object[] { roleId }, new KorisnikMapper());
		return korisnici;
	}

}
