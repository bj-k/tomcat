package ch.bj.spring.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans({@ComponentScan("ch.bj.spring.web.jsf"), 
	@ComponentScan("ch.bj.spring.web.config")})
public class SpringConfig {

}
