package com.spring.project.demo.spring;

import com.spring.project.demo.spring.cdi.SomeCDIBusiness;
import com.spring.project.demo.spring.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DemoApplicationCdi {

	private static Logger LOGGER =
			LoggerFactory.getLogger(DemoApplicationCdi.class);
	public static void main(String[] args) {

		AnnotationConfigApplicationContext business=
				new AnnotationConfigApplicationContext(DemoApplicationCdi.class);
		LOGGER.info("{}",business);

	}

}
