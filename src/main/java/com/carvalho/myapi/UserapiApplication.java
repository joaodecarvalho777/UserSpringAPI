package com.carvalho.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carvalho.myapi.domain.Usuario;
import com.carvalho.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class UserapiApplication implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario carvalho = new Usuario(null, "João de Carvalho", "carvalho", "science");
		Usuario hawking = new Usuario(null, "Stephen Hawking", "hawking", "singularity");
		Usuario tesla = new Usuario(null, "Nikola Tesla", "tesla", "alternating_current");
		Usuario newton = new Usuario(null, "Isaac Newton", "newton", "philosophiæ_naturalis_principia_mathematica");
		Usuario einstein = new Usuario(null, "Albert Einstein", "einstein", "theory_of_relativity");
		
		usuarioRepository.saveAll(Arrays.asList(carvalho, hawking, tesla, newton, einstein));
	}
}