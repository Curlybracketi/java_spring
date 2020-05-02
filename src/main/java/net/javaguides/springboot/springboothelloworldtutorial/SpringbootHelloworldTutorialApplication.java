package net.javaguides.springboot.springboothelloworldtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SpringBootApplication
public class SpringbootHelloworldTutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootHelloworldTutorialApplication.class, args);
	}

}
