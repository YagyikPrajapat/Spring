package com.spring.project.demo.spring;

import com.spring.project.demo.spring.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class DemoApplicationProperties {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext properties =
				new AnnotationConfigApplicationContext(DemoApplicationProperties.class)) {
			SomeExternalService property = properties.getBean(SomeExternalService.class);
			System.out.println(property.getServiceUrl());
		}

	}

}
