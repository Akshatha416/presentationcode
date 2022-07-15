package com.example.demo.Services;


//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("admin".equals(username)) {
			
			Set<SimpleGrantedAuthority> authorities =new HashSet<>();
			authorities.add(new SimpleGrantedAuthority("ROLE_" +"ADMIN") );
			
			
			return new User("admin" ,"{noop}admin@123",authorities );
		}
		

		
		
		
		else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}

