package ch.bj.spring.web.jsf;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class HelloSpringBean {
	public String getMessage() {
		return "Hello Spring";
	}
	
	public String getPrincipal() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(authentication.getAuthorities());
		return authentication.getName();
	}
	public String getAuthorities() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getAuthorities().toString();
	}
}
