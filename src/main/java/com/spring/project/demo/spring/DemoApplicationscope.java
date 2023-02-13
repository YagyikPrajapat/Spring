package com.spring.project.demo.spring;

import com.spring.project.demo.spring.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@ComponentScan("com.spring.project.demo.spring")
public class DemoApplicationscope {

	private static Logger LOGGER =
			LoggerFactory.getLogger(DemoApplicationscope.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(DemoApplicationscope.class);
		PersonDAO personDAO=applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2=applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO2.getJdbcConnection());
		LOGGER.info("{}",personDAO2);

	}

}
