package nl.abnamro.demo.RecipeSystem;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@SpringBootApplication
@Configuration


public class RecipeSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeSystemApplication.class, args);
	}

}

@Component
class RecipeCommandLineRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {

	}
}
