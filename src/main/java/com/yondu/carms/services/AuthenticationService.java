package com.yondu.carms.services;

import java.util.Collections;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class AuthenticationService {
	static final long EXPIRATIONTIME=864_000_00;
	static final String SIGNINGKEY="SecretKey";
	static final String PREFIX="Bearer";
	
	//Add token to auth header
	static public void addToken(HttpServletResponse res, String userName) {
		
		String JwtToken=Jwts.builder()
			.setSubject(userName)
			.setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
			.signWith(SignatureAlgorithm.HS512, SIGNINGKEY)
			.compact();
		
		res.addHeader("Authorization", PREFIX+" " +JwtToken);
		res.addHeader("Access-Control-Expose-headers", "Authorization");
		
	}
	
	public static Authentication getAuthentication(HttpServletRequest request){
		String token=request.getHeader("Authorization");
		if(token!=null){
			String user=Jwts.parser()
							.setSigningKey(SIGNINGKEY)
							.parseClaimsJws(token.replace(PREFIX, ""))
							.getBody()
							.getSubject();
			if(user!=null)
				return new UsernamePasswordAuthenticationToken(user, null,Collections.emptyList());
		}
		
		return null;
		
	}
}
