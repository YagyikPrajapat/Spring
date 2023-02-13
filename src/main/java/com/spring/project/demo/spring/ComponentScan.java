package com.spring.project.demo.spring;//import com.spring.project.demo.spring.ComponentScan;
import ComponentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@org.springframework.context.annotation.ComponentScan("ComponentScan")
public class ComponentScan {
    private static Logger LOGGER =
            LoggerFactory.getLogger(ComponentScan.class);

    public static void main(String[] args) {
        //BinarySearch bn=new BinarySearch(new QuickSort());
        //ApplicationContext applicationContext = SpringApplication.run(com.spring.project.demo.spring.ComponentScan.class, args);
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(ComponentScan.class);
        ComponentDAO componentDAO=applicationContext.getBean(ComponentDAO.class);
        ComponentDAO componentDAO2=applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}",componentDAO);
        LOGGER.info("{}",componentDAO.getJdbcConnection());
        LOGGER.info("{}",componentDAO2.getJdbcConnection());
        LOGGER.info("{}",componentDAO2);

    }
}
