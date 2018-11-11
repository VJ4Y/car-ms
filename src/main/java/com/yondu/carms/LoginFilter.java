package com.yondu.carms;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yondu.carms.domain.AccountCredentials;
import com.yondu.carms.services.AuthenticationService;

public class LoginFilter extends AbstractAuthenticationProcessingFilter{

	protected LoginFilter(String defaultFilterProcessesUrl,AuthenticationManager authManager) {
		super(new AntPathRequestMatcher(defaultFilterProcessesUrl));
		setAuthenticationManager(authManager);
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
			throws AuthenticationException, IOException, ServletException {
		// TODO Auto-generated method stub
		AccountCredentials creds = new ObjectMapper()
				.readValue(req.getInputStream(), AccountCredentials.class);
		
		return getAuthenticationManager().authenticate(
				new UsernamePasswordAuthenticationToken(
						creds.getUserName(),
						creds.getPassword(), Collections.emptyList()
					)

		);
	}
	@Override
	protected void successfulAuthentication(
		HttpServletRequest req,
		HttpServletResponse res,
		FilterChain chain,Authentication auth)throws IOException,ServletException{
			AuthenticationService.addToken(res, auth.getName());
		
	}
	 
}
