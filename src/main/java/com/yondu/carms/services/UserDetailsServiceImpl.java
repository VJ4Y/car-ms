package com.yondu.carms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yondu.carms.domain.User;
import com.yondu.carms.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User currentUser=userRepository.findByUserName(userName);
		
		UserDetails user=new org.springframework.security.core.userdetails.User( userName, currentUser.getPassword(), 
				true, true, true, true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
		
		return user;
	}
}
