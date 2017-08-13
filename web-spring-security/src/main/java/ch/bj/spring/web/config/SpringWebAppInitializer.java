package ch.bj.spring.web.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;


public class SpringWebAppInitializer extends AbstractSecurityWebApplicationInitializer {
	public SpringWebAppInitializer() {
		super(SecurityConfig.class);
	}
}
