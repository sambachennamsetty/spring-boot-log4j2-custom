package com.samba.springbootlog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringBootLog4j2Application implements ApplicationRunner {
	private static final Logger logger = LogManager.getLogger(SpringBootLog4j2Application.class);
	
	
	/*@Bean
	public Model model()
	{
		Model m= new Model();
		m.setName("samba");
		return m;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4j2Application.class, args);
	}


	@Override
	public void run(ApplicationArguments applicationArguments) {
		System.out.println("A");
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!{}","A2","A3"	);
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");

	}
}
