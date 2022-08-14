package com.mins.spring.basics.springin5steps;

import com.mins.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.mins.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class); //get bean from context, assign local var

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class); //get bean from context, assign local var

		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao2); //same bean instance because @Scope is default singleton

		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao2.getJdbcConnection()); //same instance of connection because @Scope is default singleton

	}


}
