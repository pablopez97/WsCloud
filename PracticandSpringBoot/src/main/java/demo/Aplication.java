package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Pedido;

@SpringBootApplication
public class Aplication {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Aplication.class, args);
		
		Pedido p = context.getBean("pedido", Pedido.class);
	
		System.out.println(p);
	}

}
