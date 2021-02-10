package com.pruebaMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pruebaMVC.modelo.entidad.Usuario;
import com.pruebaMVC.modelo.persistencia.DaoUsuario;

@SpringBootApplication
public class PruebaMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaMvcApplication.class, args);
		
		ApplicationContext context = SpringApplication.run(PruebaMvcApplication.class, args);
		
		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
	
		Usuario u = new Usuario();
		u.setNombre("pikolo");
		u.setPassword("123456");
		
		du.save(u);
		
	}

}
