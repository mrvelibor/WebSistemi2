package com.mrvelibor.websistemi2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "korisnik_rola")
public class KorisnikRola {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private int roldeId;
	@Column(name = "username", nullable = false)
	private String username;
	@Column(name = "role", nullable = false)
	private String role;
	
	public int getRoldeId() {
		return roldeId;
	}
	
	public void setRoldeId(int roldeId) {
		this.roldeId = roldeId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
}
