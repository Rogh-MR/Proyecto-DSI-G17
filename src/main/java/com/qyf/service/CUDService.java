package com.qyf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.qyf.model.CustomUserDetails;
import com.qyf.model.Usuario;

public class CUDService implements UserDetailsService {
	@Autowired
	private UsuarioServ service;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario user = service.listarEmail(email);
		if(user == null) {
			throw new UsernameNotFoundException("El usuairo no existe");
		}
		return new CustomUserDetails(user);
	}

}
