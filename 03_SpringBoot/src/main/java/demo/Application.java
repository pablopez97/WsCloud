package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Persona;

//Esta clase de aqui va a ser nuestro punto de entrada de la
//aplicacion

//Esta anotacionde aqui, carga todo el contexto
//de spring y autoconfigura la aplicacion para funcinar

//Por ejemplo, si tu le has dicho en el starte que quieres
//usar una base de datos, si no configuras una base de datos
//Esta anotacion te levanta una base de datos en memoria 
//perfectamente operativa
@SpringBootApplication
public class Application {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		//al ser protypada la persona, siempre que le pidamos
		//una persona al contexto de spring, me va a devolver
		//un objeto nuevo para nuestro disfrute
		Persona p = context.getBean("persona", Persona.class);
		p.setEdad(22);
		
		System.out.println(p);
		
		Persona p2 = context.getBean("persona", Persona.class);
		System.out.println(p2);
	
	}

}
