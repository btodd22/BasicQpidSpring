package com.example;

import java.util.List;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {
        private static Logger log = LoggerFactory.getLogger(BasicApplication.class);
	
        @Autowired
        private PersonRepository personRepository;
         
        public static void main(String[] args) {
		SpringApplication.run(BasicApplication.class, args);
	}
        
        
        @PostConstruct
    public void setup(){
        log.info("Spring LDAP + Spring Boot Configuration Example");

        List<String> names = personRepository.getAllPersonNames();
        log.info("names: " + names);

        System.exit(-1);
    }
}
