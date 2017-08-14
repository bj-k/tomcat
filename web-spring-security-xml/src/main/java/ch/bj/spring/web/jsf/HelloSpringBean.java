package ch.bj.spring.web.jsf;

import org.springframework.stereotype.Component;

@Component
public class HelloSpringBean {
	public String getMessage() {
		return "Hello Spring. Xml Config.";
	}
}
