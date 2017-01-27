package com.mrvelibor.websistemi2;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mrvelibor.websistemi2.dao.KorisnikDao;
import com.mrvelibor.websistemi2.dao.KorisnikRolaDao;
import com.mrvelibor.websistemi2.dao.SobaDao;
import com.mrvelibor.websistemi2.model.Korisnik;
import com.mrvelibor.websistemi2.model.KorisnikRola;
import com.mrvelibor.websistemi2.model.Soba;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/demo-servlet.xml" })
public class SpringAppTests {

	@Autowired
	protected KorisnikDao korisnikDao;

	@Autowired
	protected KorisnikRolaDao korisnikRolaDao;

	@Autowired
	protected SobaDao sobaDao;

	@Autowired
	private ApplicationContext context;

	@Before
	public void setUp() {

	}

	@Test
	public void addKorisnikTest() {
		Korisnik k = new Korisnik();
		k.setUsername("new_username");
		boolean added = korisnikDao.addKorisnik(k);
		Assert.assertTrue(added);
	}

	@Test
	public void getKorisnikByRoleTest() {
		Korisnik cat = new Korisnik();
		cat.setUsername("user");
		boolean added = korisnikDao.addKorisnik(cat);
		Assert.assertNotNull(cat);
	}

	@Test
	public void createSobaTest() {
		Soba pro = new Soba();
		pro.setBrojKreveta(1);
		pro.setCenaPoDanu(15.5f);
		pro.setKlima(true);
		boolean b = sobaDao.addSoba(pro);
		Assert.assertNotNull(pro);
		Assert.assertTrue(b);
	}

	@Test
	public void getRolaTest() {
		List<KorisnikRola> role = korisnikRolaDao.getAllRola();
		Assert.assertNotNull(role);
		Assert.assertTrue(role.isEmpty());
	}
}
