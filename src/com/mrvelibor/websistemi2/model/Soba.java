package com.mrvelibor.websistemi2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "soba")
public class Soba {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "soba_id")
	private long sobaId;
	@Column(name = "broj_kreveta")
	private int brojKreveta;
	@Column(name = "velicina")
	private float velicina;
	@Column(name = "kupatilo")
	private boolean kupatilo;
	@Column(name = "tv")
	private boolean tv;
	@Column(name = "klima")
	private boolean klima;
	@Column(name = "cena_po_danu")
	private float cenaPoDanu;

	public long getSobaId() {
		return sobaId;
	}

	public void setSobaId(long sobaId) {
		this.sobaId = sobaId;
	}

	public int getBrojKreveta() {
		return brojKreveta;
	}

	public void setBrojKreveta(int brojKreveta) {
		this.brojKreveta = brojKreveta;
	}

	public float getVelicina() {
		return velicina;
	}

	public void setVelicina(float velicina) {
		this.velicina = velicina;
	}

	public boolean getKupatilo() {
		return kupatilo;
	}

	public void setKupatilo(boolean kupatilo) {
		this.kupatilo = kupatilo;
	}

	public boolean getTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean getKlima() {
		return klima;
	}

	public void setKlima(boolean klima) {
		this.klima = klima;
	}

	public float getCenaPoDanu() {
		return cenaPoDanu;
	}

	public void setCenaPoDanu(float cenaPoDanu) {
		this.cenaPoDanu = cenaPoDanu;
	}

}
