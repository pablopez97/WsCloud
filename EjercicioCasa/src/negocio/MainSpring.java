package negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Casa;

public class MainSpring {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Casa casa = context.getBean("casa1", Casa.class);
		System.out.println(casa);
		
	}

}
