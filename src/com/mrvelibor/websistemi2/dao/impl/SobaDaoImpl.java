package com.mrvelibor.websistemi2.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mrvelibor.websistemi2.dao.SobaDao;
import com.mrvelibor.websistemi2.mapper.SobaMapper;
import com.mrvelibor.websistemi2.model.Soba;

public class SobaDaoImpl implements SobaDao {
	
	private JdbcTemplate jdbcTemplate;
	@SuppressWarnings("unused")
	private DataSource dataSource;
	
	@Override
	public int getCount() {
		String sql = "SELECT COUNT(*) FROM SOBE";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public boolean addSoba(Soba soba) {
		String sql = "INSERT INTO SOBE(broj_kreveta, velicina, kupatilo, tv, klima, cena_po_danu)"
				+ "VALUES(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {soba.getBrojKreveta(), soba.getVelicina(), soba.getKupatilo(), soba.getTv(), soba.getKlima(), soba.getCenaPoDanu()});
		return true;
	}

	@Override
	public List<Soba> getAllSoba() {
		String sql = "SELECT * FROM SOBE";
		List<Soba> sobe = jdbcTemplate.query(sql, new SobaMapper());
		return sobe;
	}
	
}
