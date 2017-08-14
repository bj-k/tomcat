package ch.bj.spring.web.jsf;

import javax.inject.Named;

@Named
public class HelloWorldBean {
	public String getMessage() {
		System.out.println("getMessage called");
		return "Hello World";
	}
}
