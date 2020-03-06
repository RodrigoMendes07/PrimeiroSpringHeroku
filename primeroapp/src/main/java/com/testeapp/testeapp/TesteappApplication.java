package com.testeapp.testeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class TesteappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteappApplication.class, args);
	}
	
	@RequestMapping("/home")
	public String index(){
		return "index";
	}
}