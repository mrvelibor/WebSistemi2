package com.mrvelibor.websistemi2;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public String validateUser(LoginBean loginBean) {
		String userName = loginBean.getUserName();
		String password = loginBean.getPassword();
		if (userName.equals("korisnik") && password.equals("korisnik")) {
			return "true";
		} else {
			return "false";
		}
	}
}