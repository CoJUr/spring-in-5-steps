package com.mins.spring.basics.springin5steps;

import com.mins.spring.basics.componentscan.ComponentDAO;
import com.mins.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.mins.spring.basics.componentscan") //no bean found exception solved
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class); //get bean from context
		LOGGER.info("{}", componentDAO); //print out bean


	}


}
