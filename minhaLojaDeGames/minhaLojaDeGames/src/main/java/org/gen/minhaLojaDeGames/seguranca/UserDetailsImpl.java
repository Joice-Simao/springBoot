package org.gen.minhaLojaDeGames.seguranca;

import java.util.Collection;

import org.gen.minhaLojaDeGames.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetails{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	//construtor
	public UserDetailsImpl(Usuario user) {
		this.username = user.getUsuario();
		this.password = user.getSenha();
	}
	//construtor vazio
	public UserDetailsImpl() {}
	
	//metodos 
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

}