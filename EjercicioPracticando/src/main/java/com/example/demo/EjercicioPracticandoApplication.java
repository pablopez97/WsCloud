package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.modelo.entidad.Autor;
import com.example.demo.modelo.entidad.Email;
import com.example.demo.modelo.entidad.Libro;


@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class EjercicioPracticandoApplication {

	public static ApplicationContext context=null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(EjercicioPracticandoApplication.class, args);
		
		Email e1 = context.getBean("email", Email.class);
		e1.setDestinatario("Pablo López García");
		e1.setRemitente("Carlos Garcia");
		e1.setId(1);
		
		System.out.println(e1);
		
		Email e2 = context.getBean("email2", Email.class);
		System.out.println(e2);
		
		Email e3 = context.getBean("email3", Email.class);
		System.out.println(e3);
		
		Libro l1 = context.getBean("libro", Libro.class);
		l1.getAutor().setEdad(43);
		l1.getAutor().setId(1);
		l1.getAutor().setNombre("Cervantes");
		l1.setEditorial("Rama");
		l1.setIsbn("dfsdfsdf423224");
		
		System.out.println(l1);
		
		Libro l2 = context.getBean("libro2", Libro.class);
		System.out.println(l2);
		
		
		
	}
 
}
