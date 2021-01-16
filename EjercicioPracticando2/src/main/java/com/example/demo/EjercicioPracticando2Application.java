package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.modelo.entidad.Email;
import com.example.demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class EjercicioPracticando2Application {
 
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(EjercicioPracticando2Application.class, args);
		
		Email email1 = context.getBean("email", Email.class);
		
		email1.setDestinatario("Carlos García");
		email1.setRemitente("Pablo López");
		email1.setId(1);
		
		System.out.println(email1);
		
		Email e2 = context.getBean("email2", Email.class);
		
		System.out.println(e2);
		
		Email e3 = context.getBean("email3", Email.class);
		
		System.out.println(e3);
		
		Libro libro = context.getBean("libro", Libro.class);
		libro.getAutor().setEdad(54);
		libro.getAutor().setNombre("Perez Reverte");
		libro.getAutor().setId(1);
		libro.setEditorial("anaya");
		libro.setIsbn("123245234");
		
		System.out.println(libro);
		
		Libro libro2 = context.getBean("libro3", Libro.class);
		
		System.out.println(libro2);
		
	}

}
