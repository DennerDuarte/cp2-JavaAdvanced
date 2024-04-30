package br.com.fiap.lojaBrinquedos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class LojaBrinquedosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaBrinquedosApplication.class, args);
	}

}
