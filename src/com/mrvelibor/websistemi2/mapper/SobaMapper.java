package com.mrvelibor.websistemi2.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mrvelibor.websistemi2.model.Soba;

public class SobaMapper implements RowMapper<Soba> {

	@Override
	public Soba mapRow(ResultSet rs, int rowNum) throws SQLException {
		Soba soba = new Soba();
		soba.setBrojKreveta(rs.getInt("broj_kreveta"));
		soba.setCenaPoDanu(rs.getFloat("cena_po_danu"));
		soba.setKlima(rs.getBoolean("klima"));
		soba.setKupatilo(rs.getBoolean("kupatilo"));
		soba.setTv(rs.getBoolean("tv"));
		soba.setVelicina(rs.getFloat("velicina"));
		return soba;
	}

}
