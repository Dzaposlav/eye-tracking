package com.example.demo;

import com.example.demo.data.model.Question;
import com.example.demo.data.model.Quiz;
import com.example.demo.data.repository.QuizRepository;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.example.demo.data.model.User;
import com.example.demo.data.repository.UserRepository;

@SpringBootApplication
public class EyeTrackerApplication extends SpringBootServletInitializer{

	private static final Logger log = LoggerFactory.getLogger(EyeTrackerApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EyeTrackerApplication.class);
	}

	public static void main(String[] args) {

		SpringApplication.run(EyeTrackerApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner demo(UserRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (User customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			repository.findById(1L)
//					.ifPresent(customer -> {
//						log.info("Customer found with findById(1L):");
//						log.info("--------------------------------");
//						log.info(customer.toString());
//						log.info("");
//					});
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			// 	log.info(bauer.toString());
//			// }
//			log.info("");
//		};
//	}

}