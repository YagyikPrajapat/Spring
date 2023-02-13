package com.spring.project.demo.spring;

import com.spring.project.demo.spring.basic.BinarySearch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan //in springboot it is done automatically
public class DemoApplication {

	public static void main(String[] args) {
		//BinarySearch bn=new BinarySearch(new QuickSort());

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(DemoApplication.class);
		BinarySearch bn=applicationContext.getBean(BinarySearch.class);
		System.out.println(bn.binarySearch(new int []{1,2,4}, 4));

	}

}
