package com.mrvelibor.websistemi2.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mrvelibor.websistemi2.model.KorisnikRola;

public class KorisnikRolaMapper implements RowMapper<KorisnikRola> {

	@Override
	public KorisnikRola mapRow(ResultSet rs, int rowNum) throws SQLException {
		KorisnikRola rola = new KorisnikRola();
		rola.setRoldeId(rs.getInt("role_id"));
		rola.setRole(rs.getString("role"));
		rola.setUsername(rs.getString("asd"));
		return rola;
	}

}
