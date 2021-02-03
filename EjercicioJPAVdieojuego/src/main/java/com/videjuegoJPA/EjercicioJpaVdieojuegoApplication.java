package com.videjuegoJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.videjuegoJPA.modelo.entidad.Videojuego;
import com.videjuegoJPA.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjercicioJpaVdieojuegoApplication {

	public static void main(String[] args) {
	
		ApplicationContext context = SpringApplication.run(EjercicioJpaVdieojuegoApplication.class, args);
	
		DaoVideojuego daoJuego = context.getBean("daoJuego", DaoVideojuego.class);
		
		//DAMOS DE ALTA UN VIDEOJUEGO EN LA BBDD
		
		Videojuego v1 = new Videojuego();
		v1.setNombre("FIFA Street");
		v1.setCompania("EA Sports");
		v1.setPrecio(60);
		v1.setPuntuacion(9);
		
		Videojuego v2 = new Videojuego();
		v2.setNombre("Forza Horizon 3");
		v2.setCompania("Microsoft");
		v2.setPrecio(60);
		v2.setPuntuacion(8);
		
		daoJuego.save(v1);
		daoJuego.save(v2);
		
		//MODIFICACION DEL JUEGO CON ID = 2
		Videojuego v3 = new Videojuego();
		v3.setId(2);
		v3.setNombre("Forza Horizon 4");
		v3.setCompania("Microsoft");
		v3.setPrecio(70);
		v3.setPuntuacion(8);
		
		//Videojuego v3 = daoJuego.findById(1).get();
		//System.out.println(v3);
		
		//DE ESTA MANERA NOS ASEGURAMOS QUE DE EN EL CASO DE QUE EL JUEGO QUE QUERAMOS
		//OBTENER NO EXISTA NO NOS DE UN NULL POINTER EXCEPTION
		
		Optional<Videojuego> juegoOptional = daoJuego.findById(1);
		
		if(juegoOptional.isPresent()) {
			
			System.out.println("El juego seleccion si existe y tiene de valores:");
			System.out.println(juegoOptional.get());
			
		}else {
			
			System.out.println("El juego selccionado no existe");
			
		}
		
		List<Videojuego> listaVideojuegos = daoJuego.findAll();
		System.out.println(listaVideojuegos);
		
		daoJuego.deleteById(2);
		
		listaVideojuegos = daoJuego.findAll();
		System.err.println(listaVideojuegos);
	}

}
