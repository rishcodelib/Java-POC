package com.aggarwal.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		return new User("foo", "foo", new ArrayList<>());
	}
	
}
