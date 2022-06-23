package com.balram.development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PractiseApplication {
	
	@Autowired EmployeeRepository repository;
	
	@Bean
	CommandLineRunner initDatabase() {

		return args -> {
<<<<<<< Updated upstream
			System.out.println("Preloading " + repository.save(new Employee("Balram", "Cheryala")));
			System.out.println("Preloading " + repository.save(new Employee("Examine", "Developer")));
=======
			System.out.println("Started");
			Instant start = Instant.now();
			loop();
			Instant end = Instant.now();
			System.out.println("Ended in seconds " + Duration.between(start, end).getSeconds());
>>>>>>> Stashed changes
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(PractiseApplication.class, args);
	}

}
