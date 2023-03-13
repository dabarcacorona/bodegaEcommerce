package cl.corona.bodegaEcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BodegaEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodegaEcommerceApplication.class, args);
	}

}
