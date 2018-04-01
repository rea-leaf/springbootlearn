package com.chf.springbootlog;



import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringbootLogApplication {
	private static Logger log = Logger.getLogger(SpringbootLogApplication.class);
	public static void main(String[] args) {
		log.info(" log  info");
		log.error(" log  error");
		log.debug(" log  debug");
		SpringApplication.run(SpringbootLogApplication.class, args);

	}
}
