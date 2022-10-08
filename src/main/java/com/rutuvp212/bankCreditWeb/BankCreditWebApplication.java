package com.rutuvp212.bankCreditWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BankCreditWebApplication {

	@RequestMapping("/")
	String home() {
		return "Hello Olya!";
	}

	public static void main(String[] args) { SpringApplication.run(BankCreditWebApplication.class, args); }

}
